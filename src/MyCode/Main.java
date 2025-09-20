
/// ////////////////////////////////
class Node {

    int value;
    Node next;

    Node(int val) {
        this.value = val;
        this.next = null;
    }

    Node() {
        this(0);
    }
}

/// ///////////////////////////////////////
// Queue dùng linked list
class QueueNode {

    Node head, tail;
    int numberNode;

    // Constructor
    QueueNode() {
        head = null;
        tail = null;
        numberNode = 0;
    }

    // Thêm node vào cuối (enqueue)
    void insert(int x) {
        Node a = new Node(x);
        if (tail == null) { // Queue rỗng
            head = tail = a;
        } else {
            tail.next = a; // nối cuối
            tail = a;      // cập nhật tail
        }
        numberNode++;
    }

    // Xóa node đầu (dequeue)
    void delete() {
        if (numberNode == 0) {
            return; // rỗng

                }Node temp = head;
        head = head.next;  // cập nhật head mới
        temp.next = null;  // giải phóng liên kết (Java GC sẽ thu dọn)
        numberNode--;
        if (numberNode == 0) {
            tail = null; // queue rỗng sau delete

            }}

    // In queue
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

/// /////////////
class Stack {

    int numberNode;
    Node head, tail;

    // Constructor
    Stack() {
        numberNode = 0;
        head = tail = null;
    }

    // Thêm node vào đầu
    public void insert(int x) {
        Node a = new Node(x);
        a.next = head;
        head = a;
        numberNode++;

        // Nếu là node đầu tiên, tail cũng trỏ đến nó
        if (numberNode == 1) {
            tail = head;
        }
    }

    // Xóa node đầu
    public void delete() {
        if (numberNode == 0) {
            return;
        }

        head = head.next;
        numberNode--;

        //Nếu khoonng còn node th không còn Tail
        if (numberNode == 0) {
            tail = null;
        }
    }

    // In ra danh sách
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

/// ////////////////////////////////////////
public class Main {

    public static void main(String[] args) {
        //Queue
        System.out.println("Queue: ");
        QueueNode q = new QueueNode();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.print();   // 10 20 30

        q.delete();
        q.print();   // 20 30

        q.delete();
        q.print();   // 30

        //Stack
        System.out.println("Stack: ");
        Stack list = new Stack();
        list.insert(10);
        list.printList();   // 10 -> null
        list.insert(20);
        list.printList();   // 20 -> 10 -> null

        list.delete();
        list.printList();   // 10 -> null
    }
}
