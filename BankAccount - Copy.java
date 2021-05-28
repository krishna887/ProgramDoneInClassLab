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
public class BankAccount {
    double balance_amount;
    long account_number;
    BankAccount(long account_numbeer ){
    this.account_number=account_number;}
    void deposit(double amount){balance_amount+=amount;}
    void withdraaw(double amount)throws MyException
    {
        if(amount<=balance_amount)
       {balance_amount-=amount;
           System.out.println("you can withdraw:"+amount);}
        else
            System.out.println("balance is insufficient to withdraw");
        String msg="not enough balance";
        throw new MyException(msg);
    }
    
public void transfer(double amt, BankAccount targetAccount){
balance_amount=balance_amount-amt;
    System.out.println("you have transfer"+amt);
targetAccount.balance_amount+=amt;} 
 
void display(){System.out.println("total balance in the account is :"+balance_amount);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BankAccount obj1=new BankAccount(1234567);
        BankAccount obj2=new BankAccount(89101112);
        obj1.deposit(10000);
       try{ obj1.withdraaw(7000);}catch(MyException e){ System.out.println("exception caught"+e);}
       obj2.transfer(2000, obj2);
       obj1.display();
       obj2.display();
       
    }
}
