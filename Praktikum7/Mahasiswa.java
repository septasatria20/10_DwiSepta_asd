package Praktikum7;
public class Mahasiswa {
    private int nim;
    private String nama;
    private int umur;
    private double ipk;

    public Mahasiswa(int nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void tampil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}
