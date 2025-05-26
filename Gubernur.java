import java.util.ArrayList;

public class Gubernur extends PegawaiNegara {

    private ArrayList<PNS> pns = new ArrayList<>();
    
    public Gubernur(String NIP, int gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public void mendataPNS(PNS orang) {
        if (orang.getDaerahKekuasaan().equals(this.getDaerahKekuasaan())) {
            pns.add(orang);
        }
    }

    public void getTunjangan() {
        this.setGaji(this.getGaji() + (pns.size() * 100_000));
    }

}
