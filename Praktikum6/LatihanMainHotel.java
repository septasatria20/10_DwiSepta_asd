package Praktikum6;

public class LatihanMainHotel {
    public static void main(String[] args) {
        LatihanHotelService list = new LatihanHotelService();
        LatihanHotel hotel1 = new LatihanHotel("Hotel Balaraja", "Balaraja", 150000, (byte)1 );
        LatihanHotel hotel2 = new LatihanHotel("Hotel Bintang", "Bintang", 200000, (byte)3);
        LatihanHotel hotel3 = new LatihanHotel("Hotel Grand Mansion", "Blitar", 900000, (byte)5);
        LatihanHotel hotel4 = new LatihanHotel("Hotel Mandala", "Blitar", 400000, (byte)4);
        LatihanHotel hotel5 = new LatihanHotel("Hotel Brawijaya", "Brawijaya", 300000, (byte)2);

        list.tambah(hotel1);
        list.tambah(hotel2);
        list.tambah(hotel3);
        list.tambah(hotel4);
        list.tambah(hotel5);

        System.out.println("Data hotel sebelum sorting = ");
        list.tampil();

        System.out.println("Data hotel setelah sorting ASC berdasarkan harga hotel");
        list.selectionSort();
        list.tampil();
    }
}
