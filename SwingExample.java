
package abc.labtask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingExample {
    public static void main(String[] args) {
JFrame frame = new JFrame("login Example");
frame.setSize(450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
frame.add(panel);
placeComponents(panel);
frame.setVisible(true);
}
private static void placeComponents(JPanel panel) {
panel.setLayout(null);
JLabel userLabel = new JLabel("user");
userLabel.setBounds(20,20,80,25);
panel.add(userLabel);
JTextField userText = new JTextField(20);
userText.setBounds(200,20,165,25);
panel.add(userText);
JLabel passwordLabel = new JLabel("password");
passwordLabel.setBounds(10,50,80,25);
panel.add(passwordLabel);
JPasswordField passwordText = new JPasswordField(20);
passwordText.setBounds(100,50,165,25);
panel.add(passwordText);
JButton loginButton = new JButton("login");
loginButton.setBounds(10, 80, 80, 25);
panel.add(loginButton);
}

}
