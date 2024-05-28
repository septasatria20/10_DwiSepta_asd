package Praktikum10;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("\nMasukkan kapasitas queue : "); 
        int jumlah = sc.nextInt();
        Bank antri = new Bank(jumlah);

        do {
            menu();
            System.out.print("Masukkan Pilihan : "); 
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;

                case 2:
                    Nasabah data = antri.Dequeue();
                    if(data != null) {
                        System.out.println("Nasabah yang dikeluarkan: " + data.namaNasabah);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }

    public static void menu(){
        System.out.println("\nPilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("----------------------------------");
    }
}
