import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Even extends Thread{
    public void run(){
        for(int i=0;i<=100;i+=2){
            System.out.print(i+"\t");
        }
    }
}
public class thrgui extends JFrame implements ActionListener{
    
    Even ev;
    thrgui(Even ev){
        super("Thread GUI");
        this.ev=ev;
        setSize(600,600);
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b=new JButton("Activate");
        b.setForeground(Color.GREEN);
        b.setBackground(getForeground());
        add(b);
       
        b.addActionListener(this);
        setVisible(true);
     }
     public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() != null){
           ev.start();
           JLabel l=new JLabel("Thread Activated");
           l.setForeground(Color.MAGENTA);
           add(l);
        }
     }

     public static void main(String a[]){
        Even ev=new Even();
        new thrgui(ev);
     }
  
}
