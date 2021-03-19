package dataStructure;

public class linkedList {

    static class Node {
        public Node(int d, Node n) {
            data = d;
            next = n;
        }
        int data;
        Node next;
    }
    static void printLL(Node head) {
        Node current = head;
        System.out.print("list is:  ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
//     static Node addNode(int item) {
//        return new Node(item, null);
//    }
    public static Node newLL(int item) {
        return new Node(item, null);
    }
    public static void addNode(Node head, int item) {

        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(item, null);
    }

    static int length(Node head){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
           return count;
    }
    public static Node addNodeAtIndex(Node head, int index, int item){
        int counter = 0;
        Node current = head;
        Node current1 = head;
        if (head == null) {
            if (index == 0) {
                return new Node(item, null);
            }
            System.out.println("No Linked list exists");
        }
        while(current != null && counter < (index-1)){
            current = current.next;
            current1 = current1.next;
            counter++;
        }
        current.next = new Node(item, current1.next);
        return head;
    }
    public static void main(String[] args) {
//        Node k = new Node(1, null);
//        k.next = new Node(2, null);
//        int item = 9;
//        k.next.next = new Node(3, null);
//        Node h2 = addNode(null, 9);
//        addNode(k,item);
//        printLL(k);
     //  System.out.println(printLL(addNode(k,3)));
       // System.out.println(k);
        Node h = newLL(4);
        addNode( h,5);
        addNode(h,6);
//        printLL(h);
        addNodeAtIndex(h,2, 88);
        printLL(h);
    }
}
