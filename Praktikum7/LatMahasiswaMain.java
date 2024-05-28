package Praktikum7;
import java.util.Scanner;

public class LatMahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("--------------------");
            System.out.print("NIM\t: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nama\t: ");
            String nama = scanner.nextLine();
            System.out.print("Umur\t: ");
            int umur = scanner.nextInt();
            System.out.print("IPK\t: ");
            double ipk = scanner.nextDouble();

            daftarMahasiswa[i] = new Mahasiswa(nim, nama, umur, ipk);
        }


        System.out.println("------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.tampil();
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        scanner.nextLine();
        String namaCari = scanner.nextLine();

        boolean ditemukan = false;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNama().equalsIgnoreCase(namaCari)) {
                System.out.println("Data mahasiswa dengan nama " + namaCari + " ditemukan:");
                mahasiswa.tampil();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan nama " + namaCari + " tidak ditemukan.");
        }
    }
}
