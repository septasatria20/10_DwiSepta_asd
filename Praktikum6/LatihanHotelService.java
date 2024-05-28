package Praktikum6;

public class LatihanHotelService {
    LatihanHotel listHtl[] = new LatihanHotel[5];
    int idx;

    void tambah(LatihanHotel hotel) {
        if (idx < listHtl.length) {
            listHtl[idx] = hotel;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (LatihanHotel hotel : listHtl) {
            hotel.tampil();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listHtl.length - 1; i++) {
            for (int j = 1; j < listHtl.length - i; j++) {
                if (listHtl[j].bintang > listHtl[j - 1].bintang) {
                    LatihanHotel tmp = listHtl[j];
                    listHtl[j] = listHtl[j - 1];
                    listHtl[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listHtl.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listHtl.length; j++) {
                if (listHtl[j].harga < listHtl[idxMin].harga) {
                    idxMin = j;
                }
            }
            LatihanHotel tmp = listHtl[idxMin];
            listHtl[idxMin] = listHtl[i];
            listHtl[i] = tmp;
        }
    }
}
