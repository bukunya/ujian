public class PegawaiNegara {
    private String NIP;
    private int gajiPokok;
    private String daerahKekuasaan;

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
}
