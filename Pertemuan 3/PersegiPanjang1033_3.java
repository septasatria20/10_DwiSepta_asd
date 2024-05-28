import java.util.Scanner;

public class PersegiPanjang1033_3 {
    private int panjang;
    private int lebar;

    public PersegiPanjang1033_3(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        PersegiPanjang1033_3[] arrayOfPersegiPanjang = new PersegiPanjang1033_3[jumlahPersegiPanjang];

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang1033_3(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println(" ");
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
            System.out.println();
        }
    }
}
