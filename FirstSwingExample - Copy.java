
package abc.labtask;
import javax.swing.*;
/**
 *
 * @author pavilion
 */
public class FirstSwingExample extends JFrame {
    FirstSwingExample()
{
JFrame frm=new JFrame("First Swing Example");
JButton btn = new JButton("Click here");
btn.setBounds(130, 100, 100, 40);
frm.add(btn);
frm.setSize(400, 500);
frm.setLayout(null);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setVisible(true);
}
public static void main(String[] args) {
new FirstSwingExample();
}
}
    

