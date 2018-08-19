package com.packageChallenge;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee janeJones = new Employee("Jane", "Jones", 123 );
        Employee johnDoe = new Employee("John", "Doe", 456 );
        Employee marySmith = new Employee("Mary", "Smith", 223 );
        Employee mikeWilson = new Employee("Mike","Wilson", 324 );



//        SimpleHashTable ht = new SimpleHashTable();
//        ht.put("Jones", janeJones);
//        ht.put("Doe",johnDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        ht.printHashtable();
//
//        System.out.println("=======================================");
//        System.out.println("retrieve key Wilson: " + ht.get("Wilson"));
//        System.out.println("retrieve jey Smith: " + ht.get("Smith") );
//        System.out.println("=======================================");
//
//        ht.remove("Wilson");
//        ht.remove("Jones");
//        ht.printHashtable();



        ChainedHashTables ht = new ChainedHashTables();
        ht.put("Jones", janeJones);
        ht.put("Doe",johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashTable();

        System.out.println("=======================================");
        System.out.println("retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("retrieve jey Smith: " + ht.get("Smith") );
        System.out.println("=======================================");

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();






    }
}
