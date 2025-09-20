//package MyCode;
//
//class Node {
//    int value;
//    Node next;
//
//    Node(int val) {
//        this.value = val;
//        this.next = null;
//    }
//
//    Node() {
//        this(0);
//    }
//}
//
//class Stack {
//    int numberNode;
//    Node head, tail;
//
//    // Constructor
//    Stack() {
//        numberNode = 0;
//        head = tail = null;
//    }
//
//    // Thêm node vào đầu
//    public void insert(int x) {
//        Node a = new Node(x);
//        a.next = head;
//        head = a;
//        numberNode++;
//
//        // Nếu là node đầu tiên, tail cũng trỏ đến nó
//        if (numberNode == 1) {
//            tail = head;
//        }
//    }
//
//    // Xóa node đầu
//    public void delete() {
//        if (numberNode == 0) return;
//
//        head = head.next;
//        numberNode--;
//
//        //Nếu khoonng còn node th không còn Tail
//        if (numberNode == 0) {
//            tail = null;
//        }
//    }
//
//    // In ra danh sách
//    public void printList() {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.value + " -> ");
//            curr = curr.next;
//        }
//        System.out.println("null");
//    }
//}
//
//public class MyStack {
//    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        Stack list = new Stack();
//        list.insert(10);
//        list.insert(20);
//        list.printList();   // 20 -> 10 -> null
//
//        list.delete();
//        list.printList();   // 10 -> null
//    }
//}
