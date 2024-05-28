package Praktikum12;

class DoubleLinkedListTugas2 {
    NodeTugas2 head, tail;

    public DoubleLinkedListTugas2() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(Film film) {
        NodeTugas2 newNode = new NodeTugas2(film);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Film film) {
        NodeTugas2 newNode = new NodeTugas2(film);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(Film film, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(film);
        } else {
            NodeTugas2 newNode = new NodeTugas2(film);
            NodeTugas2 current = head;
            int count = 0;
            while (count < index - 1 && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAtIndex(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat menghapus");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            NodeTugas2 current = head;
            int count = 0;
            while (count < index && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        NodeTugas2 current = head;
        while (current != null) {
            current.film.printInfo();
            current = current.next;
        }
    }

    public void searchByID(int id) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        NodeTugas2 current = head;
        boolean found = false;
        while (current != null) {
            if (current.film.id == id) {
                System.out.println("Film dengan ID " + id + " ditemukan:");
                current.film.printInfo();
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan");
        }
    }

    public void sortByRatingDesc() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        NodeTugas2 current = head;
        while (current != null) {
            NodeTugas2 temp = current.next;
            while (temp != null) {
                if (temp.film.rating > current.film.rating) {
                    Film tempFilm = temp.film;
                    temp.film = current.film;
                    current.film = tempFilm;
                }
                temp = temp.next;
            }
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
