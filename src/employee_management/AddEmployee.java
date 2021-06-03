
package employee_management;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddEmployee implements ActionListener{
    
    JFrame f;
    JLabel lab,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10;
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    JButton btn,btn1;
    AddEmployee(){
        
        f = new JFrame("Add Employee");
        
        f.setBounds(200,60,900,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.WHITE);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee_management/Emp_Image/add_employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel la=new JLabel(i3); 
        la.setBounds(0,0,900,700);
        f.add(la);
        
        
        lab = new JLabel("New Employee Details");
        lab.setBounds(280,50,400,40);
        lab.setFont(new Font("Serif",Font.PLAIN,35));
        lab.setForeground(Color.BLACK);
        la.add(lab);
        
        lab1 = new JLabel("Name");
        lab1.setBounds(50,150,200,30);
        lab1.setFont(new Font("Serif",Font.BOLD,24));
        lab1.setForeground(Color.BLACK);
        la.add(lab1);
        
        lab2 = new JLabel("Age");
        lab2.setBounds(50,210,200,30);
        lab2.setFont(new Font("Serif",Font.BOLD,24));
        lab2.setForeground(Color.BLACK);
        la.add(lab2);
        
        lab3 = new JLabel("Address");
        lab3.setBounds(50,270,200,30);
        lab3.setFont(new Font("Serif",Font.BOLD,24));
        lab3.setForeground(Color.BLACK);
        la.add(lab3);
        
        lab4 = new JLabel("Email ID");
        lab4.setBounds(50,330,200,30);
        lab4.setFont(new Font("Serif",Font.BOLD,24));
        lab4.setForeground(Color.BLACK);
        la.add(lab4);
        
        lab5 = new JLabel("Job Post");
        lab5.setBounds(50,390,200,30);
        lab5.setFont(new Font("Serif",Font.BOLD,24));
        lab5.setForeground(Color.BLACK);
        la.add(lab5);
        
        lab6 = new JLabel("Employee ID");
        lab6.setBounds(50,450,200,30);
        lab6.setFont(new Font("Serif",Font.BOLD,24));
        lab6.setForeground(Color.BLACK);
        la.add(lab6);
        
        lab7 = new JLabel("Father's Name");
        lab7.setBounds(430,150,200,30);
        lab7.setFont(new Font("Serif",Font.BOLD,24));
        lab7.setForeground(Color.BLACK);
        la.add(lab7);
        
        
        
        lab8 = new JLabel("Phone");
        lab8.setBounds(430,210,200,30);
        lab8.setFont(new Font("Serif",Font.BOLD,24));
        lab8.setForeground(Color.BLACK);
        la.add(lab8);
        
        lab9 = new JLabel("Education");
        lab9.setBounds(430,270,200,30);
        lab9.setFont(new Font("Serif",Font.BOLD,24));
        lab9.setForeground(Color.BLACK);
        la.add(lab9);
        
        lab10 = new JLabel("Aadhar No");
        lab10.setBounds(430,330,200,30);
        lab10.setFont(new Font("Serif",Font.BOLD,24));
        lab10.setForeground(Color.BLACK);
        la.add(lab10);
      
       
        txt1 = new JTextField();
        txt1.setBounds(190,150,180,30);
        txt1.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt1);
        
        txt2 = new JTextField();
        txt2.setBounds(190,210,180,30);
        txt2.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt2);
        
        txt3 = new JTextField();
        txt3.setBounds(190,270,180,30);
        txt3.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt3);
        
        txt4 = new JTextField();
        txt4.setBounds(190,330,180,30);
        txt4.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt4);
        
        txt5 = new JTextField();
        txt5.setBounds(190,390,180,30);
        txt5.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt5);
        
        txt6 = new JTextField();
        txt6.setBounds(190,450,180,30);
        txt6.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt6);
         
        txt7 = new JTextField();
        txt7.setBounds(620,150,180,30);
        txt7.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt7);
        
        txt8 = new JTextField();
        txt8.setBounds(620,210,180,30);
        txt8.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt8);
        
        txt9 = new JTextField();
        txt9.setBounds(620,270,180,30);
        txt9.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt9);
        
        txt10 = new JTextField();
        txt10.setBounds(620,330,180,30);
        txt10.setFont(new Font("TAHOMBO",Font.PLAIN,18));
        f.add(txt10);
        
      
        
          btn = new JButton("Back");
          btn.setBounds(200,530,130,35);
          btn.setBackground(Color.BLACK);
          btn.setForeground(Color.WHITE);
          btn.setFont(new Font("TAHOMA",Font.PLAIN,16));
          btn.setCursor(cur);
          btn.addActionListener(this);
          la.add(btn);
         
          btn1 = new JButton("Submit");
          btn1.setBounds(490,532,130,35);
          btn1.setBackground(Color.BLACK);
          btn1.setForeground(Color.WHITE);
          btn1.setFont(new Font("TAHOMA",Font.PLAIN,16));
          btn1.setCursor(cur);
          btn1.addActionListener(this);
          la.add(btn1);
          
       f. setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            f.setVisible(false);
            new EmployeeDetails().setVisible(true);
        }
        
        if(e.getSource() == btn1){
           
            Connection con = DataBase.dbconnect();
            
                String Name =txt1.getText();
                String Age =txt2.getText();
                String Address =txt3.getText();
                String Email =txt4.getText();
                String Jobpost =txt5.getText();
                String Employeeid =txt6.getText();
                String Fathername =txt7.getText();
                String Phone =txt8.getText();
                String Education =txt9.getText();
                String Aadharno =txt10.getText();
            
            
            try {
                 
               
                PreparedStatement pstm =con.prepareStatement("insert into employeedetails(name,age,address,emailid,jobpost,employeeid,fathername,phone,education,aadharno) values(?,?,?,?,?,?,?,?,?,?)");
                pstm.setString(1,Name);
                pstm.setString(2,Age);
                pstm.setString(3,Address);
                pstm.setString(4,Email);
                pstm.setString(5,Jobpost);
                pstm.setString(6,Employeeid);
                pstm.setString(7,Fathername);
                pstm.setString(8,Phone);
                pstm.setString(9,Education);
                pstm.setString(10,Aadharno);
           
                pstm.executeUpdate();
           
                JOptionPane.showMessageDialog(null, "Employee Details Added Successfully..!!");
                
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");
                txt10.setText("");
            
                
                
            } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        
        }
    }
    
    public static void main(String[] args){
        new AddEmployee();
    }

   

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
