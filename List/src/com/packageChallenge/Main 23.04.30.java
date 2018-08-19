package com.packageChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee janeJones = new Employee("Jane", "Jones", 123 );
        Employee johnDoe = new Employee("John", "Doe", 456 );
        Employee marySmith = new Employee("Mary", "Smith", 223 );
         Employee mikeWilson = new Employee("Mike","Wilson", 324 );
        ;

//        SinglyLinkedLIst list = new SinglyLinkedLIst();
//
//        System.out.println("________________");
//        System.out.println(list.isEmpty());
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilson);
//
//
//        list.printList();
//
//        System.out.println(list.getSize());
//
//        System.out.println(list.removeFromFront());
//
//        System.out.println(list.getSize());


        DoublyLinkedList list = new DoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());


        Employee billEnd = new Employee("Bill" , "End", 78);
        list.addToEnd(billEnd);
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromTheEnd();
        list.printList();
        System.out.println(list.getSize());

        System.out.println("=============================================================");

        System.out.println(list.addBefore(new Employee("Elizabeth","Cov", 122), marySmith));
        list.printList();

        System.out.println("===========================THE INTEGER CHALLENGE==============================");

        IntegerLinkedList intlist = new IntegerLinkedList();
        intlist.insertSorted(2);
        intlist.insertSorted(45);
        intlist.insertSorted(12);
        intlist.printList();

    }
}
