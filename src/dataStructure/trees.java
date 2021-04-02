package dataStructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            recPrintTree(current.left);
            System.out.print(current.data+ " ");
            recPrintTree((current.right));
        }


    }

    public static Node newLeaf(int n) {
        return new Node(n, null, null);
    }

    public static Node insertBST(Node current, int data){
        if(current == null){
            return new Node(data, null,null);
        }
        else if(current.data > data){
             current.left = insertBST(current.left, data);
        }
        else
            current.right = insertBST(current.right,data);
        return current;

    }
    public static void levelOrder(Node root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
            System.out.print(current.data + " ");
        }



    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 1, 5, 4));
        Node root = newLeaf(a.get(0));
        for (int i = 1; i < a.size(); i++) {
            insertBST(root, a.get(i));
        }
        levelOrder(root);
//        recPrintTree(root);

    }
}
