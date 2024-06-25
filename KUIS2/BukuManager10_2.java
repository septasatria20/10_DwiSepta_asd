package UASASD10.REUASASD10;
import java.util.LinkedList;

public class BukuManager10_2 {
    private LinkedList<Buku10_2> bukuList;

    public BukuManager10_2() {
        bukuList = new LinkedList<>();
    }

    public void tambahBuku(Buku10_2 buku) {
        bukuList.add(buku);
    }

    public void hapusBuku(String isbn) {
        bukuList.removeIf(b -> b.getIsbn().equals(isbn));
    }

    public Buku10_2 cariBuku(String isbn) {
        for (Buku10_2 b : bukuList) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public void cetakSemuaBuku() {
        for (Buku10_2 b : bukuList) {
            System.out.println(b);
        }
    }
}

