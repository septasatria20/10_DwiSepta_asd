package Praktikum10;

import java.util.Scanner;

public class MainKlinikTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasitas antrian : "); 
        int jumlah = sc.nextInt();
        sc.nextLine();

        QueueTugas antri = new QueueTugas(jumlah);

        do {
            menu();
            System.out.print("Masukkan Pilihan : "); 
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No ID: ");
                    int noID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelamin = sc.nextLine().charAt(0);
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();

                    Pasien pasien = new Pasien(nama, noID, jenisKelamin, umur);
                    antri.enqueue(pasien);
                    break;

                case 2:
                    Pasien pasienKeluar = antri.dequeue();
                    if (pasienKeluar != null) {
                        System.out.println("Pasien " + pasienKeluar.nama + " telah dikeluarkan dari antrian.");
                    } else {
                        System.out.println("Antrian masih kosong.");
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    antri.print();
                    break;
            }
        } while (pilih >= 1 && pilih <= 7);

        sc.close();
    }

    public static void menu() {
        System.out.println("\nPilih Menu : ");
        System.out.println("1. Daftar Antrian Pasien");
        System.out.println("2. Pasien Keluar");
        System.out.println("3. Lihat Pasien Terdepan");
        System.out.println("4. Lihat Pasien Terbelakang");
        System.out.println("5. Lihat Semua Antrian");
        System.out.println("----------------------------------");
    }
}
