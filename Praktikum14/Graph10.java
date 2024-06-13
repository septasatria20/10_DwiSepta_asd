package Praktikum14;

public class Graph10 {
    int vertex;
    DoubleLinkedList10 list[];

    public Graph10(int v){
        vertex = v;
        list = new DoubleLinkedList10[v];
        for (int i = 0 ; i < v; i++){
            list[i] = new DoubleLinkedList10();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak);

    }

    public void degree(int asal) throws Exception {
        int k, totalin = 0, totalout = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalin;
                }
            }
        }
    
        for (k = 0; k < list[asal].size(); k++) {
            totalout++;
        }
            
        System.out.println("InDegree dari Gedung " + (char) ('A' +asal)+ ": " + totalin);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": "+ totalout);
        System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + (totalin + totalout));
        // System.out.println("Degree dari Gedung" + (char) ('A' +asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                System.out.print((char) ('A' + list[i].get(j))+" (" + list[i].getJarak(j)+" m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    
}