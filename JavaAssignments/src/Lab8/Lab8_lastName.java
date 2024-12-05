public class Lab8_lastName{
    public static void main(String[] args){
        //MANUALLY CREATE YOUR TREE
        BinTree<Integer> tree = new BinTree<>();


        tree.root = new Treenode<Integer>(10);
        tree.root.left = new Treenode<Integer>(5);
        tree.root.right = new Treenode<Integer>(15);
        tree.root.left.left = new Treenode<Integer>(3);
        tree.root.left.right = new Treenode<Integer>(7);
        tree.root.right.left = new Treenode<Integer>(13);
        tree.root.right.right = new Treenode<Integer>(17);

        //CALL THE TRAVERSAL METHODS
        System.out.println("---------------Pre Order---------------");
        tree.printPre(tree.root);
        System.out.println("");
        System.out.println("---------------In Order---------------");
        tree.printIn(tree.root);
        System.out.println("");
        System.out.println("---------------Post Order---------------");
        tree.printPost(tree.root);
        System.out.println("");
        System.out.println("");

        //CALL THE SUM AND SEARCH METHODS 
        int key = 5; //insert your own key here
        System.out.println("The sum of the node data is: " + tree.sumNodes(tree.root));
        System.out.print("Searching for " + key + ": ");
        if(tree.search(tree.root, key)){
            System.out.println(key + " found in the tree!");
        }else{
            System.out.println(key + " not found in the tree... dang :(");
        } 
    }
}