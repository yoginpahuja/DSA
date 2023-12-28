package BST;

public class MyBST<T extends Comparable> {
    MyBSTNode<T> root;

    MyBST(){
        root = null;
    }

    public void add(T val){
        root = addNodeRecursive(root,val);
    }

    private MyBSTNode<T> addNodeRecursive(MyBSTNode<T> current,T val){
        if(current == null){
            return new MyBSTNode<>(val);
        }
        Integer comparison = current.getData().compareTo(val);
        if(comparison==0){
            return current;
        }else if(comparison>0){
            current.left = addNodeRecursive((MyBSTNode<T>) current.left,val);
        }else{
            current.right = addNodeRecursive((MyBSTNode<T>) current.right,val);
        }
        return current;
    }

    public T search(T key){
        T find = searchRecursively(root,key);
        return find;
    }

    private T searchRecursively(MyBSTNode<T> current, T val){
        if(current == null){
            return null;
        }
        Integer comp = current.getData().compareTo(val);
        if(comp == 0){
            return val;
        }else if(comp>0){
            return searchRecursively((MyBSTNode<T>) current.left,val);
        }else{
            return searchRecursively((MyBSTNode<T>) current.right,val);
        }
    }

    public String toString(){
        return "BST : " + root;
    }

    public static void main(String[] args) {

    }

}