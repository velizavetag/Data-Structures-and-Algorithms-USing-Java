package com.packageChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();

        System.out.println("\n==========================================");
//        System.out.println(intTree.get(20));
//        System.out.println(intTree.get(92));
//        System.out.println(intTree.get(29));
//
//        System.out.println("========================");
//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

        intTree.delete(15);
        intTree.traverseInOrder();

        System.out.println("\n========================================");

        intTree.delete(27);
        intTree.traverseInOrder();
        System.out.println("\n=========================================");

        intTree.delete(15);
        intTree.traverseInOrder();

    }












}
