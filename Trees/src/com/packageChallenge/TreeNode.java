package com.packageChallenge;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }


    public void insert(int value){
        if(value == data) {
            return;
        }

        if(value < data){
            if(leftChild == null) {
                leftChild = new TreeNode(value);
            } else{
                leftChild.insert(value );
            }
        } else{
            if( rightChild == null){
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public int min(){
        if(leftChild == null){
            return data;
        } else{
            return leftChild.min();
        }
    }

    public int max(){
        if(rightChild == null){
            return data;
        } else {
            return rightChild.max();
        }
    }

    @Override
    public String toString() {
        return " " +
                "data=" + data ;
    }

    public TreeNode get(int value){
        if( value == data){
            return this;
        } else if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        } else{
            if(rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public void traverseInOrder(){
        if(leftChild != null) {
            leftChild.traverseInOrder();
        }

        System.out.print("\t" + data );

        if(rightChild != null) {
            rightChild.traverseInOrder();
        }
    }


    public void traversePreOrder(){

        System.out.print("\t" + data );

        if(leftChild != null) {
            leftChild.traversePreOrder();
        }

        if(rightChild != null) {
            rightChild.traversePreOrder();
        }

    }


    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
