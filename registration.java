import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class registration extends JFrame implements ActionListener{
    JLabel name;
    JLabel address;
    JLabel age;
    JLabel gender;
    JLabel dep;
    JLabel l;

    JTextField tn;
    JTextField ta;

    JTextArea tad;
    JRadioButton m;
    JRadioButton f;
    JComboBox c1;

    JButton sb;

    registration(){
        super("Registration");
        setSize(500,500);
        setLayout(new FlowLayout());

        name=new JLabel("Name:");
        add(name);
        tn=new JTextField(15);
        add(tn);

        address=new JLabel("Address:");
        add(address);
        tad=new JTextArea(5,5);
        add(tad);

        age=new JLabel("Age:");
        add(age);
        ta=new JTextField(10);
        add(ta);

        gender=new JLabel("Gender:");
        add(gender);
        ButtonGroup bg=new ButtonGroup();
        m=new JRadioButton("Male");
        add(m);
        bg.add(m);
        f=new JRadioButton("female");
        add(f);
        bg.add(f);

        dep=new JLabel("Department:");
        add(dep);
        String d[]={"cse","eee","ece","chem","mech"};
        c1=new JComboBox<>(d);
        add(c1);

        JPanel p=new JPanel();
        add(p);

        sb=new JButton("Submit");
        p.add(sb);
        sb.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]){
        new registration();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // TODO Auto-generated method stub

        if(e.getSource()==sb){
            try{
            PrintWriter pw=new PrintWriter("reg.txt");
             pw.println("Name:"+tn.getText());
             pw.println("Age:"+ta.getText());
             pw.println("Address:"+tad.getText());

             String gender,dep;

             if(m.isSelected())
               gender="male";
            else gender="female";

             dep=(String) c1.getSelectedItem();
             pw.println("Gender:"+gender);
             pw.println("Department:"+dep);

             pw.flush();
             pw.close();

             l=new JLabel("You have submitted the form succesfully");
             l.setForeground(Color.GREEN);
             add(l);
            }
             catch(IOException i){
                System.out.println(i);
             }
        }
    }
  
}
