public class RakyatJelata {
    private String daerah;
    private int jumlahKekayaan;

    APBN APBN = new APBN();

    public RakyatJelata(String daerah, int jumlahKekayaan) {
        this.daerah = daerah;
        this.jumlahKekayaan = jumlahKekayaan;
    }

    public String getDaerah(){
        return this.daerah;
    }

    public int getJumlahKekayaan() {
        return this.jumlahKekayaan;
    }

    public void setTambahKekayaan(int tambahKekayaan) {
         this.jumlahKekayaan = this.jumlahKekayaan + tambahKekayaan;
    }

    public void terimaBantuan(int tambahKekayaan) {
        this.jumlahKekayaan = this.jumlahKekayaan + tambahKekayaan;
    }

    public void bayarPajak() {
        APBN.APBN = APBN.APBN + 500_000;
        this.jumlahKekayaan = this.jumlahKekayaan - 500_000;
    }
    
}
