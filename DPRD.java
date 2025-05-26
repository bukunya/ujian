
import java.util.ArrayList;

public class DPRD extends PegawaiNegara {

    private int kunjunganKerja = 0;
    private ArrayList<String> aspirasi = new ArrayList<>();
    
    public DPRD(String NIP, int gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public void lakukanKunjungan() {
        kunjunganKerja++;
        System.out.println("Kunjungan ke rakyat ke-" + this.kunjunganKerja + " telah dilakukan");
    }

    public String tampungAspirasi(String asp) {
        aspirasi.add(asp);
        return "Aspirasi terkait " + asp + " telah diterima";
    }

    public String getTunjangan() {
        this.setGaji(this.getGaji() + (this.kunjunganKerja * 1_000_000));
        return "" + this.getGaji();
    }

    @Override
    public void bayarPajak() {
        APBN.APBN = APBN.APBN + 500_000;
        this.setGaji(-500_000);
        System.out.println("Pajak sebesar 1000000 telah dibayarkan oleh DPRD dengan NIP " + this.getNIP());
    }

}
