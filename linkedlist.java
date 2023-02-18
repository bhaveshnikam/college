public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void addlast(int data) {
        Node newnoNode = new Node(data);
        if (head == null) {
            head = tail = newnoNode;
            return;
        }
        tail.next = newnoNode;
        tail = newnoNode;
    }

    public static void addmiddle(int data, int index) {
        Node newnode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void removefirst() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        }
        head = head.next;
    }

    public static void removelast() {
        if (head == null) {
            return;
        }
        Node temp = head;

    }

    public static void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("this is empty");
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        addfirst(24);
        addfirst(25);
        addfirst(2);
        addmiddle(32, 1);
        addlast(20);
        addlast(35);
        removefirst();
        removelast();
        // System.out.println(ll);
        print();
    }
}
