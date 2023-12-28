package queue;

import LinkedList.LinkedList;
import LinkedList.Node;

public class queue<T> {
    private LinkedList list;
    queue(){
        list = new LinkedList();
    }

    public void enqueue(T data){
        Node<T> node = new Node<>(data);
        list.appendNode(node);
    }

    public void dequeue(){
        if(list==null){
            return ;
        }
        list.pop();
    }

    public T front(){
        return (T) list.head.getData();
    }
    public T back(){
        return (T) list.tail.getData();
    }
    public void showData(){
        list.printList();
    }

    public static void main(String[] args) {

    }
}