package LinkedList;

public class SortedLinkedList <T extends Comparable>{
    public INode<T> head;
    public INode<T> tail;
    SortedLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data){
        INode<T> node = new Node<>(data);
        if(this.tail == null){
            this.tail = node;
        }
        if(this.head == null){
            this.head = node;
        }else{
            INode<T> temp = head;
            INode<T> prev = null;
            while(temp!=null){
                T val = (T) temp.getData();
                if( val.compareTo(data) >0 ){
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
            if(prev == null){
                prev = head;
                head = node;
                head.setNext(prev);
            }else{
                insertNode(prev,node);
            }
        }
    }


    private void insertNode(INode<T> prev, INode<T> inserted){
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
            if(temp.getData() == data){
                System.out.println(temp.getData());
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

}