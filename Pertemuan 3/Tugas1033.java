import java.util.Scanner;

public class Tugas1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        Mahasiswa[] listMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(" ");
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            listMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : listMahasiswa) {
            totalIpk += mahasiswa.getIpk();
            mahasiswa.displayInfo();
        }
        
        double rataRataIpk = totalIpk / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}
