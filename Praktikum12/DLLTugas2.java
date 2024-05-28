package Praktikum12;
import java.util.Scanner;

public class DLLTugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedListTugas2 dll = new DoubleLinkedListTugas2();

        int choice;
        do {
            System.out.println("======================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("======================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada indeks tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari berdasarkan ID film");
            System.out.println("9. Urutkan data rating film - DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID film: ");
                    int idFirst = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan judul film: ");
                    String judulFirst = scanner.nextLine();
                    System.out.print("Masukkan rating film: ");
                    int ratingFirst = scanner.nextInt();
                    Film filmFirst = new Film(idFirst, judulFirst, ratingFirst);
                    dll.addFirst(filmFirst);
                    break;
                case 2:
                    System.out.print("Masukkan ID film: ");
                    int idLast = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan judul film: ");
                    String judulLast = scanner.nextLine();
                    System.out.print("Masukkan rating film: ");
                    int ratingLast = scanner.nextInt();
                    Film filmLast = new Film(idLast, judulLast, ratingLast);
                    dll.addLast(filmLast);
                    break;
                case 3:
                    System.out.print("Masukkan ID film: ");
                    int idIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan judul film: ");
                    String judulIndex = scanner.nextLine();
                    System.out.print("Masukkan rating film: ");
                    int ratingIndex = scanner.nextInt();
                    System.out.print("Masukkan indeks: ");
                    int index = scanner.nextInt();
                    Film filmIndex = new Film(idIndex, judulIndex, ratingIndex);
                    dll.addAtIndex(filmIndex, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indexRemove = scanner.nextInt();
                    dll.removeAtIndex(indexRemove);
                    break;
                case 7:
                    System.out.println("Daftar Film:");
                    dll.printList();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang ingin dicari: ");
                    int searchID = scanner.nextInt();
                    dll.searchByID(searchID);
                    break;
                case 9:
                    dll.sortByRatingDesc();
                    System.out.println("Data film telah diurutkan berdasarkan rating secara descending");
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (choice != 10);

        scanner.close();
    }
}
