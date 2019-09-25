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
public class SMSSubscriber implements Subscriber
{
        private String smsalert;
public SMSSubscriber(String smsalert) {
        this.smsalert = smsalert;
    }
    @Override
    public void update(String subscriberType) {
        System.out.println("Dear Customer,Your number: " + smsalert + " is now registered : New Arrivals are now in the store " + subscriberType);

    }

}
