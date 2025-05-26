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
        APBN.APBN = APBN.APBN + (this.getJumlahKekayaan()/10);
        System.out.println("Pajak sebesar " + (this.getJumlahKekayaan()/10) + "telah dibayarkan oleh rakyat dengan alamat " + this.getDaerah());
        this.jumlahKekayaan = this.jumlahKekayaan - (this.getJumlahKekayaan()/10);
    }
    
}
