public class BinTree<T>{
    //ATTRIBUTE
    public Treenode<T> root;

    //CONSTRUCTOR
    public BinTree(){
        this.root = null;
    }

    //TRAVERSAL METHODS
    public void printPre(Treenode<T> node){
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        printPre(node.left);
        printPre(node.right);
    }
    public void printIn(Treenode<T> node){
        if(node == null){
            return;
        }
        printIn(node.left);
        System.out.println(node.getValue());
        printIn(node.right);
    }
    public void printPost(Treenode<T> node){
        if(node == null){
            return;
        }
        printPost(node.left);
        printPost(node.right);
        System.out.println(node.getValue());
    }

    //SEARCH AND SUM METHODS
    public boolean search(Treenode<T> node, int key){
        if(node==null){
            return false;
        }
        int data = 0;
        try {
            // check if the data can be cast to an integer
            data = (int)node.getValue();
        } catch (Exception e) {
            // return false if unable
            return false;
        }
        if(data==key){
            return true;
        }
        if(data>key){
            return search(node.left, key);
        }
        return search(node.right, key);
    }

    public int sumNodes(Treenode<T> node){
        if(node == null){
            return 0;
        }

        int data = 0;
        try {
            // check if the data can be cast to an integer
            data = (int)node.getValue();
        } catch (Exception e) {
            // return false if unable
            return 0;
        }

        return data + sumNodes(node.left) + sumNodes(node.right);
    }
}