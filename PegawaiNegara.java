public class PegawaiNegara {
    private String NIP;
    private int gajiPokok;
    private String daerahKekuasaan;
    private int gaji;

    APBN APBN = new APBN();

    public PegawaiNegara(){}

    public PegawaiNegara(String NIP, int gajiPokok, String daerahKekuasaan) {
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public String getNIP() {
        return this.NIP;
    }

    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int tambahGaji) {
        this.gaji = this.gaji + tambahGaji;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public String getDaerahKekuasaan() {
        return this.daerahKekuasaan;
    }

    public void bayarPajak() {
        APBN.APBN = APBN.APBN + 500_000;
        this.gaji = this.gaji - 500_000;
    }

    public void tambahDanaAPBN(int Dana) {
        APBN.APBN = APBN.APBN + Dana;
        this.gaji = this.gaji - Dana;
    }
}
