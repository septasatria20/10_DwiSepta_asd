package Praktikum6;

import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa mahasiswa1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa mahasiswa2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa mahasiswa3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa mahasiswa4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa mahasiswa5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(mahasiswa1);
        list.tambah(mahasiswa2);
        list.tambah(mahasiswa3);
        list.tambah(mahasiswa4);
        list.tambah(mahasiswa5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting ASC berdasarkan ipk");
        list.tampil();
    }
}
