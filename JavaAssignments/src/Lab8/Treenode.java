public class Treenode<T>{
    //ATTRIBUTES
    public Treenode<T> left;
    public Treenode<T> right;
    public T data;

    //CONSTRUCTOR
    public Treenode(T value){
        this.left = null;
        this.right = null;
        this.data = value;
    }
}