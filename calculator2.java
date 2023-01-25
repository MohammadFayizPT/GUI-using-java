 import javax.swing.*;
import java.awt.event.*;
//import java.util.*;
class Calculator implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ad,sub,mul,div,mod,res,ac;
    double result=0,a,b;
    int op;
    Calculator()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
       // b0=new JButton("0");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        ad=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        //mod=new JButton("%");
        res=new JButton("=");
        ac=new JButton("AC");
        t.setBounds(30,40,280,30);
        b0.setBounds(40,100,50,40);
        b1.setBounds(110,100,50,40);
        b2.setBounds(180,100,50,40);
        b3.setBounds(110,310,50,40);
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        b7.setBounds(40,240,50,40);
        b8.setBounds(110,240,50,40);
        b9.setBounds(180,240,50,40);
        ad.setBounds(250,100,50,40); 
        sub.setBounds(250,170,50,40);
        mul.setBounds(250,310,50,40);
        div.setBounds(250,240,50,40);
        ac.setBounds(100,380,100,40);
       // mod.setBounds(30,30,300,300);
        res.setBounds(180,310,50,40);
        f.add(t);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(ad);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(ac);
        //f.add(mod);
        f.add(res);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ad.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        ac.addActionListener(this);
        //mod.addActionListener(this);
        res.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));

        }
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==ad)
        {
            a=Double.parseDouble(t.getText());
            op=1;
            t.setText("+");
        }
        if(e.getSource()==sub)
        {
            a=Double.parseDouble(t.getText());
            op=2;
            t.setText("");
        }
        if(e.getSource()==mul)
        {
            a=Double.parseDouble(t.getText());
            op=3;
            t.setText("");
        }
        if(e.getSource()==div)
        {
            a=Double.parseDouble(t.getText());
            op=4;
            t.setText("");
        } 
        /*if(e.getSource()==mod)
        {
            t.setText(t.getText().concat("4"));
        }*/
        if(e.getSource()==res)
        {
            b=Double.parseDouble(t.getText());
            switch(op)
            {
                case 1:result=a+b;
                break;
                case 2:result=a-b;
                break;
                case 3:result=a*b;
                break;
                case 4:try
                {
                    result=a/b;
                }
                catch(ArithmeticException ae)
                {
                    t.setText("invalid");
                }
                break;
                default:result=0;

            }
            t.setText(""+result);
        }
        if(e.getSource()==ac)
        {
            t.setText("");
        }
    }
}
class Calc
{
    public static void main(String args[])
    {
        Calculator c=new Calculator();
    }
}



