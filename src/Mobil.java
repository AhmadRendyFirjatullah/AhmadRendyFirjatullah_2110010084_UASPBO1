public class Mobil {
    String namapembeli;
    String warna;
    int tahunpembuatan;
    String kondisi;
    int harga;

    public void diskon() {
        this.harga = this.harga - 1000000;
    }
    void infodiskon() {
        System.out.println("\t\t\tSelamat Anda Mendapatkan Diskon");
    }

    //Getter and Setter
    public String getnamapembeli() {
        return namapembeli;
    }
    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public int getTahunpembuatan() {
        return tahunpembuatan;
    }
    public void setTahunpembuatan(int tahunpembuatan) {
        this.tahunpembuatan = tahunpembuatan;
    }
    public String getKondisi() {
        return kondisi;
    }
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
