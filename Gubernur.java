import java.util.ArrayList;

public class Gubernur extends PegawaiNegara {

    private ArrayList<PNS> pns = new ArrayList<>();
    
    public Gubernur(String NIP, int gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public void mendataPNS(PNS orang) {
        if (orang.getDaerahKekuasaan().equals(this.getDaerahKekuasaan())) {
            pns.add(orang);
            System.out.println("PNS dengan NIP " + orang.getNIP() + " telah didaftarkan");
        } else {
            System.out.println("Error: Daerah kekuasaan PNS tidak sesuai");
        }
    }

    public void getTunjangan() {
        this.setGaji(this.getGaji() + (pns.size() * 100_000));
    }

    @Override
    public void bayarPajak() {
        APBN.APBN = APBN.APBN + 1_000_000;
        this.setGaji(-1_000_000);
        System.out.println("Pajak sebesar 1000000 telah dibayarkan oleh Gubernur dengan NIP " + this.getNIP());
    }

}
