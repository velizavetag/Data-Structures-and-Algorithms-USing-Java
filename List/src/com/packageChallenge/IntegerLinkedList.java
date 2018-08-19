package com.packageChallenge;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer integer){

        IntegerNode node = new IntegerNode(integer);
        node.setNext(head);
        head = node;
        size++;

    }

    public void insertSorted(Integer value){

//        assumption : the list is sorted
        if(head ==null || head.getInteger() >= value){
            addToFront(value);
            return;
        }
//        find insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while( current != null && current.getInteger() < value){
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);


        size++;




    }

    public boolean isEmpty(){
        if( head == null){
            return true;
        } return false;
    }

    public void printList(){
        IntegerNode current = head;
        System.out.print("HEAD ->");

        while (current != null){

            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();

        }

        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public IntegerNode removeFromFront(){
        if( isEmpty()){
            return null;
        }

        IntegerNode removeNode = head;
        head = head.getNext();
        size--;
        return removeNode;
    }
}
