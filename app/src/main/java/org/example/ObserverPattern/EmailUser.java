package org.example.ObserverPattern;

public class EmailUser implements Subscriber {

    public int inStock_ = 0;
    public String email_;

    public EmailUser(String email) {
        email_ = email;
    }

    public void update() {
        inStock_ = 1;
    }


    
}
