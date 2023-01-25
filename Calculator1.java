import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 class Calculator1 extends JFrame implements ActionListener{
   JLabel fno;
   JLabel sno;
   JLabel res;
   JButton plus;
   JButton minus;
   JButton mul;
   JButton mod; 
   JTextField t1;
   JTextField t2;
   JTextField t3;

   Calculator1(){

    super("Calculator");
    setSize(350,350);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(3);

    fno=new JLabel("First number:");
    add(fno);
    fno.setForeground(Color.BLUE);
    t1=new JTextField(10);
    add(t1);

    sno=new JLabel("Second number:");
    add(sno);
    sno.setForeground(Color.BLUE);
    t2=new JTextField(10);
    add(t2);

    res=new JLabel("Result:");
    add(res);
    res.setForeground(Color.BLUE);
    t3=new JTextField(10);
    add(t3);    
   
    plus=new JButton("+");
    add(plus);
    minus=new JButton("-");
    add(minus);
    mul=new JButton("*");
    add(mul);
    mod=new JButton("%");
    add(mod);

    plus.addActionListener(this);
    minus.addActionListener(this);
    mul.addActionListener(this);
    mod.addActionListener(this);

    setVisible(true);
   }

   public void actionPerformed(ActionEvent e){
     int fno=Integer.parseInt(t1.getText());
     int sno=Integer.parseInt(t2.getText());

     if(e.getSource()==plus){
      int res=fno+sno;
      t3.setText(""+res);
     }
     else if(e.getSource()==minus){
      int res=fno-sno;
      t3.setText(""+res);
     }
     else if(e.getSource()==mul){
      int res=fno*sno;
      t3.setText(""+res);
     }
     else if(e.getSource()==mod){
      int res=fno%sno;
      t3.setText(""+res);
     }
     
   }
   public static void main(String args[]){
     Calculator1 ca=new Calculator1();
   }

 }
