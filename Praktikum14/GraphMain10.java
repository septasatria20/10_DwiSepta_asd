package Praktikum14;

public class GraphMain10 {
    public static void main(String[] args) {
        Graph10 gedung = new Graph10(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        try {
            System.out.println("Graf sebelum edge dihapus:");
            gedung.degree(0);
            gedung.printGraph();
            // gedung.removeEdge(1, 3);
            // System.out.println("Graf setelah edge (1, 3) dihapus:");
            // gedung.printGraph();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
