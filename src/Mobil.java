public class Mobil {
    String namamobil;
    String warna;
    int tahunpembuatan;
    String kondisi;
    int harga;

    public void diskon() {
        this.harga = this.harga - 1000000;
    }
    void infodiskon() {
        System.out.println("Selamat Anda Mendapatkan Diskon");
    }

}
