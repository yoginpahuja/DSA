package LinkedList;

public class Node<T> implements INode<T>{
    private T data;
    private INode<T> next;

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }


    public void setNext(INode<T> next){
        this.next = (Node<T>) next;
    }

    public INode<T> getNext(){
        return this.next;
    }

    public T getData(){
        return this.data;
    }
}