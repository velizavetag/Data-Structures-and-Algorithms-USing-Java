package com.packageChallenge;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Employee janeJones = new Employee("Jane", "Jones", 123 );
        Employee johnDoe = new Employee("John", "Doe", 456 );
        Employee marySmith = new Employee("Mary", "Smith", 223 );
        Employee mikeWilson = new Employee("Mike","Wilson", 324 );
        Employee billEnd = new Employee("Bill", "End", 78);


        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

        queue.remove();
        queue.remove();

        System.out.println("=========================================");
        queue.printQueue();

        System.out.println("Peeked : " + queue.peek());


    }
}
