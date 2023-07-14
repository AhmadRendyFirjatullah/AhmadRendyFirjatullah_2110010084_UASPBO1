public class MobilAksi {
    public static void main(String[] args) {
        Mobil Avanza = new Mobil();

        Avanza.namapembeli    = "Ahmad";
        Avanza.warna          = "Silver";
        Avanza.tahunpembuatan = 2018;
        Avanza.kondisi        = "Baru";
        Avanza.harga          = 20000000;
        System.out.println("===========================================================");
        System.out.println("\t\t\t\tDETAIL PEMBELIAN MOBIL BARU");
        System.out.println("===========================================================");
        System.out.println("1.Nama Pembeli      : " + Avanza.namapembeli);
        System.out.println("  Warna             : " + Avanza.warna);
        System.out.println("  Tahun Pembuatan   : " + Avanza.tahunpembuatan);
        System.out.println("  Kondisi           : " + Avanza.kondisi);
        System.out.println("  Harga             : Rp " + Avanza.harga);
        System.out.println("===========================================================");

        //Hasil dari Getter and Setter
        Mobil AGYA = new Mobil();

        AGYA.namapembeli    = "Rendy";
        AGYA.warna          = "Black";
        AGYA.tahunpembuatan = 2015;
        AGYA.kondisi        = "Bekas";
        AGYA.harga          = 15000000;
        System.out.println("===========================================================");
        System.out.println("\t\t\t\tDETAIL PEMBELIAN MOBIL BEKAS");
        System.out.println("===========================================================");
        System.out.print("2.Nama Pembeli     \t: ");
        System.out.println(AGYA.getnamapembeli());
        System.out.print("  Warnanya         \t: ");
        System.out.println(AGYA.getWarna());
        System.out.print("  Tahun Pembuatan  \t: ");
        System.out.println(AGYA.getTahunpembuatan());
        System.out.print("  Kondisi          \t: ");
        System.out.println(AGYA.getKondisi());
        System.out.print("  Harga            \t: Rp ");
        System.out.println(AGYA.getHarga());
        System.out.println("===========================================================");

        Avanza.diskon();
        AGYA.diskon();
        System.out.println("Total Membeli 2 Mobil dengan diskon keduanya : Rp " + (Avanza.harga + AGYA.harga));
        AGYA.infodiskon();
        System.out.println("===========================================================");
    }
}
