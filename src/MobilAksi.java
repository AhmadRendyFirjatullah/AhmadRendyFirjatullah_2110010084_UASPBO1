public class MobilAksi {
    public static void main(String[] args) {
        Mobil M = new Mobil();

        M.namamobil      = "AGYA";
        M.warna          = "Silver";
        M.tahunpembuatan = 2018;
        M.kondisi        = "Baru";
        M.harga          = 20000000;
        System.out.println("Nama Mobil      : " + M.namamobil);
        System.out.println("Warna           : " + M.warna);
        System.out.println("Tahun Pembuatan : " + M.tahunpembuatan);
        System.out.println("Kondisi         : " + M.kondisi);
        System.out.println("Harga           : Rp " + M.harga);
    }
}
