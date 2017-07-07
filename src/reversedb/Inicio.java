/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedb;

import com.jidesoft.icons.JideIconsFactory;
import com.jidesoft.pane.OutlookTabbedPane;
import com.jidesoft.status.*;
import com.jidesoft.swing.JideBoxLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author israel
 */
public class Inicio extends javax.swing.JFrame {

    private Timer _timer;
    private OutlookTabbedPane _tabbedPane;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
//        com.jidesoft.utils.Lm.verifyLicense("Visual Paradigm International Ltd.", "Visual Paradigm for UML", "f5uKXT9Z.kM3cm.EbmYQEbwmkfQ8xK52");
        com.jidesoft.utils.Lm.verifyLicense("DbVis Software AB", "DbVisualizer", "3IvA8p0fOy8ReAXD.T8gNY:K0l3fLM21");
        initComponents();
        
        StatusBar statusBar = createStatusBar();
        _tabbedPane = createOutlookTabbedPane();
        this.add(statusBar, BorderLayout.SOUTH);
        this.add(_tabbedPane, BorderLayout.CENTER);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private StatusBar createStatusBar() {
        // setup status bar
        StatusBar statusBar = new StatusBar();
        final ProgressStatusBarItem progress = new ProgressStatusBarItem();
        progress.setCancelCallback(new ProgressStatusBarItem.CancelCallback() {
            public void cancelPerformed() {
                _timer.stop();
                _timer = null;
                progress.setStatus("Cancelled");
                progress.showStatus();
            }
        });
        statusBar.add(progress, JideBoxLayout.VARY);
        ButtonStatusBarItem button = new ButtonStatusBarItem("READ-ONLY");
        button.setIcon(JideIconsFactory.getImageIcon(JideIconsFactory.SAVE));
        button.setPreferredWidth(20);
        statusBar.add(button, JideBoxLayout.FLEXIBLE);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (_timer != null && _timer.isRunning()) {
                    return;
                }
                _timer = new Timer(100, new ActionListener() {
                    int i = 0;

                    public void actionPerformed(ActionEvent e) {
                        if (i == 0) {
                            progress.setProgressStatus("Initializing ......");
                        }
                        if (i == 10) {
                            progress.setProgressStatus("Running ......");
                        }
                        if (i == 90) {
                            progress.setProgressStatus("Completing ......");
                        }
                        progress.setProgress(i++);
                        if (i > 100) {
                            _timer.stop();
                        }
                    }
                });
                _timer.start();
            }
        });

        final LabelStatusBarItem label = new LabelStatusBarItem("Line");
        label.setText("100:42");
        label.setAlignment(JLabel.CENTER);
        statusBar.add(label, JideBoxLayout.FLEXIBLE);

        final OvrInsStatusBarItem ovr = new OvrInsStatusBarItem();
        ovr.setPreferredWidth(100);
        ovr.setAlignment(JLabel.CENTER);
        statusBar.add(ovr, JideBoxLayout.FLEXIBLE);

        final TimeStatusBarItem time = new TimeStatusBarItem();
        statusBar.add(time, JideBoxLayout.FLEXIBLE);
        final MemoryStatusBarItem gc = new MemoryStatusBarItem();
        statusBar.add(gc, JideBoxLayout.FLEXIBLE);

        return statusBar;
    }

    private OutlookTabbedPane createOutlookTabbedPane() {
        _tabbedPane = new OutlookTabbedPane();
        _tabbedPane.setTabPlacement(OutlookTabbedPane.TOP);
        _tabbedPane.addTab("titulo", null, new JButton("Panel"), "tooltip for titulo");
        _tabbedPane.addTab("titulo 2", null, new JProgressBar(), "tooltip for titulo 2");
        return _tabbedPane;
    }
}
