public class BSTImplementation {
    
    void insert(NodeOfBST root,int value)
    {
        if (root.data > value) {
            if (root.left == null) 
            {
                System.out.println(value +" had been inserted towards left of "+root.data);
                root.left = new NodeOfBST(value);
            }
            else
            {
                insert(root.left, value);
            }
        }
        else
        {
            if (root.right == null) 
            {
                System.out.println(value +" had been inserted towards right of "+root.data);
                root.right = new NodeOfBST(value);
            }
            else
            {
                insert(root.right, value);
            }
        }
    }

    void preOrder(NodeOfBST root)
    {
        if(root != null)
        {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(NodeOfBST root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    void postOrder(NodeOfBST root)
    {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }


}
