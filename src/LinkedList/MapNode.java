package LinkedList;

public class MapNode<K,V> implements INode<K> {

    K key;
    V val;
    MapNode<K,V> next;
    public MapNode(K key,V val){
        this.key = key;
        this.val = val;
        this.next = null;

    }
    @Override
    public void setNext(INode<K> next) {
        this.next = (MapNode<K, V>) next;
    }

    @Override
    public INode<K> getNext() {
        return this.next;
    }

    @Override
    public K getData() {
        return this.key;
    }

    public V getVal(){
        return this.val;
    }
    public void setVal(V val){
        this.val = val;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Node{" + "Key=").append(key).append("}");
        if(next != null){
            str.append("->").append(next);
        }
        return str.toString();
    }
}