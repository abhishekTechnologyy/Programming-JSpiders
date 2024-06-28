public class BSTRunner {
    
    public static void main(String[] args) {
        
        NodeOfBST root = new NodeOfBST(20);
        BSTImplementation b1 = new BSTImplementation();
        b1.insert(root,10);
        b1.insert(root, 5);
        b1.insert(root, 3);
        b1.insert(root, 15);
        b1.insert(root, 30);
        b1.insert(root, 25);
        b1.insert(root, 23);
        b1.insert(root, 35);
        b1.insert(root, 45);
        
        System.out.println("-------preOrder-----------");

        b1.preOrder(root);
        System.out.println();

        System.out.println("-------inOrder-----------");

        b1.inOrder(root);
        System.out.println();

        System.out.println("-------postOrder-----------");

        b1.postOrder(root);
    }
}
