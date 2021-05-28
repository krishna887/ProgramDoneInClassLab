

package abc.labtask;
import java.util.Scanner;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        System.out.println("hello");
        int sum=0;
        float avg=0;
        int count=0;
        File f=new File("test.txt");
        try{
            Scanner scan =new Scanner(f);
            while(scan.hasNextLine()){
                String line=scan.nextLine();
                System.out.println(line);
                String[] num=line.split(" ");
                for(int i=0;i<num.length;i++){
                    int temp=Integer.parseInt(num[i]);
                    sum+=temp;
                    count++;
                    
            }}
            System.out.println("the sum is:" +sum);
            avg=sum/count;
            System.out.println("the everage is:"+avg);
            
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}
