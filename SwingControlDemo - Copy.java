
package abc.labtask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    private JFrame mainFrame;
private JLabel headerLabel;
private JLabel statusLabel;
private JPanel controlPanel;
public SwingControlDemo() {
prepareGUI();
}
public static void main(String[] args) {
SwingControlDemo scd = new SwingControlDemo();
scd.showEventDemo();
}
private void prepareGUI() {
mainFrame = new JFrame("Java SWING Examples");
mainFrame.setSize(400, 400);
mainFrame.setLayout(new GridLayout(3, 1));
headerLabel = new JLabel("", JLabel.CENTER);
statusLabel = new JLabel("", JLabel.CENTER);
statusLabel.setSize(350, 100);
controlPanel = new JPanel();
controlPanel.setLayout(new FlowLayout());
mainFrame.add(headerLabel);
mainFrame.add(controlPanel);
mainFrame.add(statusLabel);
mainFrame.setVisible(true);
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void showEventDemo() {
headerLabel.setText("Control in action: Button");
JButton okButton = new JButton("OK");
JButton submitButton = new JButton("Submit");
JButton cancelButton = new JButton("Cancel");
okButton.setActionCommand("OK");
submitButton.setActionCommand("Submit");
cancelButton.setActionCommand("Cancel");
okButton.addActionListener(new ButtonClickListener());
submitButton.addActionListener(new ButtonClickListener());
cancelButton.addActionListener(new ButtonClickListener());
controlPanel.add(okButton);
controlPanel.add(submitButton);
controlPanel.add(cancelButton);
mainFrame.setVisible(true);
}
private class ButtonClickListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
    switch (command) {
        case "OK":
            statusLabel.setText("Ok Button clicked.");
            break;
        case "Submit":
            statusLabel.setText("Submit Button clicked.");
            break;
        default:
            statusLabel.setText("Cancel Button clicked.");
            break;
    }
}
}
}

