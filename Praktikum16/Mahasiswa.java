package Praktikum16;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String telf;

    public Mahasiswa(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTelf() {
        return telf;
    }
}