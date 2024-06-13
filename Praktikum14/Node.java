package Praktikum14;

public class Node {
    int data;
    Node prev, next;
    int jarak;

    Node (Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
