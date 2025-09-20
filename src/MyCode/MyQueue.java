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
/// / Queue dùng linked list
//class QueueNode {
//    Node head, tail;
//    int numberNode;
//
//    // Constructor
//    QueueNode() {
//        head = null;
//        tail = null;
//        numberNode = 0;
//    }
//
//    // Thêm node vào cuối (enqueue)
//    void insert(int x) {
//        Node a = new Node(x);
//        if (tail == null) { // Queue rỗng
//            head = tail = a;
//        } else {
//            tail.next = a; // nối cuối
//            tail = a;      // cập nhật tail
//        }
//        numberNode++;
//    }
//
//    // Xóa node đầu (dequeue)
//    void delete() {
//        if (numberNode == 0) return; // rỗng
//        Node temp = head;
//        head = head.next;  // cập nhật head mới
//        temp.next = null;  // giải phóng liên kết (Java GC sẽ thu dọn)
//        numberNode--;
//        if (numberNode == 0) tail = null; // queue rỗng sau delete
//    }
//
//    // In queue
//    void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//
//// Main test
//public class MyQueue {
//    public static void main(String[] args) {
//        QueueNode q = new QueueNode();
//        q.insert(10);
//        q.insert(20);
//        q.insert(30);
//        q.print();   // 10 20 30
//
//        q.delete();
//        q.print();   // 20 30
//
//        q.delete();
//        q.print();   // 30
//    }
//}
