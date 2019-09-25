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
public class ProductManager implements Employee {
@Override
    public void doWork() {
   System.out.println("ProductManager Hired");
      System.out.println("Responsiblity: Manage List Of Products & \n Request for Products that are out of stock ");


RequestStock();
listOfProducts();

    }
    public void RequestStock(){
   System.out.println("Mobile & Accessories are out of stock ");
    }
    public void listOfProducts(){
        System.out.println("Products In Stock \n"
           + "1-Grocery Products (Available)\n"
           + "2-Cosmetics Products(Available) \n"
            + "3-Mobile & Accessorie (Out Of Stock)\n");    
    }
}
