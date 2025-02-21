/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.Singleton;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println();
        System.out.println("Singleton: ");
        System.out.println("Creating first instace with data 10");
        Singleton singleton = Singleton.get_instance();
        singleton.set_data(10);
        System.out.println("Creating second instace");
        Singleton singleton_2 = Singleton.get_instance();

        System.out.println("Are they aliases: " + (singleton == singleton_2));


        


    }
}
