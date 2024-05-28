import java.util.Scanner;

public class Faktorial_1055_2 {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang ingin dihitung faktorialnya: ");
        int elemen = sc.nextInt();

        Faktorial_1055[] fk = new Faktorial_1055[elemen];

        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial_1055();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.nanoTime();
            int result = fk[i].faktorialBF(fk[i].nilai);
            long endTime = System.nanoTime();
            double executionTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + result);
            System.out.println("Waktu eksekusi: " + executionTimeInSeconds + " detik");
        }

        System.out.println("===============================================================");
        System.out.println("Hasil Faktorial dengan Divide dan Conquer");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.nanoTime();
            int result = fk[i].faktorialDC(fk[i].nilai);
            long endTime = System.nanoTime();
            double executionTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + result);
            System.out.println("Waktu eksekusi: " + executionTimeInSeconds + " detik");
        }
    }
}
