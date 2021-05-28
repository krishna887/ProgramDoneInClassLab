/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.labtask;

/**
 *
 * @author pavilion
 */
public class DemoTryCatchFinally {
    public static void main(String[] args) {
        try{int a=0;
         int c=50/a;
            System.out.println("the ans is:"+c);
        }
    catch(ArithmeticException e){System.out.println("exception caught"+e); } 
    finally{
            System.out.println("finally block");
}
}}
    

