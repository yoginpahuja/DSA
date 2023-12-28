package LinkedList;

public interface INode<T> {

    public void setNext(INode<T> next);

    public INode<T> getNext();

    public T getData();
}