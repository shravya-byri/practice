package dataStructure;

public class trees {
    public static class Node {
        public Node(int n, Node l, Node r){
            data = n;
            left = l;
            right = r;
        }
        int data;
        Node left;
        Node right;
    }
    static void recPrintTree(Node n){
            Node current = n;
        if (current != null){
            System.out.print(current.data+ " ");
            recPrintTree(current.left);
            recPrintTree((current.right));
        }


    }

    public static Node newLeaf(int n) {
        return new Node(n, null, null);
    }
    public static void main(String[] args) {
        Node root = newLeaf(1);
        root.left = newLeaf(2);
        root.right = newLeaf(3);
        root.left.left = newLeaf(4);
        recPrintTree(root);



    }
}
