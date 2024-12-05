public class BinTree<T>{
    //ATTRIBUTE
    public Treenode<T> root;

    //CONSTRUCTOR
    public BinTree(){
        this.root = null;
    }

    public void add(T nodeData){
        if (root==null) {
            root = new Treenode<>(nodeData);
        }
        addToTree(this.root, nodeData);
    }

    private void addToTree(Treenode<T> root, T nodeData){
        int rootData;
        int data;
        // check if the data in the nodes are integers
        try {
            rootData = (int)root.data;
            data = (int)nodeData;
        } catch (Exception e) {return;}
        // check if node already exists
        if(rootData == data){
            return;
        }
        // check if the node is less than the root
        if(rootData>data) {
            if (root.left==null) {
                root.left = new Treenode<>(nodeData);
            }
            addToTree(root.left, nodeData);
        }else{
            if (root.right==null) {
                root.right = new Treenode<>(nodeData);
            }
            addToTree(root.right, nodeData);
        }
    }

    //TRAVERSAL METHODS
    public void printPre(Treenode<T> node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        printPre(node.left);
        printPre(node.right);
    }
    public void printIn(Treenode<T> node){
        if(node == null){
            return;
        }
        printIn(node.left);
        System.out.println(node.data);
        printIn(node.right);
    }
    public void printPost(Treenode<T> node){
        if(node == null){
            return;
        }
        printPost(node.left);
        printPost(node.right);
        System.out.println(node.data);
    }

    //SEARCH AND SUM METHODS
    public boolean search(Treenode<T> node, int key){
        if(node==null){
            return false;
        }
        int data;
        try {
            // check if the data can be cast to an integer
            data = (int)node.data;
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

        int data;
        try {
            // check if the data can be cast to an integer
            data = (int)node.data;
        } catch (Exception e) {
            // return false if unable
            return 0;
        }

        return data + sumNodes(node.left) + sumNodes(node.right);
    }
}