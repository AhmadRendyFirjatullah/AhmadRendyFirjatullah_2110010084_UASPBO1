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

        //Hasil dari Getter and Setter
        Mobil S = new Mobil();

        S.namamobil      = "AVANZA";
        S.warna          = "Black";
        S.tahunpembuatan = 2015;
        S.kondisi        = "Baru";
        S.harga          = 15000000;
        System.out.print("Nama Mobil        \t: ");
        System.out.println(S.getNamamobil());
        System.out.print("Warnanya          \t: ");
        System.out.println(S.getWarna());
        System.out.print("Tahun Pembuatan   \t: ");
        System.out.println(S.getTahunpembuatan());
        System.out.print("Kondisi           \t: ");
        System.out.println(S.getKondisi());
        System.out.print("Harga             \t: ");
        System.out.println(S.getHarga());
        System.out.println("\n");
    }
}
