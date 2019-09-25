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
public class SalesPerson implements Employee {

  @Override
    public void doWork() {
System.out.println("SalesPerson hired");    

        System.out.println("Responsiblity: Show Products To Customer \n"
                + "Add Products to store \n"
                + "Sell Products to Customer \n"
                + "Receive Payments From Customer \n");    
        
    }
}