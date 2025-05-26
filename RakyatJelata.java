public class RakyatJelata {
    private String daerah;
    private int jumlahKekayaan;

    PegawaiNegara pn = new PegawaiNegara();

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
    
}
