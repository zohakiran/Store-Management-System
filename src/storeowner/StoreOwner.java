/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeowner;

import java.util.Scanner;
import static storeowner.Payment.amount;

/**
 *
 * @author faraz
 */
public class StoreOwner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int i;
  String option;
        StoreOwner owner= new StoreOwner();
System.out.println("Owner: Hire Employees");
System.out.println("System:Enter Employee Post");
System.out.println("Owner: Product Manager and Sales Person");

        Employee employee1= owner.hireEmployee("ProductManager"); 
employee1.doWork();
      Employee  employee2= owner.hireEmployee("SalesPerson"); 
employee2.doWork();
System.out.println("Dear Customer Press 1"+  " to show  menu" );
 Scanner scanner1 = new Scanner(System.in);
    i = scanner1.nextInt();
    
if(i==1){
     SellerFacade Facade = new SellerFacade();
        Facade.displayProducts();
        Facade.BuyProducts();
}
System.out.println("Dear Customer Press 2 for Email Or SMS Subscription to get 1"
        + "updates" );
 Scanner scanner2 = new Scanner(System.in);
    i = scanner2.nextInt();
    if(i==2){
     
NewArrivals newarrivals = new NewArrivals("Click");
newarrivals.subscribe("Click For EmailSubscribtion", new EmailSubscriber("abc@gmail.com"));
newarrivals.subscribe("Click For SMS Subscribtion", new SMSSubscriber("0300000000"));

newarrivals.Clickbutton();

    }
}
    public static Employee hireEmployee(String type){
       if(type.equalsIgnoreCase("ProductManager")){
        return new ProductManager();
       }
       else if(type.equalsIgnoreCase("SalesPerson")){
        return new SalesPerson();
       }
        return null;
    }
          
}


