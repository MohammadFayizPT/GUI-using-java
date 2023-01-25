import javax.swing.*;
import java.awt.*;

class Test extends JFrame{
   Test(){
    setTitle("test");
    setSize(500,500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(3);

    JLabel l1=new JLabel("country");
    add(l1);
    String ct[]={"argentina","brazil","india"};
    JComboBox c1=new JComboBox<>(ct);
    add(c1);

    JLabel l2=new JLabel("board");
    add(l2);
    JRadioButton r1=new JRadioButton("cbse");
    JRadioButton r2=new JRadioButton("state");
    JRadioButton r3=new JRadioButton("icse");
    add(r1);
    add(r2);
    add(r3);
    ButtonGroup b=new ButtonGroup();
    b.add(r1);
    b.add(r2);
    b.add(r3);


    setVisible(true);
   }
  public static void main(String a[]){
    new Test();
  }
}
