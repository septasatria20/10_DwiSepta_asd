import java.util.Scanner;

public class PersegiPanjangDemo10 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjangDemo10[] arrayOfPersegiPanjang = new PersegiPanjangDemo10[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjangDemo10();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}
