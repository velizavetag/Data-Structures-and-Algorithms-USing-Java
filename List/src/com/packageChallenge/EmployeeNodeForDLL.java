package com.packageChallenge;

public class EmployeeNodeForDLL {

    private Employee employee;
    private EmployeeNodeForDLL next;
    private EmployeeNodeForDLL previous;

    public EmployeeNodeForDLL(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeForDLL getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNodeForDLL previous) {
        this.previous = previous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeForDLL getNext() {
        return next;
    }

    public void setNext(EmployeeNodeForDLL next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

}
