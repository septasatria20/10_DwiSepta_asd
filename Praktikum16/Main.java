package Praktikum16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private static ArrayList<Nilai> daftarNilai = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("*********************************************");
            System.out.println("DATA PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*********************************************");

            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    private static void inputNilai() {
        while (true) {
            System.out.println("\nInput Nilai");
            
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = scanner.nextLine();
            
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Kode Mata Kuliah: ");
            String kode = scanner.nextLine();
            
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMataKuliah = scanner.nextLine();
            
            System.out.print("Masukkan Nilai: ");
            double nilai = scanner.nextDouble();
            scanner.nextLine(); 
            
            Mahasiswa mahasiswa = cariMahasiswa(nim);
            if (mahasiswa == null) {
                System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                return;
            }
            
            MataKuliah mataKuliah = cariMataKuliah(kode);
            if (mataKuliah == null) {
                System.out.println("Mata Kuliah dengan kode tersebut tidak ditemukan.");
                return;
            }
            
            daftarNilai.add(new Nilai(mahasiswa, mataKuliah, nilai));
            System.out.println("Nilai berhasil dimasukkan.");
            
            System.out.print("Apakah ingin menambahkan nilai untuk mahasiswa lain? (y/n): ");
            String tambah = scanner.nextLine();
            if (!tambah.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    

    private static void tampilNilai() {
        System.out.println("\nTampil Nilai");
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            Mahasiswa mahasiswa = nilai.getMahasiswa();
            MataKuliah mataKuliah = nilai.getMataKuliah();
            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" +
                    mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilai.getNilai());
        }
    }

    private static void cariNilaiMahasiswa() {
        System.out.println("\nMencari Nilai Mahasiswa");
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            return;
        }

        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            if (nilai.getMahasiswa().getNim().equals(nim)) {
                MataKuliah mataKuliah = nilai.getMataKuliah();
                System.out.println(nim + "\t" + mahasiswa.getNama() + "\t" +
                        mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilai.getNilai());
            }
        }
    }

    private static void urutDataNilai() {
        System.out.println("\nUrut Data Nilai");
        Collections.sort(daftarNilai, Comparator.comparingDouble(Nilai::getNilai));
        tampilNilai();
    }

    private static Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    private static MataKuliah cariMataKuliah(String kode) {
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getKode().equals(kode)) {
                return mataKuliah;
            }
        }
        return null;
    }
}
