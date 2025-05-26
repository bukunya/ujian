
import java.util.ArrayList;

public class DPRD extends PegawaiNegara {

    private int kunjunganKerja = 0;
    private ArrayList<String> aspirasi = new ArrayList<>();
    
    public DPRD(String NIP, int gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public void lakukanKunjungan() {
        kunjunganKerja++;
    }

    public String tampungAspirasi(String asp) {
        aspirasi.add(asp);
        return asp;
    }

    public String getTunjangan() {
        this.setGaji(this.getGaji() + (this.kunjunganKerja * 1_000_000));
        return "Hello " + this.getGaji();
    }

}
