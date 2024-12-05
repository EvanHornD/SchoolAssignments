public class Treenode<T>{
    //ATTRIBUTES
    public Treenode<T> left;
    public Treenode<T> right;
    private T data;

    //CONSTRUCTOR
    public Treenode(T value){
        this.left = null;
        this.right = null;
        this.data = value;
    }

    public T getValue(){
        return this.data;
    }

    public void setValue(T data){
        this.data = data;
    }
}