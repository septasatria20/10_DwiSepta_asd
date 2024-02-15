import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("       PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("==============================================");
        System.out.print("Masukkan nilai MK Pancasila                   : ");
        Double pancasila = sc.nextDouble();
        System.out.print("Masukkan nilai MK Basis Data                  : ");
        Double basdat = sc.nextDouble();
        System.out.print("Masukkan nilai MK Sistem Operasi              : ");
        Double sisop = sc.nextDouble();
        System.out.print("Masukkan nilai MK Algoritma dan Struktur Data : ");
        Double algoritma = sc.nextDouble();
        System.out.print("Masukkan nilai MK Agama                       : ");
        Double agama = sc.nextDouble();
        System.out.print("Masukkan nilai MK CTPS                        : ");
        Double ctps = sc.nextDouble();
        System.out.print("Masukkan nilai MK Akuntansi                   : ");
        Double akuntansi = sc.nextDouble();
        System.out.print("Masukkan nilai MK Matematika Lanjut           : ");
        Double matematika = sc.nextDouble();

        // Menghitung bobot nilai
        double bobotPancasila = getBobotNilai(pancasila);
        double bobotBasdat = getBobotNilai(basdat);
        double bobotSisop = getBobotNilai(sisop);
        double bobotAlgoritma = getBobotNilai(algoritma);
        double bobotAgama = getBobotNilai(agama);
        double bobotCtps = getBobotNilai(ctps);
        double bobotAkuntansi = getBobotNilai(akuntansi);
        double bobotMatematika = getBobotNilai(matematika);

        // Menghitung total bobot nilai
        double totalBobotNilai = bobotPancasila + bobotBasdat + bobotSisop + bobotAlgoritma
                + bobotAgama + bobotCtps + bobotAkuntansi + bobotMatematika;

        // Menghitung total SKS
        int totalSKS = 2 + 3 + 3 + 4 + 2 + 3 + 3 + 4;

        // Menghitung IP Semester
        double ipSemester = totalBobotNilai / 8;

        // Menampilkan hasil konversi nilai
        System.out.println("======================================");
        System.out.println("         HASIL KONVERSI NILAI");
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println(    "|        Mata Kuliah        | Nilai Angka | Nilai Huruf | Bobot Nilai |");
        System.out.println("======================================");
        System.out.printf("| Pancasila                 | %.2f        | %s          | %.2f        |\n", pancasila, konversiNilai(pancasila), bobotPancasila);
        System.out.printf("| Basis Data                | %.2f        | %s          | %.2f        |\n", basdat, konversiNilai(basdat), bobotBasdat);
        System.out.printf("| Sistem Operasi            | %.2f        | %s          | %.2f        |\n", sisop, konversiNilai(sisop), bobotSisop);
        System.out.printf("| Algoritma & Struktur Data | %.2f        | %s          | %.2f        |\n", algoritma, konversiNilai(algoritma), bobotAlgoritma);
        System.out.printf("| Agama                     | %.2f        | %s          | %.2f        |\n", agama, konversiNilai(agama), bobotAgama);
        System.out.printf("| CTPS                      | %.2f        | %s          | %.2f        |\n", ctps, konversiNilai(ctps), bobotCtps);
        System.out.printf("| Akuntansi                 | %.2f        | %s          | %.2f        |\n", akuntansi, konversiNilai(akuntansi), bobotAkuntansi);
        System.out.printf("| Matematika Lanjut         | %.2f        | %s          | %.2f        |\n", matematika, konversiNilai(matematika), bobotMatematika);
        System.out.println("======================================");
        System.out.printf("| Total                     |             |             | %.2f        |\n", totalBobotNilai);
        System.out.printf("| IP Semester               |             |             | %.2f        |\n", ipSemester);
        System.out.println("======================================");
    }

    private static String konversiNilai(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 73) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 39) {
            return "D";
        } else {
            return "E";
        }
    }

    private static double getBobotNilai(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return 4.00;
        } else if (nilaiAngka >= 73) {
            return 3.50;
        } else if (nilaiAngka >= 65) {
            return 3.00;
        } else if (nilaiAngka >= 60) {
            return 2.50;
        } else if (nilaiAngka >= 50) {
            return 2.00;
        } else if (nilaiAngka >= 39) {
            return 1.00;
        } else {
            return 0.00;
        }
    }
}
