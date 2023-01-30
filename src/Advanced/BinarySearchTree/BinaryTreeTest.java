package Advanced.BinarySearchTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<>();
        System.out.println("Is Tree empty? --> " + binaryTree.isEmpty());
        binaryTree.add("E");
        binaryTree.add("D");
        binaryTree.add("S");
        binaryTree.add("O");
        binaryTree.add("Z");
        binaryTree.add("P");
        binaryTree.add("A");
        binaryTree.add("R");
        binaryTree.add("Q");


        System.out.println("Is Tree empty? --> " + binaryTree.isEmpty());
        System.out.println("Traverse Preorder:  " + binaryTree.traversePreOder());
        System.out.println("Traverse Postorder: " + binaryTree.traversePostOder());
        System.out.println("Traverse Inorder:   " + binaryTree.traverseInOder());


        System.out.println("Search for E Rec --> " + binaryTree.search("E"));
        System.out.println("Search for O Rec --> " + binaryTree.search("O"));
        System.out.println("Search for B Rec --> " + binaryTree.search("B"));
        System.out.println("Search for Q Rec --> " + binaryTree.search("Q"));
        System.out.println("Search for y Rec --> " + binaryTree.search("Y"));

        System.out.println("Search for E Iterative --> " + binaryTree.searchIte("E"));
        System.out.println("Search for O Iterative --> " + binaryTree.searchIte("O"));
        System.out.println("Search for B Iterative --> " + binaryTree.searchIte("B"));
        System.out.println("Search for Q Iterative --> " + binaryTree.searchIte("Q"));
        System.out.println("Search for y Iterative --> " + binaryTree.searchIte("Y"));


        System.out.println("Number of Nodes in Tree = " + binaryTree.anzahlKnoten());
        System.out.println("Number of Leaves in Tree = " + binaryTree.anzahlBlätter());
        System.out.println("Height of Tree = " + binaryTree.hohe());
    }
}
