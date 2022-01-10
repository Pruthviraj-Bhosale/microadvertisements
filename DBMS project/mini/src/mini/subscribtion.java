
package mini;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;





import javax.swing.JOptionPane;

/**
 *
 * @author prasa
 */
public class subscribtion extends javax.swing.JFrame {
    String user;
    String ad;
   
    Connection con=null;
    PreparedStatement pst=null;
    
    public subscribtion() {
        initComponents();
         
        autoId();
         autoDate();
        EditProfile();
        startDate.getJCalendar().setMinSelectableDate(new java.util.Date());
       
        //autoEndDate();
    }
    
    public void jd()
    {       
     
    }
    
    public void EditProfile()
    {
     String text = "Edit Profile";   
     edit.setText(text);
      edit.setForeground(Color.BLUE.darker());
        edit.setCursor(new Cursor(Cursor.HAND_CURSOR));
         edit.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e)
                 {   
                   login l=new login();
                 try {          
                     Connection con = null;
                     ResultSet rs;
                     
                      
                    
                      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
                     
                      Statement s= con.createStatement();
                      rs=s.executeQuery("select * from advertiser where advertiser_id='"+user+"'");
                      
                     
                       if(rs.next())
                        {
                           UpdateAdvertiser u=new UpdateAdvertiser();
                        
                            String t1=rs.getString("advertiser_id");
                            u.id.setText(t1); 
                       String t2=rs.getString("password");
                        u.pw.setText(t2);
                        String t3=rs.getString("first_name");
                        u.fn.setText(t3);
                        String t4=rs.getString("last_name");
                        u.ln.setText(t4);
                        Date t5=rs.getDate("date_of_birth");
                        u.db.setDate(t5);
                        String t6=rs.getString("email_id");
                        u.em.setText(t6);
                        String t7=rs.getString("bussiness_Cat");
                        u.bc.setSelectedItem(t7);
                        String t8=rs.getString("city");
                        u.ci.setSelectedItem(t8);
                        String t9=rs.getString("mobile");
                        u.mn.setText(t9);
                        
                        
                       
                      u.setVisible(true);
                      dispose();
                       }
                      
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"disconnected");
                 }
            
                     
                     
                 }}
                 
         );
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooserCellEditor1 = new com.toedter.calendar.JDateChooserCellEditor();
        jDateChooserCellEditor2 = new com.toedter.calendar.JDateChooserCellEditor();
        dateChooserPanelBeanInfo1 = new com.toedter.calendar.demo.DateChooserPanelBeanInfo();
        dateChooserPanelBeanInfo2 = new com.toedter.calendar.demo.DateChooserPanelBeanInfo();
        dateChooserPanelBeanInfo3 = new com.toedter.calendar.demo.DateChooserPanelBeanInfo();
        dateUtil1 = new com.toedter.calendar.DateUtil();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sub_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pack = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        startdaterest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subscribtion");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));

        fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Welcome,");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel1.setText("Subscribtion Id :");

        sub_id.setEditable(false);
        sub_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("Subscribe");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Package :");

        pack.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic (3 Moths)", "Standard(6 Months)", " " }));
        pack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });

        jLabel3.setText("Start Date :");

        jLabel4.setText("End Date :");

        startDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        endDate.setEnabled(false);
        endDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        startdaterest.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        startdaterest.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(sub_id, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(startdaterest, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startdaterest)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDateEditor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateEditor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateEditor1ActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed

        autoEndDate();
    }//GEN-LAST:event_packActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String start=null;
        String end=null;
        String u=user;
        

        try {
            String querry;
            querry = "insert into subscription values(?,?,?,?,?,?)";
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            pst=con.prepareStatement(querry);
            pst.setString(1,sub_id.getText());
            pst.setString(2,u);
            //advertise a=new advertise();
            pst.setString(3,ad);
            pst.setString(4, (String) pack.getSelectedItem());
           // java.util.Date date = new java.util.Date();
           // java.util.Date d=(Date) startDate.getDate();
            if(startDate.getDate() !=null || endDate.getDate() !=null)
            {

                SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
                start=dateformat.format(startDate.getDate());
                end=dateformat.format(endDate.getDate());
            }
                     
            pst.setString(5,start);
            
            pst.setString(6,end);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null,"Subscribed");
            autoId();
            autoDate();

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"disconnected");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subscribtion().setVisible(true);
                
               
            }
          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.DateChooserPanelBeanInfo dateChooserPanelBeanInfo1;
    private com.toedter.calendar.demo.DateChooserPanelBeanInfo dateChooserPanelBeanInfo2;
    private com.toedter.calendar.demo.DateChooserPanelBeanInfo dateChooserPanelBeanInfo3;
    private com.toedter.calendar.DateUtil dateUtil1;
    private javax.swing.JLabel edit;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel fname;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooserCellEditor jDateChooserCellEditor1;
    private com.toedter.calendar.JDateChooserCellEditor jDateChooserCellEditor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox pack;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel startdaterest;
    private javax.swing.JTextField sub_id;
    // End of variables declaration//GEN-END:variables

  

private void autoId() 
     {
         try {
       
         con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
          Statement s= con.createStatement();
          
         ResultSet rs;
             rs = s.executeQuery("select max(subscription_id) from subscription");
       
          rs.next();
          rs.getString("max(subscription_id)");
         if(rs.getString("max(subscription_id)")==null)
         {
         sub_id.setText("s001");
         }
         else{
             Long id= Long.parseLong(rs.getString("max(subscription_id)").substring(2,rs.getString("max(subscription_id)").length()));
             id++;
             sub_id.setText("s" + String.format("%03d", id));
         }
                 
      

    } catch (SQLException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, e);
    }


     }

    private void autoDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
            java.util.Date date = new java.util.Date();          
            startDate.setDate(date);
            
}

    private void autoEndDate() {
        String start = null;
       try {
           
            
                SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
                start=dateformat.format(startDate.getDate());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");               
                LocalDate arrival = LocalDate.parse(start, formatter);
                LocalDate futureDay = arrival.plusDays(90);
                String nextDate = futureDay.format(formatter);
                java.util.Date date;       
                date = new SimpleDateFormat("yyyy-MM-dd").parse(nextDate);
                endDate.setDate(date);
            
            if(pack.getSelectedItem()=="Standard(6 Months)")
            {
                //SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
               // start=dateformat.format(startDate.getDate());
               // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");               
               // LocalDate arrival = LocalDate.parse(start, formatter);
                LocalDate future = arrival.plusDays(180);
                String next = future.format(formatter);
                java.util.Date date1;       
                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(next);
                endDate.setDate(date1);
            }
                 
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }//To change body of generated methods, choose Tools | Templates.
    }

}
   




