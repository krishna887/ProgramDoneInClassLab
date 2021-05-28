
package abc.labtask;
import javax.swing.JOptionPane;

public class AdditionOptionPane {
    public static void main( String[] args )
{

String fn =
JOptionPane.showInputDialog( "enter first integer" );
String sn =
JOptionPane.showInputDialog( "enter second integer" );
int number1 = Integer.parseInt( fn );
int number2 = Integer.parseInt( sn );
int sum = number1 + number2; 
JOptionPane.showMessageDialog( null, "The sum is " + sum,
"Sum of Two Integers", JOptionPane.ERROR_MESSAGE );
} 
} 
    

