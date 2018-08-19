package com.packageChallenge;

public class IntegerNode {

    private Integer Integer;
    private IntegerNode next;

    public IntegerNode(Integer integer) {
        this.Integer = integer;
    }

    public Integer getInteger() {
        return Integer;
    }

    public void setInteger(Integer integer) {
        this.Integer = integer;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString(){
        return Integer.toString();
    }
}
