public class MobilAksi {
    public static void main(String[] args) {
        Mobil Baru = new Mobil();

        Baru.namamobil      = "AGYA";
        Baru.warna          = "Silver";
        Baru.tahunpembuatan = 2018;
        Baru.kondisi        = "Baru";
        Baru.harga          = 20000000;
        System.out.println("=======================================");
        System.out.println("\tDETAIL PEMBELIAN MOBIL BARU");
        System.out.println("=======================================");
        System.out.println("1.Nama Mobil        : " + Baru.namamobil);
        System.out.println("  Warna             : " + Baru.warna);
        System.out.println("  Tahun Pembuatan   : " + Baru.tahunpembuatan);
        System.out.println("  Kondisi           : " + Baru.kondisi);
        System.out.println("  Harga             : Rp " + Baru.harga);
        System.out.println("=======================================");

        //Hasil dari Getter and Setter
        Mobil Bekas = new Mobil();

        Bekas.namamobil      = "AVANZA";
        Bekas.warna          = "Black";
        Bekas.tahunpembuatan = 2015;
        Bekas.kondisi        = "Bekas";
        Bekas.harga          = 15000000;
        System.out.println("=======================================");
        System.out.println("\tDETAIL PEMBELIAN MOBIL BEKAS");
        System.out.println("=======================================");
        System.out.print("2.Nama Mobil       \t: ");
        System.out.println(Bekas.getNamamobil());
        System.out.print("  Warnanya         \t: ");
        System.out.println(Bekas.getWarna());
        System.out.print("  Tahun Pembuatan  \t: ");
        System.out.println(Bekas.getTahunpembuatan());
        System.out.print("  Kondisi          \t: ");
        System.out.println(Bekas.getKondisi());
        System.out.print("  Harga            \t: ");
        System.out.println(Bekas.getHarga());
        System.out.println("=======================================");

        Baru.diskon();
        System.out.println("Total Membeli 2 Mobil : Rp " + (Baru.harga + Bekas.harga));
        Bekas.infodiskon();
        System.out.println("=======================================");
    }
}
