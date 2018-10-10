/*
 * 
 */

package mybankmachine;

import javax.swing.JOptionPane;

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
    public void interest(double interest,int days){
        if(interest > 0 && days > 0){
            System.out.println("Ending value of an annual interest rate at %"+interest);
            interest /= 100;
            interest /= 365;
            System.out.println("Amounts to "+balance*Math.pow(1+interest, days)+" after "+days+" days");
            if(JOptionPane.showInputDialog("Would you like this to be the new balance on the account\n yes/no").equalsIgnoreCase("yes")){
                balance = round(balance*Math.pow(1+interest, days));
                System.out.println("The new updated balance after applying the interest is "+balance);
            }
            else{
                System.out.println("The balance in this account is"+balance);
            }
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
    public double round(double number){
        double roundedNumber = (int) (number * 100);
        return roundedNumber/100;
    }
}
