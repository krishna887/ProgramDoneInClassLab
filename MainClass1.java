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
public class MainClass1 {
    public static void main(String[] args) {
        CheckRange obj=new CheckRange();
         Scanner sobj=new Scanner (System.in);
         System.out.println("enter your age");
         int a=sobj.nextInt();
         try{obj.checkrange(a);
    }catch(NumberNotInRangeException e){
             System.out.println("exception caught");
        
    }
    
}}
