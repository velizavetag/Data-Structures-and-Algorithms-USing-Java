package com.packageChallenge;

public class SinglyLinkedLIst {

//
//
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public boolean isEmpty(){
        if( head == null){
            return true;
        } return false;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD ->");

        while (current != null){

            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();

        }

        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removeFromFront(){
        if( isEmpty()){
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        return removeNode;
    }
}
