/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author israel
 */
public class ReverseDB {

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
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.151.112.178:1521:desarrollo16", "ctrlveh5w", "ctrlveh5w");

            DatabaseMetaData meta = con.getMetaData();

            // NUMERO CONCURRENTE DE CONEXIONES
            System.out.println("CONEXIONES CONCURRENTES " + meta.getMaxConnections());
            res = meta.getTables(null, "CTRLVEH5W", null,
                    new String[]{"SYNONYM"});
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
                resColumnas = meta.getColumns(null, null, res.getString("TABLE_NAME"), null);
                while (resColumnas.next()) {
                    System.out.println(
                            "   " + resColumnas.getString("TABLE_NAME")
                            + ", " + resColumnas.getString("COLUMN_NAME")
                            + ", " + resColumnas.getString("DATA_TYPE")
                            + ", " + resColumnas.getString("TYPE_NAME")
                            + ", " + resColumnas.getString("COLUMN_SIZE")
                            + ", " + resColumnas.getString("DECIMAL_DIGITS")
                            + ", " + resColumnas.getString("COLUMN_DEF")
                            + ", " + resColumnas.getString("SQL_DATA_TYPE")
                    //+ ", " + resColumnas.getString("IS_AUTOINCREMENT")
                    );
                    resPrivCols = meta.getColumnPrivileges(null, null, resColumnas.getString("TABLE_NAME"), resColumnas.getString("COLUMN_NAME"));
                    while (resPrivCols.next()) {
                        System.out.print(
                                " (" + resPrivCols.getString("GRANTOR")
                                + ", " + resPrivCols.getString("PRIVILEGE")
                                + "   )"
                        );
                    }
                    resPrivCols.close();
                }
                resColumnas.close();
            }
            res.close();
        } catch (java.lang.ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: "
                    + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: "
                    + e.getMessage());
        }

    }

}
