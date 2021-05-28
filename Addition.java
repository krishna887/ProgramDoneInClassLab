/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.labtask;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author pavilion
 */
public class Addition extends WindowAdapter implements ActionListener{
   
String str1,str2;
int n1,n2,n3;
   Frame f;
   Label l1,l2,l3;
   Button b1,b2;
   TextField t1,t2,t3;
   public Addition(){
       f=new Frame();
       f.setTitle("simple addition");
       f.setSize(400,400 );
       f.setVisible(true);
       f.setLayout(new FlowLayout());
       b1=new Button("Add");
       b2=new Button("Reset");
       b2.setVisible(true);
       b1.setVisible(true);
       b1.setSize(20, 20);
       b2.setSize(20, 20);
       l1=new Label("First Number:");
       l2=new Label("second Number:");
       l3=new Label("Result:");
       t1=new TextField();
       t2=new TextField();
       t3=new TextField();
       f.add(l1);
       f.add(t1);
        f.add(l2);
         f.add(t2);
          f.add(l3);
           f.add(t3);
            f.add(b1);
             f.add(b2);
   
       f.addWindowListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
   }
   public void windowClosing(WindowEvent e){
       f.dispose();
       
   }
   public void actionPerformed(ActionEvent e){
       str1=t1.getText();
       str2=t2.getText();
       n1=Integer.parseInt(str1);
       n2=Integer.parseInt(str2);
       String action=e.getActionCommand();
       if(action=="Add")
       { n3=n1+n2;
       String abc= String.valueOf(n3);
    
       t3.setText(abc);
     
       }
       else if(action=="Reset")
       {
           t1.setText("");
            t2.setText("");
             t3.setText("");
       }
       
       
   }
    public static void main(String[] args) {
        new Addition();
    }
}


