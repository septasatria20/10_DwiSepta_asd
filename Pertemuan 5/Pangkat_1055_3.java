import java.util.Scanner;

public class Pangkat_1055_3 {
    public int nilai, pangkat;

    public Pangkat_1055_3(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat_1055_3[] png = new Pangkat_1055_3[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat_1055_3(nilai, pangkat);
        }

        System.out.println("============================================================");
        System.out.println("Pilih metode yang ingin digunakan:");
        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide dan Conquer");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = sc.nextInt();

        System.out.println("============================================================");
        switch (pilihan) {
            case 1:
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat dengan Divide dan Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("============================================================");

    }
}
