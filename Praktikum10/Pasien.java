package Praktikum10;

public class Pasien {
    String nama;
    int noID;
    char jenisKelamin;
    int umur;

    public Pasien(String nama, int noID, char jenisKelamin, int umur) {
        this.nama = nama;
        this.noID = noID;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String toString() {
        return "Nama: " + nama + ", No ID: " + noID + ", Jenis Kelamin: " + jenisKelamin + ", Umur: " + umur;
    }
}
