package Praktikum12;

class Film {
    int id;
    String judul;
    int rating;

    public Film(int id, String judul, int rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Judul: " + judul + ", Rating: " + rating);
    }
}
