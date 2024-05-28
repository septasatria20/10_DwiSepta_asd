package Praktikum10;

public class Nasabah {
    public String nomorRekening;
    public String namaNasabah;
    public String alamat;
    public int umur;
    public double saldo;

    public Nasabah(){
        
    }

    public Nasabah(String norek, String nama, String alamat, int umur, double saldo){
        this.nomorRekening = norek;
        this.namaNasabah = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}

