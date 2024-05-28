package Praktikum10;

public class QueueTugas {
    Pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public QueueTugas(int n) {
        max = n;
        antrian = new Pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = antri;
        size++;
    }

    public Pasien dequeue() {
        Pasien dt = null;
        if (!isEmpty()) {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println(antrian[i]);
            i = (i + 1) % max;
        }
        System.out.println(antrian[i]);
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Data pasien terdepan: " + antrian[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Data pasien terbelakang: " + antrian[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nama) {
        boolean found = false;
        int i = front;
        int position = 1;

        while (i != rear) {
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                found = true;
                break;
            }
            i = (i + 1) % max;
            position++;
        }

        if (antrian[i].nama.equalsIgnoreCase(nama)) {
            found = true;
        }

        if (found) {
            System.out.println("Pasien " + nama + " berada di posisi antrian ke-" + position);
        } else {
            System.out.println("Pasien " + nama + " tidak ditemukan dalam antrian");
        }
    }

    public void daftarPasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar Pasien:");
        for (int i = front, count = 1; count <= size; i = (i + 1) % max, count++) {
            System.out.println(count + ". " + antrian[i]);
        }
    }
}
