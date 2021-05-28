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
public class MainClass {
    public static void main(String[] args) {
        InsufficientBalanceException obj=new InsufficientBalanceException();
        Scanner sobj=new Scanner (System.in);
        System.out.println("enter amount to deposit");
        double da=sobj.nextDouble();
         obj.deposit(da);
        System.out.println("enter amount to withdraw");
        double Wa=sobj.nextDouble();
       
        try{
        obj.withdraw(Wa);
    } catch(MyException e){ 
            System.out.println("you dont have enough balance");
            System.out.println("exception caught +e");
    
    }}
    
}
