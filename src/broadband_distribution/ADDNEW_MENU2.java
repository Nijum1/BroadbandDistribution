/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broadband_distribution;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ishfaq
 */
public class ADDNEW_MENU2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADDNEW_MENU2
     */
    public ADDNEW_MENU2() {
        initComponents();
        hide.setVisible(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM NewUser";

            //  String sql= "SELECT tomer.cPhoneNo From bill INNER JOIN customer ON bill.customerId=customer.customerId ";
            ResultSet resultSet = statement
                    .executeQuery(sql);

            while (resultSet.next()) {

                //String Bid = resultSet.getString("billId");
                String Cid = resultSet.getString("userId");
                String pckg = resultSet.getString("pNo");
                String name = resultSet.getString("nName");
                String phnNo = resultSet.getString("contactNo");
                String address = resultSet.getString("adress");
                String mail = resultSet.getString("email");
                String stat = resultSet.getString("status");
                Date d = resultSet.getDate("date");
                String da = d.toString();
                String tData[] = {Cid, pckg, name, phnNo, address, mail, stat, da};
                DefaultTableModel tbm1 = (DefaultTableModel) newTable.getModel();
                tbm1.addRow(tData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        hide = new javax.swing.JPanel();
        userId = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        phnNo = new javax.swing.JTextField();
        pkge = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dDate = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Package  No", "Name", "Contact No", "Address", "Email", "Status", "Date"
            }
        ));
        newTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(newTable);

        jButton1.setBackground(new java.awt.Color(0, 203, 133));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("ACTIVATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(0, 203, 133));
        Refresh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hideLayout = new javax.swing.GroupLayout(hide);
        hide.setLayout(hideLayout);
        hideLayout.setHorizontalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hideLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hideLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(hideLayout.createSequentialGroup()
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(hideLayout.createSequentialGroup()
                                .addComponent(pkge, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        hideLayout.setVerticalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pkge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(hide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(78, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel tbm1 = (DefaultTableModel) newTable.getModel();

        String uID = tbm1.getValueAt(newTable.getSelectedRow(), 0).toString();

        String pNo = tbm1.getValueAt(newTable.getSelectedRow(), 1).toString();
        String nam = tbm1.getValueAt(newTable.getSelectedRow(), 2).toString();
        String cNo = tbm1.getValueAt(newTable.getSelectedRow(), 3).toString();
        String add = tbm1.getValueAt(newTable.getSelectedRow(), 4).toString();
        String email = tbm1.getValueAt(newTable.getSelectedRow(), 5).toString();

        String s = tbm1.getValueAt(newTable.getSelectedRow(), 6).toString();

        String d = tbm1.getValueAt(newTable.getSelectedRow(), 7).toString();

        userId.setText(uID);
        pkge.setText(pNo);

        name.setText(nam);
        phnNo.setText(cNo);
        address.setText(add);
        mail.setText(email);
        stat.setText(s);
        dDate.setText(d);


    }//GEN-LAST:event_newTableMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tbm = (DefaultTableModel) newTable.getModel();
                tbm.setRowCount(0);  
  try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM NewUser";

            //  String sql= "SELECT tomer.cPhoneNo From bill INNER JOIN customer ON bill.customerId=customer.customerId ";
            ResultSet resultSet = statement
                    .executeQuery(sql);

            while (resultSet.next()) {

                //String Bid = resultSet.getString("billId");
                String Cid = resultSet.getString("userId");
                String pckg = resultSet.getString("pNo");
                String name = resultSet.getString("nName");
                String phnNo = resultSet.getString("contactNo");
                String address = resultSet.getString("adress");
                String mail = resultSet.getString("email");
                String stat = resultSet.getString("status");
                Date d = resultSet.getDate("date");
                String da = d.toString();
                String tData[] = {Cid, pckg, name, phnNo, address, mail, stat, da};
                DefaultTableModel tbm1 = (DefaultTableModel) newTable.getModel();
                tbm1.addRow(tData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
  
    }//GEN-LAST:event_RefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          
        
       String tname= name.getText();
       String temail= mail.getText();
            String taddress =address.getText();
       
      String tNo= phnNo.getText();
      
      String p=pkge.getText();
    
      String stu=  stat.getText();
      String date=  dDate.getText();
         String price= "", id="",pack="";
         String m="Cash", s="Due";
         
         String st="Not", ps="Yet";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

                Statement statement = connection.createStatement();

                ResultSet resultSet1 = statement.executeQuery("Select pName,price_Per_month from pakages where pNo= ('" + Integer.parseInt(p) + "');" );
                  if (resultSet1.next()) {
                 price = resultSet1.getString("price_Per_month");
                pack = resultSet1.getString("pName");
                  }
                
                
                String sql = "INSERT INTO customer VALUES ('" + tname + "','" + temail + "','" + taddress + "','" + Integer.parseInt(tNo) + "','"+pack+"')";

                PreparedStatement prepare = connection.prepareStatement(sql);

                prepare.executeUpdate();
                
                
                
                 ResultSet resultSet = statement.executeQuery("Select customerId from customer where cPhoneNo= ('" + Integer.parseInt(tNo) + "');" );
                       if (resultSet.next()) {
                           
                      id = resultSet.getString("customerId");
                      
                      
                      
                      String sql44 = "INSERT INTO helpline VALUES ('" +  Integer.parseInt(id) + "','" + st + "','" + ps + "')";

                PreparedStatement prepare44 = connection.prepareStatement(sql44);

                prepare44.executeUpdate();
      
      java.sql.Date todaysDate = new java.sql.Date(new java.util.Date().getTime());
      int futureDay =31;
        int pastDay=2;

        java.sql.Date futureDate = this.addDays(todaysDate, futureDay);
      
                    String sql2 = "INSERT INTO bill VALUES ('" + Integer.parseInt(id) + "','" +Integer.parseInt(price)+ "','" +futureDate +"','"+m+"','"+s+"')";
                      PreparedStatement prepare2 = connection.prepareStatement(sql2);
                            prepare2.executeUpdate();
                 // }
                       }
                
                DefaultTableModel tbm = (DefaultTableModel) newTable.getModel();
             //   tbm.setRowCount(0);
                //  show user();

             //   JOptionPane.showMessageDialog(this, "Inserted Successfully.");

                
           String tname1 = "", temail1 = "", taddress1 = "", customerId1 = "";
        int tNo1;
        DefaultTableModel defaultTableModel = (DefaultTableModel) newTable.getModel();

        if (newTable.getSelectedRowCount() == 1) {

        

            int row = newTable.getSelectedRow();
            customerId1 = defaultTableModel.getValueAt(row, 0).toString();

            
                if (name.equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Name");

                } else {

                    Statement statement1 = connection.createStatement();

                    String sql33 = "DELETE FROM NewUser WHERE userId = " + Integer.parseInt(customerId1) + ";";

                    PreparedStatement prepare33 = connection.prepareStatement(sql33);

                    prepare33.executeUpdate();
                     DefaultTableModel tbm3 = (DefaultTableModel) newTable.getModel();
                tbm3.setRowCount(0);

                    JOptionPane.showMessageDialog(this, "Activated Successfully");

                }
                

        } else {
            if (newTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty");

            } else {
                JOptionPane.showMessageDialog(this, "Please select a row for delete. ");
            }

        }
                
                
                
                
                
                
                
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField address;
    private javax.swing.JTextField dDate;
    private javax.swing.JPanel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTable newTable;
    private javax.swing.JTextField phnNo;
    private javax.swing.JTextField pkge;
    private javax.swing.JTextField stat;
    private javax.swing.JTextField userId;
    // End of variables declaration//GEN-END:variables

    private Date addDays(Date date, int days) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //public static Date addDays(Date date, int days) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        c1.add(Calendar.DATE, days);
        return new Date(c1.getTimeInMillis());
  //  }
    }
}
