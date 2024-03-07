import java.util.Scanner;

public class UTS_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] barangs = {"K01 - Sabun", "K02 - Pasta Gigi", "K03 - Biore", "K04 - Shampoo", "K05 - Sikat Gigi"};
        int[] harga = {1000, 2000, 3000, 4000, 5000};
        int[] stok = {5, 10, 23, 55, 0};
        int[] pembelians = new int[barangs.length];

        System.out.println("Dwi Septa Satria Agung");
        System.out.println("10 / 1E SIB");
        System.out.println("Kuis 1 ASD");
        System.out.println("@_septasatria");
        System.out.println(" ");

        System.out.println("======================");
        System.out.println("TOKO POLINEMA ABSEN 10");
        System.out.println("======================");

        boolean belanja = true;
        while (belanja) {
            menu();

            System.out.print("Pilih menu (1-4): ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    listBarang(barangs, harga, stok);
                    break;
                case 2:
                    beli(scanner, barangs, harga, stok, pembelians);
                    break;
                case 3:
                    pembelians(barangs, harga, pembelians);
                    break;
                case 4:
                    belanja = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }

        System.out.println("\nTerima kasih telah berbelanja :) hehe !");
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Tampilkan Barang");
        System.out.println("2. Beli");
        System.out.println("3. Tampilkan Pembelian");
        System.out.println("4. Keluar");
    }

    public static void listBarang(String[] barangs, int[] harga, int[] stok) {
        System.out.println("Daftar Barang:");
        System.out.println("Kode\tNama\t\tHarga\tStok");
        for (int i = 0; i < barangs.length; i++) {
            System.out.printf("%s\t%-15s\tRp%,5d\t%d\n", barangs[i].substring(0, 3), barangs[i].substring(6), harga[i], stok[i]);
        }
    }

    public static void beli(Scanner scanner, String[] barangs, int[] harga, int[] stok, int[] pembelians) {
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.print("\nMasukkan kode barang: ");
            String kodeBarang = scanner.nextLine().trim();

            int itemIndex = findBarangsIndex(kodeBarang, barangs);
            if (itemIndex == -1) {
                System.out.println("Barang tidak ditemukan.\n");
                continue; // Mengulangi loop pembelian jika barang tidak ditemukan
            }

            if (stok[itemIndex] == 0) {
                System.out.println("Stok barang habis.\n");
                continue; // Mengulangi loop pembelian jika stok habis
            }

            System.out.print("Masukkan jumlah beli: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            if (quantity > stok[itemIndex]) {
                System.out.println("Stok tidak mencukupi.\n");
                continue; // Mengulangi loop pembelian jika stok tidak mencukupi
            }

            stok[itemIndex] -= quantity;
            pembelians[itemIndex] += quantity;

            int hargabarang = quantity * harga[itemIndex];
            System.out.println("\nAnda membeli " + quantity + " " + barangs[itemIndex] + " seharga Rp" + hargabarang);

            System.out.print("\nApakah akan belanja lagi (Y/N)? ");
            char choice = scanner.next().charAt(0);
            continueShopping = (choice == 'Y' || choice == 'y');
            scanner.nextLine();
        }
    }

    public static void pembelians(String[] barangs, int[] harga, int[] pembelians) {
        System.out.println("\nRiwayat Pembelian:");
        System.out.println("Kode\tNama\t\tHarga\tJumlah\tTotal");
        int totalCost = 0;
        for (int i = 0; i < barangs.length; i++) {
            if (pembelians[i] > 0) {
                int hargabarang = harga[i] * pembelians[i];
                totalCost += hargabarang;
                System.out.printf("%s\t%-15s\tRp%,5d\t%d\tRp%,5d\n",
                        barangs[i].substring(0, 3), barangs[i].substring(6), harga[i], pembelians[i], hargabarang);
            }
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Total Belanja:\tRp%,5d\n", totalCost);
    }

    public static int findBarangsIndex(String kodeBarang, String[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].startsWith(kodeBarang)) {
                return i;
            }
        }
        return -1;
    }
}
