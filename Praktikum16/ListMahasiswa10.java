package Praktikum16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa10 {
    List<Mahasiswa10> mahasiswas = new ArrayList<>();
    
    public void tambah (Mahasiswa10... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus (int index) { 
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa10 mhs) { 
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch (String nim) {
        for (int i=0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
}