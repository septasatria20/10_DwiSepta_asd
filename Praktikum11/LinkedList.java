package Praktikum11;

public class LinkedList {
    Node head;

    public void print() { //jika ada di print, jika tidak di di print else
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) { //menambah node diawal
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) { //menambah node diakhir
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode; //jika kosong menjadi head
        } else {
            Node currentNode = head; // jika ada isinya dihubungkan dengan head,dan ini menjadi head baru
            while (currentNode.next != null) { 
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) { //menyisipkan node
        Node newNode = new Node(input, null);

        if (!isEmpty()) {
            Node currentNode = head;

            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    private boolean isEmpty() { //periksa kosong tidak
        return head == null;
    }

    public int getData(int index) { //mencari data diposisi tertentu
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int indexOf(int key) { //mencari indeks diposisi tertentu

        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() { //menghapus node awal
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() { //menghapus node akhir
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node currentNode = head;

                while (currentNode.next.next != null) {
                    currentNode = currentNode.next;
                }

                currentNode.next = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void remove(int key) { //menghapus nilai tertentu
        if (!isEmpty()) {
            if (head.data == key) {
                removeFirst();
            } else {
                Node currentNode = head;

                while (currentNode.next != null) {
                    if (currentNode.next.data == key) {
                        currentNode.next = currentNode.next.next;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
