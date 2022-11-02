import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class StudentForm extends JFrame
{
  JLabel dl,nl,rl,yl;
  JTextField nt,rt;
  JRadioButton r1,r2,r3;
  JPanel p1;
  ButtonGroup bg;
  public StudentForm(){
     dl = new JLabel("Data Entry");
     nl = new JLabel("Name");
     rl = new JLabel("Reg No");
     yl = new JLabel("Year");
     nt = new JTextField(20);
     rt = new JTextField(20);
     r1 = new JRadioButton("2");
     r2 = new JRadioButton("3");
     r3 = new JRadioButton("4");
     bg = new ButtonGroup();
     bg.add(r1);
     bg.add(r2);
     bg.add(r3);
     p1 = new JPanel();
     p1.setLayout(null);
     p1.add(dl); 
     p1.add(nl);
     p1.add(nt);
     p1.add(rl);
     p1.add(rt);
     p1.add(yl);
     p1.add(r1);
     p1.add(r2);
     p1.add(r3);
     dl.setBounds(10,10,100,20);
     nl.setBounds(10,40,50,20);
     nt.setBounds(60,40,100,20);
     rl.setBounds(10,70,50,20);
     rt.setBounds(60,70,100,20);
     yl.setBounds(10,100,50,20);
     r1.setBounds(60,100,40,20);
     r2.setBounds(100,100,40,20);
     r3.setBounds(140,100,40,20);
     add(p1);
  }
  public static void main(String argv[]){
     StudentForm sf = new StudentForm();
     sf.setVisible(true);
     sf.setTitle("Student Form");
     sf.setSize(200,200);
  }

}