public class PegawaiNegara {
    public static int APBN;
    private String NIP;
    private int gajiPokok;
    private String daerahKekuasaan;
    private int gaji;

    public PegawaiNegara(){}

    public PegawaiNegara(String NIP, int gajiPokok, String daerahKekuasaan) {
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public String getNIP() {
        return this.NIP;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public String getDaerahKekuasaan() {
        return this.daerahKekuasaan;
    }

    public void bayarPajak() {
        APBN = APBN + 500_000;
        this.gaji = this.gaji - 500_000;
    }
}
