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
public class MouseEvents extends WindowAdapter implements MouseListener,MouseMotionListener
    {Label l;
    int mousex,mousey;
Frame f;
    MouseEvents(){
        f=new Frame("mouse event");
        mousex=0;
        mousey=0;
       f. addMouseListener(this);
        f.addMouseMotionListener(this);
        f.addWindowListener(this);
        l=new Label();
        l.setBounds(20,50,400,10);
        f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
       f. setVisible(true);
       
        
        
    }
    public void mouseClicked(MouseEvent e){
        l.setText("mouse clicked");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("mouse entered");
   
    }
    public void mouseExited(MouseEvent e){
        l.setText("mouse exited");
    }
    public void mousePressed(MouseEvent e){
        l.setText("mouse pressed");
        
    }
    public void mouseReleased(MouseEvent e){
        l.setText("mouse released");
    }
    
    public void mouseDragged(MouseEvent me){
        l.setText("mouse moves at"+mousex+","+mousey);
    }
    public void mouseMoved(MouseEvent me){
        l.setText("moving mouse at"+me.getX()+","+me.getY());
    }public void windowClosing(WindowEvent e){
     f.  dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MouseEvents();
        // TODO code application logic here
    }

    
}
