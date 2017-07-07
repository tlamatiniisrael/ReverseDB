/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedb;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author israel
 */
public class GenerateTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        ResultSet res = null;
        ResultSet resPK = null;
        ResultSet resColumnas = null;
        ResultSet resPrivTabla = null;
        ResultSet resPrivCols = null;
        List<String> pks = new LinkedList<>();
        List<String> cols = new LinkedList<>();
        String tabla = "TET_CONTROL_TRAMITE"; //TET_PREREQUISITOS";  //"LIQUIDACION_WEB";
        String esquema = "SIR7_ING"; //"PRUEBAS";  // "CTRLVEH5W"
        SqlCRUDRequests gen = null;
        Statement stmt= null;
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            //con = DriverManager.getConnection("jdbc:oracle:thin:@192.151.112.178:1521:desarrollo16", "biisrael", "biisrael");
            //con = DriverManager.getConnection("jdbc:oracle:thin:@192.151.112.184:1521:xe", "pruebas", "pruebas");
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.151.112.184:1521:xe", "sir7_ing", "sir7_ing");

            DatabaseMetaData meta = con.getMetaData();

            // NUMERO CONCURRENTE DE CONEXIONES
            System.out.println("CONEXIONES CONCURRENTES " + meta.getMaxConnections());
            res = meta.getTables(null, esquema, tabla,
                    new String[]{"TABLE"});
            System.out.println("List of tables: ");
            while (res.next()) {
                System.out.println("***** TABLA "
                        + "   " + res.getString("TABLE_CAT")
                        + ", " + res.getString("TABLE_SCHEM")
                        + ", " + res.getString("TABLE_NAME")
                        + ", " + res.getString("TABLE_TYPE")
                        + ", " + res.getString("REMARKS"));
                resPrivTabla = meta.getTablePrivileges(null, null, res.getString("TABLE_NAME"));
                System.out.println("PRIVILEGIOS");
                while (resPrivTabla.next()) {
                    System.out.println(resPrivTabla.getString("GRANTOR")
                            + ", " + resPrivTabla.getString("PRIVILEGE"));
                }
                resPrivTabla.close();
                System.out.println("LLAVE PRIMARIA");
                resPK = meta.getPrimaryKeys(null, null, res.getString("TABLE_NAME"));
                while (resPK.next()) {
                    pks.add(resPK.getString("COLUMN_NAME"));
                    System.out.println(
                            "   " + resPK.getString("TABLE_CAT")
                            + ", " + resPK.getString("TABLE_SCHEM")
                            + ", " + resPK.getString("TABLE_NAME")
                            + ", " + resPK.getString("COLUMN_NAME")
                            + ", " + resPK.getString("KEY_SEQ")
                            + ", " + resPK.getString("PK_NAME"));
                }
                resPK.close();

                System.out.println("COLUMNAS");
                int attibutesCount=0;
                try {
                    stmt= con.createStatement();
                    resColumnas = stmt.executeQuery("select * from " + res.getString("TABLE_NAME"));
                    attibutesCount = resColumnas.getMetaData().getColumnCount();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error getting data",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                for (int i = 1; i <= attibutesCount; i++) {
                    try {
                        cols.add(resColumnas.getMetaData().getColumnName(i));
                        System.out.println("   " + resColumnas.getMetaData().getColumnName(i)
                        +", "+ resColumnas.getMetaData().getColumnTypeName(i)
                        +", "+ resColumnas.getMetaData().getColumnClassName(i));
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                /*
                resColumnas = meta.getColumns(null, null, res.getString("TABLE_NAME"), null);
                while (resColumnas.next()) {
                    cols.add(resColumnas.getString("COLUMN_NAME"));
                    System.out.println(
                            "   " + resColumnas.getString("TABLE_SCHEM")
                            + ", " + resColumnas.getString("TABLE_NAME")
                            + ", " + resColumnas.getString("COLUMN_NAME")
                            + ", " + resColumnas.getString("DATA_TYPE")
                            + ", " + resColumnas.getString("TYPE_NAME")
                            + ", " + resColumnas.getString("COLUMN_SIZE")
                            + ", " + resColumnas.getString("DECIMAL_DIGITS")
                            + ", " + resColumnas.getString("COLUMN_DEF")
                            + ", " + resColumnas.getString("SOURCE_DATA_TYPE")
                            + ", " + resColumnas.getString("IS_AUTOINCREMENT")
                    //+ ", " + resColumnas.getString("IS_GENERATEDCOLUMN")
                    );
//////                    resPrivCols = meta.getColumnPrivileges(null, null, resColumnas.getString("TABLE_NAME"), resColumnas.getString("COLUMN_NAME"));
//////                    while (resPrivCols.next()) {
//////                        System.out.print(
//////                                " (" + resPrivCols.getString("GRANTOR")
//////                                + ", " + resPrivCols.getString("PRIVILEGE")
//////                                + "   )"
//////                        );
//////                    }
//////                    resPrivCols.close();
                }
                resColumnas.close();
                 */

            }
            res.close();
            // crea las rutins de freemarker

            cols.removeAll(pks);
            gen = new SqlCRUDRequests(tabla, pks.toArray(new String[0]), cols.toArray(new String[0]));
            System.out.println(gen.getSqlSelect());
            System.out.println(gen.getSqlInsert());
            System.out.println(gen.getSqlUpdate());
            System.out.println(gen.getSqlExists());
            try {
                System.out.println("******* CONFIGURANDO PLANTILLA");
                Configuration cfg = new Configuration();
                cfg.setDirectoryForTemplateLoading(new File("/home/israel/NetBeansProjects/ReverseDB/src/reversedb"));
                //cfg.setClassForTemplateLoading(org.diad.documentacion.plantillas.plantilla.class, "");
                cfg.setObjectWrapper(new DefaultObjectWrapper());
                cfg.setDefaultEncoding("UTF-8");
                cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                System.out.println("******* TRAE OBJETO A MOSTRAR");
                String cu = "liquidacion";

                Map root = new HashMap();
                root.put("entidad", tabla);
                root.put("pks", pks);
                root.put("cols", cols);
                System.out.println("******* OBJETO A MOSTRAR");
                System.out.println(cu.toString());
                Template temp = null;
                temp = cfg.getTemplate("nbean.ftl");

                System.out.println("******* ESCRIBIENDO PLANTILLA");
                // For the sake of example, also write output into a file:
                Writer fileWriter = new FileWriter(new File("/home/israel/" + cu + ".java"));
                try {
                    temp.process(root, fileWriter);
                } finally {
                    fileWriter.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (TemplateException ex) {
                ex.printStackTrace();
            }

        } catch (java.lang.ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: "
                    + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: "
                    + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(GenerateTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void ejemplo() {

//        jdbc:        oracle:        thin:        sir7_ing / sir7_ing@192.151.112.184:1521:xe
    }

}
