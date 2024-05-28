package Praktikum12;

import java.util.Scanner;

public class DLLMainTugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedListQueue queue = new DoubleLinkedListQueue();
        int choice;
        do {
            System.out.println("============================");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("============================");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("****************************************");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nomor antrian: ");
                    int nomorAntrian = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama penerima: ");
                    String namaPenerima = scanner.nextLine();
                    queue.enqueue(nomorAntrian, namaPenerima);
                    break;

                case 2:
                    NodeTugas1 removedNode = queue.dequeue();
                    if (removedNode != null) {
                        System.out.println(removedNode.namaPenerima + " telah selesai divaksinasi");
                    } else {
                        System.out.println("Tidak ada pengantri yang menunggu.");
                    }
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
