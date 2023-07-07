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

    //Getter and Setter
    public String getNamamobil() {
        return namamobil;
    }
    public void setNamamobil(String namamobil) {
        this.namamobil = namamobil;
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
}
