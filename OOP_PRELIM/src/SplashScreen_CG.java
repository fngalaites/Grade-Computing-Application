
import java.awt.SplashScreen;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan G. Carpio
 */
public class SplashScreen_CG extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen_CG
     */
    public SplashScreen_CG() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        LoadingL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Loadingval = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/patts.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 310, -1));
        jPanel2.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 870, 40));

        LoadingL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        LoadingL.setForeground(new java.awt.Color(255, 255, 255));
        LoadingL.setText("Loading ....");
        jPanel2.add(LoadingL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PATTS College of Aeronautics");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 610, 90));

        Loadingval.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Loadingval.setForeground(new java.awt.Color(255, 255, 255));
        Loadingval.setText("jLabel4");
        jPanel2.add(Loadingval, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(SplashScreen_CG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen_CG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen_CG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen_CG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
      //      public void run() {
      //          new SplashScreen_CG().setVisible(true);
       //     }
       // });
       
        SplashScreen_CG s = new SplashScreen_CG();

        s.setVisible(true);
        try{
       
        for(int i = 0; i <= 100; i++){
            
                Thread.sleep(80);
                s.Loadingval.setText(i + "%");
                
               if(i==10){
                   s.LoadingL.setText("Turning on Modules...");
               }
                 
               if(i==20){
                   s.LoadingL.setText("Loading on Modules...");
               }
                 
               if(i==50){
                   s.LoadingL.setText("Connecting to Database...");
               }
               if(i==70){
                   s.LoadingL.setText("Connection Successful!!!");
               }
               if(i==80){
                   s.LoadingL.setText("Launching Application...");
               }
               s.jProgressBar1.setValue(i);
               
            if(i==100){
            Login_form_CG x = new Login_form_CG();
                x.setVisible(true);
                s.setVisible(false);
        }
               
        }
               
            } catch (Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    
                    }   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingL;
    private javax.swing.JLabel Loadingval;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
