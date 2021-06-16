package dataStructure;

public class LLPractise {

        static class Node{
            int data;
            Node next;
            public Node(int d, Node n) {
                data = d;
                next = n;
            }
        }
        //public static Node insert(int n, Node head)
        public static void main(String[] args) {

            Node head = null;
            int[] a = new int[5];
            int count =1;
            for(int i = 0; i < a.length; i++) {
                a[i] = count;
                count++;
            }
            for(int j = 0; j < a.length; j++) {
                head = addNode(head,a[j]);
            }

            printLL(head);
        }
        public static void printLL(Node head) {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        public static Node addNode(Node head, int number) {
            if(head == null) {
                return new Node(number,null);
            }
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(number,null);
            return head;
        }

    }


