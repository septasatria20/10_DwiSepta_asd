import java.util.Scanner;

public class Sum_1044 {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum_1044(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int i, int r) {
        if (i == r) {
            return arr[i];
        } else if (i < r) {
            int mid = (i + r) / 2;
            double isum = totalDC(arr, i, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return isum + rsum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();

        Sum_1044 sm = new Sum_1044(elm);
        System.out.println("==============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- " + (i + 1) + " - ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("==============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("==============================================================");
        System.out.println("Algoritma Devide dan Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

    }
}
