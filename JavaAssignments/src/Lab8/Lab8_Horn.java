public class Lab8_Horn{
    public static void main(String[] args){
        //MANUALLY CREATE YOUR TREE
        BinTree<Integer> tree = new BinTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(15);
        tree.add(13);
        tree.add(17);

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