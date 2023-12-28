package BST;

import LinkedList.INode;

public class MyBSTNode<T extends Comparable> implements INode<T> {

    T val;
    INode<T> left;
    INode<T> right;
    public MyBSTNode(T val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    @Override
    public void setNext(INode<T> next) {

    }

    @Override
    public INode<T> getNext() {
        return null;
    }

    public INode<T> getLeft() {
        return this.left;
    }

    public INode<T> getRight() {
        return this.right;
    }
    @Override
    public T getData() {
        return this.val;
    }

    public String toString(){
        return this.val + " " +left + " " + right;
    }
}