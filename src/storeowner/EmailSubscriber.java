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
public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }
   @Override
    public void update(String subscriberType) {
        System.out.println("Email to " + email + ": New Arrivals are now in the store " + subscriberType);
    }
    
}
