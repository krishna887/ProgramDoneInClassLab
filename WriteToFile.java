
package abc.labtask;
import java.io.*;
import java.util.Random;
public class WriteToFile {
 public static void main(String args[]) {
      final int max=10;
      int value;
      String file="test.txt";
      Random rand=new Random();
      try{
          FileWriter fw=new FileWriter(file);
          BufferedWriter bw=new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw) ;
              for(int line=1;line<= max;line++){
                  for(int num=1;num<max;num++){
                      value=rand.nextInt(80)+10;
                      pw.print(value+" ");
                  }
                  pw.println();
              
          }
          System.out.println("Output file created:"+file);
      }catch(IOException e){
      }
    }
}
