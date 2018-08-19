package com.packageChallenge;

import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        ArrayStack stack = new ArrayStack(10);

        ListStack stack = new ListStack();
        stack.push (new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567) );
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 456));

        stack.printStack();
        System.out.println("===================================================");

        stack.peek();
        stack.printStack();
        System.out.println();

        System.out.println("Popped : " + stack. pop());
        stack.printStack();


    }
}
