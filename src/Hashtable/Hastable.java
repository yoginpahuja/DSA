package Hashtable;

import LinkedList.MapNode;
import LinkedList.LinkedList;

public class Hastable<K,T> {
    LinkedList<K> list;

    void HasTable() {
        list = new LinkedList<K>();
    }

    public T get(K key) {
        MapNode<K, T> node = (MapNode<K, T>) this.list.searchNode(key);
        return (node == null) ? null : node.getVal();
    }

    public void add(K key, T val) {
        MapNode<K, T> node = (MapNode<K, T>) this.list.searchNode(key);
        if (node == null) {
            node = new MapNode<>(key, val);
            list.addNode(node);
        } else {
            node.setVal(val);
        }
    }

    public String toString() {
        return "MyHash { " + list + " }";
    }

    public static void main(String[] args) {

    }

}