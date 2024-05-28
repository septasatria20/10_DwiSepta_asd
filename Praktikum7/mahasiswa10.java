package Praktikum7;

public class mahasiswa10 {
    int nim;
    String nama;
    int umur;
    double ipk;

    public mahasiswa10(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    public void tampil() {
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

    
}
