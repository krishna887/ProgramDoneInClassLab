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
public class NegativeNumber {
    void negativenumber(int num) throws NegativeNumberException{
        if(num>0)
        {
            System.out.println("the number is positive");
        }
        else
            System.out.println("the number is negative ");
     String   msg="you enter negative number";
     throw new NegativeNumberException(msg);
    }
    
    
}
