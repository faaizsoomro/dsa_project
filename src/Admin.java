
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setBackground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(183, 83));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Hollywood Hills", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Attendance Management system");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(240, 60, 520, 37);

        jButton8.setText("Log Out");
        jPanel2.add(jButton8);
        jButton8.setBounds(890, 130, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 160);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        jButton1.setText("Add Course");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(430, 350, 150, 35);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(189, 60, 387, 40);

        jButton7.setText("Add in List");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(430, 120, 150, 40);

        jScrollPane2.setViewportView(list);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(190, 190, 390, 130);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(240, 160, 760, 460);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Hollywood Hills", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 255));
        jButton3.setText("View Attendance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(0, 180, 240, 90);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Hollywood Hills", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 51, 255));
        jButton4.setText("ADD COURSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 0, 240, 90);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Hollywood Hills", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 51, 255));
        jButton5.setText("Register Student");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 90, 240, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 160, 240, 460);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(null);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(140, 100, 360, 40);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(140, 190, 360, 40);

        jButton2.setText("Register Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(350, 270, 150, 50);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(240, 160, 760, 460);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(120, 30, 520, 30);

        jButton6.setText("View Attendance");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(470, 110, 170, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(120, 190, 510, 200);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(240, 160, 760, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        while (!q.isEmpty()) {
            String x = q.remove();
            resultList.remove(0);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Confirm to Register courses "+ x, "Confirmation", dialogButton);
            if (dialogResult == 0) {
                Write obj = new Write();
                if (x != null) {
                    try {
                        obj.FileCreate(x);
                        obj.FileCreate(x+"_A");
                        obj.FileWrite("Courses", x);
                        obj.FileWrite(x+"_A","Name,Attendance"+"\n");
                    } catch (IOException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed
            }
            jTextField1.setText("");
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jComboBox1.removeAllItems();
        String s;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\Courses.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while ((s = br.readLine()) != null) {
                jComboBox1.addItem(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = (String) jComboBox1.getSelectedItem();
        String x = jTextField2.getText();
        Write obj = new Write();
        try {
            obj.FileWrite(s, x);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
        jComboBox2.removeAllItems();
        String s;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\Courses.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while ((s = br.readLine()) != null) {
                jComboBox2.addItem(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int n=model.getRowCount();
        for(int j=0;j<n;j++){
        model.removeRow(0);}
        try {
            /* String filePath="D:\\Attendance.txt";
            File filepath=new File(filepath);
            */
            
            
            String s=(String) jComboBox2.getSelectedItem();
            BufferedReader br=new BufferedReader(new FileReader("D:\\"+s+"_A.txt"));
            String firstLine=br.readLine().trim();
            String[] columnNames=firstLine.split(",");
            
            model.setColumnIdentifiers(columnNames);
            
            Object[] TableLine=br.lines().toArray();
            
            for(int i=0;i<TableLine.length;i++)
            {     
             String Line =TableLine[i].toString().trim();
            String [] Rowdata=Line.split("/");
            model.addRow(Rowdata);
            
            
            
            }    
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed
    Queue q = new Queue();
    DefaultListModel resultList = new DefaultListModel();

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        q.insert(jTextField1.getText());
        list.setModel(resultList);
        resultList.addElement(q.peekRear());
        jTextField1.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> list;
    // End of variables declaration//GEN-END:variables
}
