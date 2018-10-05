/*
 * 
 */

package mybankmachine;

/**
 * @author fedie2562
 */
public class ATM {
    String bank;
    double balance;
    public ATM(String bank,double balance){
        this.bank = bank;
        this.balance = balance;
        System.out.println("Bank: "+bank+"\nBalance: $"+balance);
    }
    public String toString(){
        return("Bank: "+bank+"\nCurrent balance in the account: $"+balance);
    }
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Deposited "+amount+"\n"+this.toString());
        }
        else{
            System.out.println("You cannot deposit "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            System.out.println("Withdrew "+amount+"\n"+this.toString());
        }
        else{
            System.out.println("You cannot withdraw "+amount);
        }
    }
}
