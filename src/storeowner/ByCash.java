/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeowner;

/**
 *
 * @author faraz
 */
public class ByCash implements PaymentStrategy {
    public void pay( String amount )
  {
    System.out.println("Customer pays the money " + amount + "Rs. as a Cash");
  }
    
}
