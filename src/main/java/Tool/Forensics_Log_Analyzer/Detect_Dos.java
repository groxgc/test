package Tool.Forensics_Log_Analyzer;
/**
*
* @author g_chawla
*/
public class Detect_Dos extends javax.swing.JFrame {

   /**
    * Creates new form Detect_Dos
    */
   public Detect_Dos() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       jComboBox1 = new javax.swing.JComboBox<>();
       jLabel4 = new javax.swing.JLabel();
       jLabel5 = new javax.swing.JLabel();
       jComboBox2 = new javax.swing.JComboBox<>();
       jComboBox3 = new javax.swing.JComboBox<>();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jButton3 = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
       jLabel1.setText("DETECT DDOS");

       jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jLabel2.setText("Date:");

       jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jLabel3.setText("Time:");

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apr29", "Apr30" }));

       jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jLabel4.setText("To:");

       jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jLabel5.setText("From:");

       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

       jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

       jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jButton1.setText("DETECT ATTACK");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jButton2.setText("MAIN MENU");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
       jButton3.setText("EXIT");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(0, 243, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addComponent(jLabel1)
                       .addGap(248, 248, 248))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel2)
                                   .addComponent(jLabel3))
                               .addGap(62, 62, 62)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel4)
                                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGap(12, 12, 12)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel5)))
                           .addGroup(layout.createSequentialGroup()
                               .addGap(32, 32, 32)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                       .addGap(233, 233, 233))))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(57, 57, 57)
               .addComponent(jLabel1)
               .addGap(57, 57, 57)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2)
                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(26, 26, 26)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel3)
                   .addComponent(jLabel4)
                   .addComponent(jLabel5))
               .addGap(33, 33, 33)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(63, 63, 63)
               .addComponent(jButton1)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
               .addComponent(jButton2)
               .addGap(18, 18, 18)
               .addComponent(jButton3)
               .addGap(36, 36, 36))
       );

       pack();
   }// </editor-fold>                        

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       //Detect
	   String [] args = new String[3];
       args[0] = jComboBox1.getSelectedItem().toString();
       args[1] = jComboBox2.getSelectedItem().toString();
       args[2] = jComboBox3.getSelectedItem().toString();
       try {
			Attack_Check.main(args);
		} catch (Exception e) {e.printStackTrace();}
       dispose();
   }                                        

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       //Main Menu
		Analysisorder any = new Analysisorder();
		any.setVisible(true);
		dispose();
		String[] args = new String[3];
		args[0] = "output";
		DeleteDir.main(args);
		String[] args2 = new String[3];
		args2[0] = "output2";
		DeleteDir.main(args2);
   }                                        

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       //Exit
		dispose();
		String[] args = new String[3];
		args[0] = "output";
		DeleteDir.main(args);
		String[] args2 = new String[3];
		args2[0] = "output2";
		DeleteDir.main(args2);
   }                                        

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
           java.util.logging.Logger.getLogger(Detect_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(Detect_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(Detect_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(Detect_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Detect_Dos().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JComboBox<String> jComboBox2;
   private javax.swing.JComboBox<String> jComboBox3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   // End of variables declaration                   
}