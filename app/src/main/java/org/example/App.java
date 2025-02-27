/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.Singleton;
import org.example.DecoratorPattern.BaconDecorator;
import org.example.DecoratorPattern.Burger;
import org.example.DecoratorPattern.CheeseDecorator;
import org.example.DecoratorPattern.PlainBurger;
import org.example.IteratorPattern.BinaryNode;
import org.example.IteratorPattern.BinaryTree;
import org.example.ObserverPattern.CellUser;
import org.example.ObserverPattern.EmailUser;
import org.example.ObserverPattern.NotificationService;

import java.util.Iterator;

import org.example.ComputerBuilder;
import org.example.StrategyPattern.*;

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

        System.out.println("Computer using builder pattern\n");

        ComputerBuilder computer = new ComputerBuilder.Builder()
                                    .cpu("Intel")
                                    .gpu("5090")
                                    .ram("32GB")
                                    .storage("2TB")
                                    .build();
        
        System.out.println(computer);

        SortService sortService = new SortService(new int[]{1, 4, 3, 9, 7, 8, 4, 3});

        sortService.sort(new SortAsc());
        System.out.println(sortService);
        sortService.setStrategy(new SortDesc());
        sortService.sort();
        System.out.println(sortService);

        NotificationService notificationService = new NotificationService();
        EmailUser email1 = new EmailUser("abc@gmail.com");
        CellUser cellUser1 = new CellUser(123456789);

        System.out.println("Email user before " + email1.inStock_);

        notificationService.subscribe(email1);
        notificationService.subscribe(cellUser1);
        notificationService.sendAlert();

        System.out.println("Email user after "  + email1.inStock_);

        notificationService.unsubscribe(cellUser1);
        notificationService.sendAlert();


        BinaryNode root = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node5 = new BinaryNode(5);

        // Build the tree structure:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);

        BinaryTree binaryTree = new BinaryTree(root);

        Iterator<BinaryNode> iterator = binaryTree.createPostOrderIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getValue());
        }

        Burger plainBurger = new PlainBurger();
        System.out.println("Desc: " + plainBurger.print() + "\nCost: " + plainBurger.cost());

        Burger cheeseBurger = new CheeseDecorator(new PlainBurger());
        System.out.println("Desc: " + cheeseBurger.print() + "\nCost: " + cheeseBurger.cost());

        Burger baconBurger = new BaconDecorator(new CheeseDecorator(new PlainBurger()));
        System.out.println("Desc: " + baconBurger.print() + "\nCost: " + baconBurger.cost());




        






        


    }
}
