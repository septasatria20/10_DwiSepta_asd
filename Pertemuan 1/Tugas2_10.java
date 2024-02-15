import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-3): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 0-3.");
            }
        }
    }

    public static void hitungKecepatan() {
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu: ");
        double waktu = scanner.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.print("Kecepatan= " + kecepatan);
        System.out.println(" ");
    }

    public static void hitungJarak() {
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan: ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu: ");
        double waktu = scanner.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.print("Jarak= " + jarak);
        System.out.println(" ");
    }

    public static void hitungWaktu() {
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan: ");
        double kecepatan = scanner.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.print("Waktu= " + waktu);
        System.out.println(" ");
    }
}
