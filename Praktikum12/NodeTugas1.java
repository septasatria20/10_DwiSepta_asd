package Praktikum12;

public class NodeTugas1 {
    int nomorAntrian;
    String namaPenerima;
    NodeTugas1 prev, next;

    public NodeTugas1(NodeTugas1 prev, int nomorAntrian, String namaPenerima, NodeTugas1 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.namaPenerima = namaPenerima;
        this.next = next;
    }
}
