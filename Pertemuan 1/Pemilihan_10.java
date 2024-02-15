import java.util.Scanner;

public class Pemilihan_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");
        System.out.print("Masukkan Nilai Tugas (0-100): ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis (0-100) : ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS (0-100)  : ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS (0-100)  : ");
        uas = sc.nextInt();
        System.out.println("==================================");
        System.out.println("==================================");

        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
            System.out.println("Nilai Akhir: " + nilaiAkhir);

            if (nilaiAkhir >= 80) {
                System.out.println("Nilai Huruf: A");
                System.out.println("Selamat Anda LULUS");
            } else if (nilaiAkhir >= 73) {
                System.out.println("Nilai Huruf: B+");
                System.out.println("Selamat Anda LULUS");
            } else if (nilaiAkhir >= 65) {
                System.out.println("Nilai Huruf: B");
                System.out.println("Selamat Anda LULUS");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Nilai Huruf: C+");
                System.out.println("Selamat Anda LULUS");
            } else if (nilaiAkhir >= 50) {
                System.out.println("Nilai Huruf: C");
                System.out.println("Selamat Anda LULUS");
            } else if (nilaiAkhir >= 39) {
                System.out.println("Nilai Huruf: D");
                System.out.println("Anda Tidak LULUS");
            } else if (nilaiAkhir >= 0) {
                System.out.println("Nilai Huruf: E");
                System.out.println("Anda Tidak LULUS");
            } else {
                System.out.println("Tidak Valid");
            }
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0-100.");
        }
    }
}