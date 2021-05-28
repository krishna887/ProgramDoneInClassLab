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
public class InsufficientBalanceException {
    double amount;
    InsufficientBalanceException(){
    amount=0.0;}
    void deposit(double amt){
        amount+=amt;
        System.out.println("you have deposited :"+amt+"rupees");
        
    }
    void withdraw( double wa) throws MyException{
        if(wa<=amount){
            System.out.println("you withdraw:"+wa+"rupees");
            amount-=wa;
            System.out.println("your new balance is:"+amount);
        }
        else{
            String msg="sorry you dont have enough balance to withdraw";
            throw new MyException(msg);
            
        }
        
        
    }
    
    
}
