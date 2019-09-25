/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeowner;

import java.util.Scanner;

/**
 *
 * @author faraz
 */
public class Payment {
    PaymentStrategy paymentStrategy;
    public static String paymentType;
    public static String amount;
    public void makepayment(){
    //System.out.println("you paid the bill thankyou for shopping");
    System.out.println("Please enter Payment Type : 'CreditCard' or 'DebitCard' or 'ByCash'");
    Scanner scanner = new Scanner(System.in);
    paymentType = scanner.next();
    System.out.println("Payment type is : " + paymentType);

    System.out.println("\nPlease enter Amount to Pay : ");
    Scanner scanner1 = new Scanner(System.in);
    amount = scanner1.next();
    System.out.println("amount is : " + amount);

    
  
    
     
   
  }
    
  public void setPaymentStrategy(PaymentStrategy strategy)
 {
  this.paymentStrategy = strategy;
 }

 public PaymentStrategy getPaymentStrategy()
 {
  return paymentStrategy;
 }

 public void pay(String amount)
 {
     
     
     
  paymentStrategy.pay(amount);
 }


    
    
    
    }

