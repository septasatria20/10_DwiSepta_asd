package UASASD10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPerpajakan10 {
    private static List<Kendaraan10> daftarKendaraan = new ArrayList<>();
    private static List<TransaksiPajak10> daftarTransaksi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Data Kendaraan
        Kendaraan10 kendaraan1 = new Kendaraan10("AG 1234 AB", "Septa", "Motor: Honda Supra 125", 125, 2016, 6);
        Kendaraan10 kendaraan2 = new Kendaraan10("N 5678 CD", "Satria", "Motor: Yamaha NMAX 155", 155, 2018, 8);
        Kendaraan10 kendaraan3 = new Kendaraan10("B 1111 AA", "Dwi", "Mobil: Mitsubishi Eterna", 1000, 1998, 4);
        Kendaraan10 kendaraan4 = new Kendaraan10("A 2222 BB", "Agung", "Mobil: Honda Jazz", 1500, 2014, 1);

        daftarKendaraan.add(kendaraan1);
        daftarKendaraan.add(kendaraan2);
        daftarKendaraan.add(kendaraan3);
        daftarKendaraan.add(kendaraan4);

        do {
            System.out.println("================================================");
            System.out.println("             APLIKASI PAJAK KENDARAAN           ");
            System.out.println("================================================");
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Lihat Data Kendaraan");
            System.out.println("3. Bayar Pajak");
            System.out.println("4. Lihat Transaksi Pajak");
            System.out.println("5. Urutkan Transaksi Sesuai Nama Pemilik");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKendaraan(scanner);
                    break;
                case 2:
                    lihatDataKendaraan();
                    break;
                case 3:
                    bayarPajak(scanner);
                    break;
                case 4:
                    lihatTransaksiPajak();
                    break;
                case 5:
                    urutkanTransaksiSesuaiNama();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 6);

        scanner.close();
    }

    private static void tambahKendaraan(Scanner scanner) {
        System.out.print("Masukkan nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan nama kendaraan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis kendaraan (Motor/Mobil): ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan CC kendaraan: ");
        int cc = scanner.nextInt();
        System.out.print("Masukkan tahun kendaraan: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan bulan harus bayar pajak: ");
        int bulanHarusBayar = scanner.nextInt();
        scanner.nextLine();

        Kendaraan10 kendaraanBaru = new Kendaraan10(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        daftarKendaraan.add(kendaraanBaru);
        System.out.println("Kendaraan berhasil ditambahkan:\n" + kendaraanBaru);
    }

    private static void lihatDataKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("Belum ada kendaraan terdaftar.");
        } else {
            System.out.println("Daftar Kendaraan:");
            for (Kendaraan10 kendaraan : daftarKendaraan) {
                System.out.println(kendaraan);
            }
        }
    }

    private static void bayarPajak(Scanner scanner) {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("Belum ada kendaraan terdaftar untuk melakukan pembayaran pajak.");
            return;
        }
    
        System.out.println("Daftar Kendaraan:");
        for (int i = 0; i < daftarKendaraan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKendaraan.get(i).getNoTNKB() + " - " + daftarKendaraan.get(i).getNama());
        }
    
        System.out.print("Pilih nomor kendaraan yang akan membayar pajak: ");
        int nomorKendaraan = scanner.nextInt();
        scanner.nextLine();
    
        if (nomorKendaraan < 1 || nomorKendaraan > daftarKendaraan.size()) {
            System.out.println("Nomor kendaraan tidak valid.");
            return;
        }
    
        Kendaraan10 kendaraanDipilih = daftarKendaraan.get(nomorKendaraan - 1);
    
        System.out.print("Masukkan bulan pembayaran pajak: ");
        int bulanBayar = scanner.nextInt();
        scanner.nextLine();
    
        long nominalBayar = hitungNominalBayar(kendaraanDipilih);
    
        TransaksiPajak10 transaksiBaru = new TransaksiPajak10(kendaraanDipilih.getNama(), nominalBayar, 0, bulanBayar, kendaraanDipilih);
        daftarTransaksi.add(transaksiBaru);
        System.out.println("Pembayaran pajak berhasil dilakukan.");
    }
    

    private static long hitungNominalBayar(Kendaraan10 kendaraan) {
        long tarifPajak = 0;
        int cc = kendaraan.getCc();
        String jenis = kendaraan.getJenis().toLowerCase();

        if (jenis.contains("motor")) {
            if (cc < 100) {
                tarifPajak = 100000;
            } else if (cc >= 100 && cc <= 250) {
                tarifPajak = 250000;
            } else if (cc > 250) {
                tarifPajak = 500000;
            }
        } else if (jenis.contains("mobil")) {
            if (cc < 1000) {
                tarifPajak = 750000;
            } else if (cc >= 1000 && cc <= 2500) {
                tarifPajak = 1000000;
            } else if (cc > 2500) {
                tarifPajak = 1500000;
            }
        }

        return tarifPajak;
    }

    private static void lihatTransaksiPajak() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi pajak yang dilakukan.");
        } else {
            System.out.println("Daftar Transaksi Pajak:");
            for (TransaksiPajak10 transaksi : daftarTransaksi) {
                System.out.println(transaksi);
            }
        }
    }

    private static void urutkanTransaksiSesuaiNama() {
        int n = daftarTransaksi.size();
        TransaksiPajak10 temp;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (daftarTransaksi.get(j).getNamaPemilik().compareTo(daftarTransaksi.get(j+1).getNamaPemilik()) > 0) {
                    temp = daftarTransaksi.get(j);
                    daftarTransaksi.set(j, daftarTransaksi.get(j+1));
                    daftarTransaksi.set(j+1, temp);
                }
            }
        }

        System.out.println("Transaksi Pajak berhasil diurutkan berdasarkan nama pemilik.");
        lihatTransaksiPajak();
    }
}
