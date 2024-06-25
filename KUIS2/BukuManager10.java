package UASASD10.REUASASD10;
import java.util.ArrayList;
import java.util.List;

public class BukuManager10 {
    private List<Buku10> bukuList;

    public BukuManager10() {
        bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku10 buku) {
        bukuList.add(buku);
    }

    public void hapusBuku(String isbn) {
        bukuList.removeIf(b -> b.getIsbn().equals(isbn));
    }

    public Buku10 cariBuku(String isbn) {
        for (Buku10 b : bukuList) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public void cetakSemuaBuku() {
        for (Buku10 b : bukuList) {
            System.out.println(b);
        }
    }
}

