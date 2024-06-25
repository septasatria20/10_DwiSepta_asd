package UASASD10.REUASASD10;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        BukuManager10 manager = new BukuManager10();
        Scanner scanner = new Scanner(System.in);

        // datanya
        manager.tambahBuku(new Buku10("001", "Pemrograman Java", "Alice"));
        manager.tambahBuku(new Buku10("002", "Struktur Data", "Bob"));
        manager.tambahBuku(new Buku10("003", "Algoritma", "Charlie"));
        manager.tambahBuku(new Buku10("004", "Desain Sistem", "Dave"));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Cetak Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = scanner.next();
                    System.out.print("Judul: ");
                    String judul = scanner.next();
                    System.out.print("Pengarang: ");
                    String pengarang = scanner.next();
                    manager.tambahBuku(new Buku10(isbn, judul, pengarang));
                    break;
                case 2:
                    System.out.print("ISBN: ");
                    isbn = scanner.next();
                    manager.hapusBuku(isbn);
                    break;
                case 3:
                    System.out.print("ISBN: ");
                    isbn = scanner.next();
                    Buku10 b = manager.cariBuku(isbn);
                    if (b != null) {
                        System.out.println(b);
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 4:
                    manager.cetakSemuaBuku();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

