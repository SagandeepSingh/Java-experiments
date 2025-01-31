// write a program to simulate an atm withdrawl system the program should :
// ask the user to enter their pin
// allow withdrawl if the pin is correct and thr balance is sufficient
// throw exceptions for invalid pin or insufficient balance
// ensure the system always show the remaining balance even if an exception accurs
// use finally to display the remaining balance

import java.util.Scanner;
import java.lang.Math;
public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Enter the pin: ");
        int pin = sc.nextInt();
        try{
            if(pin!=1234){
                throw new Exception("Invalid pin");
            }
            System.out.println("Enter the amount to withdraw: ");
            int amount = sc.nextInt();
            if(amount>balance){
                throw new Exception("Insufficient balance");
            }
            balance -= amount;
            System.out.println("Remaining balance: "+balance);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Remaining balance: "+balance);
        }
    }
}