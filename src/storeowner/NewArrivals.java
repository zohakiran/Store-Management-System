/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeowner;

import java.awt.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faraz
 */
public class NewArrivals {
       private List<Subscriber> subscribers = new ArrayList<Subscriber>();
 public NewArrivals(String... operations) {
        for (String operation : operations) {
        }
    }
        public void subscribe(String subscriberType, Subscriber subscriber){  
            subscribers.add(subscriber);		
   }
         public void unsubscribe(Subscriber subscriber){
      subscribers.remove(subscriber);		
   }
             public void notify(String subscriberType) {
                    List<Subscriber> subcriber = subscribers;
 for (Subscriber subscriber : subcriber) {
            subscriber.update(subscriberType);
   }
             }
               public void Clickbutton() {
        notify("Click");

}

    

}
            
        