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
public class SellerFacade {
    private Product pro;
    private Order order;
    private ShoppingBill Receipt;
    private Payment payMoney;
   
   public SellerFacade(){
   pro = new Product();
    order =new Order();
    Receipt = new ShoppingBill();
    payMoney = new Payment();
   }
    public  void displayProducts()
           
   {
   pro.getAllProduct();
   pro.showallProduct();
   }
   
public void BuyProducts()
           
   {
   order.OrderProduct();
   Receipt.getReceipt();
          
   
     payMoney.makepayment();
     
   Payment pay=new Payment();
   
   System.out.println(pay.paymentType);
    
   if( "CreditCard".equalsIgnoreCase(pay.paymentType) )
    {
      payMoney.setPaymentStrategy(new PaymentCreditCardStrategy());
    }
    else if( "DebitCard".equalsIgnoreCase(pay.paymentType) )
    {
      payMoney.setPaymentStrategy(new PaymentByDebit());
    }
    else if( "ByCash".equalsIgnoreCase(pay.paymentType) )
    {
      payMoney.setPaymentStrategy(new ByCash());
    }
    
  System.out.println("PaymentContext has :"+payMoney.getPaymentStrategy());
     
    payMoney.pay(pay.amount);
   
   }
   }

