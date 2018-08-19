package com.packageChallenge;

public class DoublyLinkedList {

    private EmployeeNodeForDLL head;
    private int size;
    private EmployeeNodeForDLL tail;

    public void addToFront(Employee employee) {

        EmployeeNodeForDLL node = new EmployeeNodeForDLL(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }

        head = node;
        size++;

    }

    public void addToEnd(Employee employee) {
        EmployeeNodeForDLL node = new EmployeeNodeForDLL(employee);

        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }


        tail = node;
        size++;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void printList() {
        EmployeeNodeForDLL current = head;
        System.out.println("HEAD ->");

        while (current != null) {

            System.out.print(current + " ");
            System.out.print(" <-> ");
            current = current.getNext();

        }

        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNodeForDLL removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNodeForDLL removeNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();

        size--;
        return removeNode;
    }


    public EmployeeNodeForDLL removeFromTheEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNodeForDLL removednode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        return removednode;


    }


    public boolean addBefore(Employee newEmployee, Employee otherEmployee) {

        EmployeeNodeForDLL current = head;


        while (current != null && !current.getEmployee().equals(otherEmployee)) {
            current = current.getNext();

        }
        if (current == null) {
            return false;
        }
        EmployeeNodeForDLL new_emp = new EmployeeNodeForDLL(newEmployee);

            new_emp.setPrevious(current.getPrevious());
            new_emp.setNext(current);
            current.setPrevious(new_emp);

            if(head == current){
                head = new_emp;
            } else{
                new_emp.getPrevious().setNext(new_emp);
            }

        size --;

        return true;

    }

}
