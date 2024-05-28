package Praktikum12;

public class DoubleLinkedListQueue {
    NodeTugas1 head, tail;
    int size;

    public DoubleLinkedListQueue() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int nomorAntrian, String namaPenerima) {
        NodeTugas1 newNode = new NodeTugas1(null, nomorAntrian, namaPenerima, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public NodeTugas1 dequeue() {
        if (isEmpty()) {
            return null;
        }
        NodeTugas1 temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return temp;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("*******************************");
            System.out.println("DAFTAR PENGANTRI VAKSIN");
            System.out.println("*******************************");
            System.out.println("|No.       | Nama   |");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("*******************************");
            System.out.println("DAFTAR PENGANTRI VAKSIN");
            System.out.println("*******************************");
            System.out.println("| No.     | Nama |");
            NodeTugas1 current = head;
            while (current != null) {
                System.out.printf("| %-7d | %-5s |\n", current.nomorAntrian, current.namaPenerima);
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}
