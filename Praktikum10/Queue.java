package Praktikum10;

public class Queue {
    int[] data; //elm
    int front; //idx terdepan
    int rear; //idx terbelakang
    int size; //jml q
    int max; //max q

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){ //periksa kosong tidak
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){ //periksa penuh tidak
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){ //memasukkan elemen terdepan tanpa menghapus
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan = " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){ //print semua
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i+1) % max;
                System.out.print(i);
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() { //menghapus q
        if (!IsEmpty()) {
            front = rear = -1; //dengan kembali ke -1
            size = 0; //ukuran 0
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");  
        }
    }

    public void Enqueue(int dt){ //menambah elm baru 
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) { //elm dimasukkan rear
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){ //menghapus elm 
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) { 
                front = rear = -1;
            } else {
                if (front == max -1) { //elm dimasukkan ke front
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    
}