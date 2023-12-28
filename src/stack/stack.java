package stack;

import LinkedList.LinkedList;
import LinkedList.Node;

public class stack<T> {
    public Node top;
    private LinkedList list;
    stack(){
        list = new LinkedList();
    }

    public void push(T data){
        Node<T> node = new Node<>(data);
        list.addNode(node);
    }

    public void pop(){
        if(list==null){
            return ;
        }
        list.pop();
    }

    public T top(){
        return (T) list.head.getData();
    }
    public void showData(){
        list.printList();
    }

    public static void main(String[] args) {

    }
}