/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizproject;

/**
 *
 * @author HP
 */
import static com.mycompany.quizproject.Apti_1.apt;
import static com.mycompany.quizproject.Apti_1.count;
import static com.mycompany.quizproject.Apti_1.count2;
import static com.mycompany.quizproject.Loginpg.username1;
import static com.mycompany.quizproject.Startframe.topic1;
import java.awt.Container;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Apti_2 extends javax.swing.JFrame {

    /**
     * Creates new form Apti_2
     */
    Container c;
    public Apti_2() {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        l5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Q1b = new javax.swing.JRadioButton();
        Q1c = new javax.swing.JRadioButton();
        Q1a = new javax.swing.JRadioButton();
        Q1d = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Q2b = new javax.swing.JRadioButton();
        Q2c = new javax.swing.JRadioButton();
        Q3b = new javax.swing.JRadioButton();
        Q2d = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Q2a = new javax.swing.JRadioButton();
        Q3c = new javax.swing.JRadioButton();
        Q3d = new javax.swing.JRadioButton();
        Q3a = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Q4a = new javax.swing.JRadioButton();
        Q4b = new javax.swing.JRadioButton();
        Q4c = new javax.swing.JRadioButton();
        Q4d = new javax.swing.JRadioButton();
        Q5c = new javax.swing.JRadioButton();
        Q5d = new javax.swing.JRadioButton();
        Q5a = new javax.swing.JRadioButton();
        Q5b = new javax.swing.JRadioButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();

        l5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        l5.setText("5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel2.setText("A sum of ₹15,000 is invested at 8% per annum simple interest. What will be the total interest after 3 years?");

        buttonGroup1.add(Q1b);
        Q1b.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q1b.setText("14");

        buttonGroup1.add(Q1c);
        Q1c.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q1c.setText("16");

        buttonGroup1.add(Q1a);
        Q1a.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q1a.setText("12");

        buttonGroup1.add(Q1d);
        Q1d.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q1d.setText("18");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel3.setText("The sum of three consecutive even numbers is 42. What is the largest number?");

        buttonGroup2.add(Q2b);
        Q2b.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q2b.setText("Rs. 3,200");

        buttonGroup2.add(Q2c);
        Q2c.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q2c.setText("Rs. 3,600");

        buttonGroup3.add(Q3b);
        Q3b.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q3b.setText("Tuesday");

        buttonGroup2.add(Q2d);
        Q2d.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q2d.setText("Rs.4,000");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel4.setText("If January 1, 2023, was a Sunday, what day of the week will it be on January 1, 2024?");

        buttonGroup2.add(Q2a);
        Q2a.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q2a.setText("Rs. 2,400");

        buttonGroup3.add(Q3c);
        Q3c.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q3c.setText("Wednesday");

        buttonGroup3.add(Q3d);
        Q3d.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q3d.setText("Thursday");

        buttonGroup3.add(Q3a);
        Q3a.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q3a.setText("Monday");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel5.setText("Find the missing number in the series: 3, 9, 27, 81, ?  ");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        jLabel6.setText("In a certain code, \"GAME\" is written as \"HCNG.\" How is \"PLAY\" written in that code?");

        buttonGroup4.add(Q4a);
        Q4a.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q4a.setText("QNDZ");

        buttonGroup4.add(Q4b);
        Q4b.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q4b.setText("QNBA");

        buttonGroup4.add(Q4c);
        Q4c.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q4c.setText("QMAZ");
        Q4c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q4cActionPerformed(evt);
            }
        });

        buttonGroup4.add(Q4d);
        Q4d.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q4d.setText("QMBZ");

        buttonGroup5.add(Q5c);
        Q5c.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q5c.setText("324");

        buttonGroup5.add(Q5d);
        Q5d.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q5d.setText("729");

        buttonGroup5.add(Q5a);
        Q5a.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q5a.setText("162");

        buttonGroup5.add(Q5b);
        Q5b.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Q5b.setText("243");

        l1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        l1.setText("6");

        l2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        l2.setText("7");

        l3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        l3.setText("8");

        l4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        l4.setText("9");

        l6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l6.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Q3a)
                        .addGap(46, 46, 46)
                        .addComponent(Q3b)
                        .addGap(54, 54, 54)
                        .addComponent(Q3c)
                        .addGap(46, 46, 46)
                        .addComponent(Q3d))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Q1a)
                        .addGap(80, 80, 80)
                        .addComponent(Q1b)
                        .addGap(97, 97, 97)
                        .addComponent(Q1c)
                        .addGap(103, 103, 103)
                        .addComponent(Q1d))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Q2a)
                        .addGap(38, 38, 38)
                        .addComponent(Q2b)
                        .addGap(52, 52, 52)
                        .addComponent(Q2c)
                        .addGap(60, 60, 60)
                        .addComponent(Q2d))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Q4a)
                        .addGap(54, 54, 54)
                        .addComponent(Q4b)
                        .addGap(74, 74, 74)
                        .addComponent(Q4c)
                        .addGap(78, 78, 78)
                        .addComponent(Q4d, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Q5a)
                        .addGap(71, 71, 71)
                        .addComponent(Q5b)
                        .addGap(88, 88, 88)
                        .addComponent(Q5c)
                        .addGap(103, 103, 103)
                        .addComponent(Q5d)))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q1a)
                    .addComponent(Q1b)
                    .addComponent(Q1c)
                    .addComponent(Q1d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q2a)
                    .addComponent(Q2b)
                    .addComponent(Q2c)
                    .addComponent(Q2d))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q3a)
                    .addComponent(Q3b)
                    .addComponent(Q3c)
                    .addComponent(Q3d))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q4a)
                    .addComponent(Q4b)
                    .addComponent(Q4c)
                    .addComponent(Q4d))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(l6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q5a)
                    .addComponent(Q5b)
                    .addComponent(Q5c)
                    .addComponent(Q5d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        Apti_1 t1=new Apti_1();
        //t1.setVisible(true);
        t1.toFront();
        t1.setState(javax.swing.JFrame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Q4cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q4cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q4cActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int qid=Integer.parseInt(l1.getText());
        String res="";
         if(Q1a.isSelected()==true)
         {
             res=Q1a.getText();
         }
         else if(Q1b.isSelected()==true)
         {
             res=Q1b.getText();
         }
         else if(Q1c.isSelected()==true)
         {
             res=Q1c.getText();
         }
         else if(Q1d.isSelected()==true)
         {
             res=Q1d.getText();
         }
         else if(Q1a.isSelected()==false && Q1b.isSelected() == false && Q1c.isSelected()==false && Q1d.isSelected()==false)
         {
             apt++;
         }
         
         int qid1=Integer.parseInt(l2.getText());
         String res1="";
         
         if(Q2a.isSelected()==true)
         {
             res1=Q2a.getText();
         }
         else if(Q2b.isSelected()==true)
         {
             res1=Q2b.getText();
         }
         else if(Q2c.isSelected()==true)
         {
             res1=Q2c.getText();
         }
         else if(Q2d.isSelected()==true)
         {
             res1=Q2d.getText();
         }
         else if(Q2a.isSelected()==false && Q2b.isSelected() == false && Q2c.isSelected()==false && Q2d.isSelected()==false)
         {
             apt++;
         }
         
         int qid2=Integer.parseInt(l3.getText());
         String res2="";
         if(Q3a.isSelected()==true)
         {
             res2=Q3a.getText();
         }
         else if(Q3b.isSelected()==true)
         {
             res2=Q3b.getText();
         }
         else if(Q3c.isSelected()==true)
         {
             res2=Q3c.getText();
         }
         else if(Q3d.isSelected()==true)
         {
             res2=Q3d.getText();
         }
         else if(Q3a.isSelected()==false && Q3b.isSelected() == false && Q3c.isSelected()==false && Q3d.isSelected()==false)
         {
             apt++;
         }
         
         int qid3=Integer.parseInt(l4.getText());
         String res3="";
         
         if(Q4a.isSelected()==true)
         {
             res3=Q4a.getText();
         }
         else if(Q4b.isSelected()==true)
         {
             res3=Q4b.getText();
         }
         else if(Q4c.isSelected()==true)
         {
             res3=Q4c.getText();
         }
         else if(Q4d.isSelected()==true)
         {
             res3=Q4d.getText();
         }
         else if(Q4a.isSelected()==false && Q4b.isSelected() == false && Q4c.isSelected()==false && Q4d.isSelected()==false)
         {
             apt++;
         }
         
         int qid4=Integer.parseInt(l6.getText());
         String res4="";
         if(Q5a.isSelected()==true)
         {
             res4=Q5a.getText();
         }
         else if(Q5b.isSelected()==true)
         {
             res4=Q5b.getText();
         }
         else if(Q5c.isSelected()==true)
         {
             res4=Q5c.getText();
         }
         else if(Q5d.isSelected()==true)
         {
             res4=Q5d.getText();
         }
         else if(Q5a.isSelected()==false && Q5b.isSelected() == false && Q5c.isSelected()==false && Q5d.isSelected()==false)
         {
             apt++;
         }
         int total=0;
         int tapt=0;
         int c=0;
         try{
            Connection con=ConnectionCode.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Que_ID, Answer from Aptitude");
            while(rs.next())
            {
                if(c>=5 && c<10){
                    int qno=rs.getInt("Que_ID");
                String ans=rs.getString("Answer");
                
                if(qno==qid && res.equals(ans) )
                {
                    count++;
                }
                else if(qno==qid1 && res1.equals(ans))
                {
                    count++;
                }
                 else if(qno==qid2 && res2.equals(ans))
                {
                    count++;
                }
                 else if(qno==qid3 && res3.equals(ans))
                {
                    count++;
                }
                 else if(qno==qid4 && res4.equals(ans))
                {
                    count++;
                }
                else
                 {
                     count2++;
                 }
                }
               c++;
            }
            
            total=count*5;
            tapt=10-apt;
            System.out.println("+ve score="+count);
            System.out.println("-ve score="+count2);
            System.out.println("total="+total);
            System.out.println("Que Attempted="+tapt);
                    
            
        }catch(Exception e)
        {
            System.out.println(" ********** "+e);
        }
         int pc=count;
        int nc=count2;
        int total_marks=total;
        int attempt=tapt;
        String unm1=username1;
        String topic=topic1;
        
        String Spc = Integer.toString(pc);
        String Snc=Integer.toString(nc);
        String Stotal = Integer.toString(total_marks);
        String Satmpt = Integer.toString(attempt);
            
        System.out.println("username"+unm1);
        System.out.println("topic"+topic);
        try{
            Connection con=ConnectionCode.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into report values('"+unm1+"','"+attempt+"','"+pc+"','"+nc+"','"+total_marks+"','"+topic+"')");
            System.out.println("Records Inserted successfully");
            
            
        }catch(Exception e)
        {
            System.out.println(" ********** "+e);
        }
        this.dispose();
        Report ob=new Report(Spc,Snc,Stotal,Satmpt);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Apti_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apti_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apti_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apti_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Apti_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Q1a;
    private javax.swing.JRadioButton Q1b;
    private javax.swing.JRadioButton Q1c;
    private javax.swing.JRadioButton Q1d;
    private javax.swing.JRadioButton Q2a;
    private javax.swing.JRadioButton Q2b;
    private javax.swing.JRadioButton Q2c;
    private javax.swing.JRadioButton Q2d;
    private javax.swing.JRadioButton Q3a;
    private javax.swing.JRadioButton Q3b;
    private javax.swing.JRadioButton Q3c;
    private javax.swing.JRadioButton Q3d;
    private javax.swing.JRadioButton Q4a;
    private javax.swing.JRadioButton Q4b;
    private javax.swing.JRadioButton Q4c;
    private javax.swing.JRadioButton Q4d;
    private javax.swing.JRadioButton Q5a;
    private javax.swing.JRadioButton Q5b;
    private javax.swing.JRadioButton Q5c;
    private javax.swing.JRadioButton Q5d;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables
}
