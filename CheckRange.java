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
public class CheckRange {
    void checkrange(int age) throws NumberNotInRangeException{
        if(age>18)
        {
            System.out.println("you can vote");
        }
        else
            System.out.println("your are too young you cant vote ");
     String   msg=" your  age should be grater than 18 years";
     throw new NumberNotInRangeException(msg);
    }
    
}
