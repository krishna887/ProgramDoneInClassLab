/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.labtask;
import java.util.Scanner;
/**
 *
 * @author pavilion
 */
public class MainClass2 {
      public static void main(String[] args) {
        NegativeNumber obj=new NegativeNumber();
         Scanner sobj=new Scanner (System.in);
         System.out.println("enter number you want to check");
         int num=sobj.nextInt();
         try{obj.negativenumber(num);
    }catch(NegativeNumberException e){
             System.out.println("exception caught"+e);
        
}}}
