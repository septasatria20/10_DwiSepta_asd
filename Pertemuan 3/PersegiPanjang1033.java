import java.util.Scanner;

public class PersegiPanjang1033 {
    public int panjang;
    public int lebar;

    public PersegiPanjang1033(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang1033[] arrayOfPersegiPanjang = new PersegiPanjang1033[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang1033(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}