public class Main {
    public static void main(String[] args) {

        APBN APBN = new APBN();

        Gubernur gubernur = new Gubernur("002", 10_000_000, "Konoha");
        DPRD dprd1 = new DPRD("003", 5_000_000, "Konoha");
        // NIP, Gaji Pokok, Daerah Kekuasaan
        PNS pns1 = new PNS("001", 5_000_000, "Konoha", 3);
        PNS pns2 = new PNS("004", 5_000_000, "Jepang", 2);
        PNS pns3 = new PNS("005", 5_000_000, "Konoha", 1);
        // NIP, Gaji Pokok, Daerah Kekuasaan, Golongan
        RakyatJelata rakyat1 = new RakyatJelata("Konoha", 5_000);
        RakyatJelata rakyat2 = new RakyatJelata("Konoha", 1_000);
        RakyatJelata rakyat3 = new RakyatJelata("Jepang", 2_000);
        // Daerah, Jumlah Kekayaan


        pns1.mendataRakyat(rakyat1);
        pns1.mendataRakyat(rakyat2);
        pns1.mendataRakyat(rakyat3);
        // Tambah Rakyat

        System.out.println("Jumlah kekayaan rakyat1: " + rakyat1.getJumlahKekayaan());
        System.out.println("Jumlah kekayaan rakyat2: " + rakyat2.getJumlahKekayaan());
        System.out.println("Jumlah kekayaan rakyat3: " + rakyat3.getJumlahKekayaan());
        // Menampilkan jumlah kekayaan rakyat

        pns1.menyalurkanBantuan();
        rakyat1.terimaBantuan(1_000_000);
        System.out.println("Jumlah kekayaan rakyat1 setelah menerima bantuan: " + rakyat1.getJumlahKekayaan());

        pns1.bayarPajak();
        System.out.println("Dana APBN: " + APBN.getDana());

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");

        gubernur.mendataPNS(pns1);
        gubernur.mendataPNS(pns2);
        gubernur.mendataPNS(pns3);
        gubernur.tambahDanaAPBN(5000000);
        System.out.println("Dana APBN setelah ditambah Gubernur: " + APBN.getDana());
        gubernur.getTunjangan();
        gubernur.bayarPajak();

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");

        dprd1.lakukanKunjungan();
        dprd1.lakukanKunjungan();
        System.out.println(dprd1.tampungAspirasi("Jalan rusak"));
        System.out.println(dprd1.tampungAspirasi("Pembangunan Sekolah"));
        System.out.println("Tunjangan dprd sebesar : " + dprd1.getTunjangan());
        dprd1.bayarPajak();

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");

        rakyat1.bayarPajak();

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");

        System.out.println("Dana APBN Akhir sebesar : Rp " + APBN.getDana());


    }
}
