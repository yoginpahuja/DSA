package LinkedList;

public class LinkedList<T> {
    public INode<T> head;
    public INode<T> tail;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addNode(INode<T> node){
        if(this.tail == null){
            this.tail = node;
        }
        if(this.head == null){
            this.head = node;
        }else{
            INode<T> temp = head;
            head = node;
            head.setNext(temp);
        }
    }

    public void appendNode(INode<T> node){
        if(this.head == null){
            this.head = node;
        }
        if(this.tail == null){
            this.tail = node;
        }else{
            INode<T> temp = tail;
            tail = node;
            temp.setNext(tail);
        }
    }

    public void insertNode(INode<T> prev, INode<T> inserted){
        INode<T> temp = prev.getNext();
        prev.setNext(inserted);
        inserted.setNext(temp);
    }

    public void pop(){
        head = head.getNext();
    }

    public void popLast(){
        INode<T> temp=head;
        while((temp.getNext() != null) &&  (temp.getNext().getNext()!=null)){
            temp = temp.getNext();
        }
        tail = temp;
        temp.setNext(null);
    }

    public INode<T> searchNode(T data){
        INode<T> temp = head;
        while(temp!=null){
            T val = temp.getData();
            if(val == data){
                break;
            }
            temp = temp.getNext();
        }
        return temp;
    }

    public void printList(){
        INode<T> temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public String toString(){
        return "MyLinkedList {" + head + " }";
    }
}