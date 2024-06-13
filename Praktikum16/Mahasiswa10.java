package Praktikum16;

public class Mahasiswa10 {
    String nim;
    String nama;
    String notelp;
    
    public Mahasiswa10() {
    }

    public Mahasiswa10 (String nim, String nama, String notelp) {
    this.nim = nim;
    this.nama = nama;
    this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa(" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp +'}';
    }

    public static void main(String[] args) {
        ListMahasiswa10 lm = new ListMahasiswa10();
        Mahasiswa10 m = new Mahasiswa10 ("201234", "Noureen", "021xx1");
        Mahasiswa10 m1 = new Mahasiswa10 ("201235", "Akhleema", "021xx2"); 
        Mahasiswa10 m2 = new Mahasiswa10 ("201236", "Shannum", "021xx3");

        lm.tambah (m, m1, m2);

        lm.tampil();

        lm.update(lm.linearSearch("201235"), new Mahasiswa10 ("201235", "Akhleema Lela", "821xx2")); System.out.println("");
        lm.tampil();
    }
}
