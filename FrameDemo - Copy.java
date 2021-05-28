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
public class FrameDemo  extends WindowAdapter implements ActionListener{
   Frame f;
   Label l;
   Button b;
   public FrameDemo(){
       f=new Frame();
       f.setTitle("frame demo");
       f.setSize(400,400 );
       f.setVisible(true);
       f.setLayout(new FlowLayout());
       b=new Button("click me");
       
       b.setVisible(true);
       b.setSize(20, 20);
       l=new Label("display");
       f.add(b);
       f.add(l);
       f.addWindowListener(this);
       b.addActionListener(this);
   }
   public void windowClosing(WindowEvent e){
       f.dispose();
       
   }
   public void actionPerformed(ActionEvent e){
       l.setSize(100,150);
       l.setText("you clicked me");
       
   }
    public static void main(String[] args) {
        new FrameDemo();
    }
}
