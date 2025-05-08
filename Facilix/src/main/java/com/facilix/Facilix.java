/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facilix;

import com.facilix.ui.HomeJFrame;
import com.facilix.ui.AdminAddBillsJFrame;


/**
 *
 * @author Raofin
 */
public class Facilix {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeJFrame homeFrame = new HomeJFrame();
                homeFrame.setLocationRelativeTo(null);
                homeFrame.setVisible(true);
//                AdminAddBillsJFrame homeFrame = new AdminAddBillsJFrame();
//                homeFrame.setLocationRelativeTo(null);
//                homeFrame.setVisible(true);
            }
        });
    }
}
