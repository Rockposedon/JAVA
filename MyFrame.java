import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
JLabel label1,label2,label3,label4,label5,label6,label7;
JTextField t1,t2,t3,t4;
JRadioButton male,female;
JTextArea ta1;
JComboBox day,month,year;
JCheckBox terms;
JButton submit;
JLabel msg1,msg2;
JTextArea screen;

 public MyFrame(){
setTitle("Regestration Form");
setSize(900,600);
setLocationRelativeTo(null);
setBackground(new Color(70,65,90));
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c= getContentPane();
c.setLayout(null);

label1=new JLabel("Your Name");
label1.setBounds(20,50,100,20);
c.add(label1);

t1=new JTextField();
t1.setBounds(130,50,110,20);
c.add(t1);


label2=new JLabel("Father's Name");
label2.setBounds(20,100,100,20);
c.add(label2);

t2=new JTextField();
t2.setBounds(130,100,110,20);
c.add(t2);


label3=new JLabel("Mobile Number");
label3.setBounds(20,150,100,20);
c.add(label3);

t3=new JTextField();
t3.setBounds(130,150,110,20);
c.add(t3);


label4=new JLabel("Your Email Id");
label4.setBounds(20,200,100,20);
c.add(label4);

t4=new JTextField();
t4.setBounds(130,200,150,20);
c.add(t4);


label5=new JLabel("Gender");
label5.setBounds(20,250,100,20);
c.add(label5);

male =new JRadioButton("Male");
female =new JRadioButton("FeMale");
male.setBounds(130,250,80,20);

female.setBounds(220,250,80,20);
female.setSelected(true);

c.add(male);
c.add(female);

ButtonGroup gen= new ButtonGroup();
gen.add(male);
gen.add(female);


label6=new JLabel("Address");
label6.setBounds(20,300,100,20);
c.add(label6);

ta1=new JTextArea();
ta1.setBounds(130,290,200,50);
c.add(ta1);

terms=new JCheckBox("Please Accept Terms and Conditions !");
terms.setBounds(50,350,300,20);
c.add(terms);

submit=new JButton("Click Me to Submit");
submit.setBounds(120,400,250,20);
c.add(submit);
submit.addActionListener(this);

screen= new JTextArea();
screen.setBounds(350,40,350,350);
c.add(screen);

msg1=new JLabel("");
msg1.setBounds(20,450,250,20);
c.add(msg1);

msg2=new JLabel("By 47_Nandini Shrivastav");
msg2.setBounds(10,500,250,20);
c.add(msg2);








setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(terms.isSelected()){
msg1.setText("Regestration Successfull");
 String   Your_Name=t1.getText();
 String  Fathers_name=t2.getText();
 String  Mobile_Number =t3.getText();
 String  Email=t4.getText();
 String  Gender="Female";
if (male.isSelected()){
Gender="male";
}
String address=ta1.getText();
screen.setText("Name: "+Your_Name+"\n"+"Fathers name: "+Fathers_name +"\n"+"Gender: "+Gender+"\n"+"Mobile Number: "+Mobile_Number+"\n"+"Email: "+Email+"\n"+"Address: " + address);
}
}
}



class RegestrationForm1
{
public static void main(String args[])
{
 MyFrame frame=new MyFrame();
}
}