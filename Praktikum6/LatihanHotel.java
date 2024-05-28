package Praktikum6;

public class LatihanHotel {
    String nama, kota;
    int harga;
    byte bintang;

    LatihanHotel(){}

    public LatihanHotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("kota: " + kota);
        System.out.println("harga: " + harga);
        System.out.println("bintang: " + bintang);
    }
}