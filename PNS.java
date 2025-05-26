
import java.util.ArrayList;

public class PNS extends PegawaiNegara {

    private int golongan;
    private ArrayList<String> rakyat = new ArrayList<>();

    public PNS(String NIP, int gajiPokok, String daerahKekuasaan, int golongan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.golongan = golongan;
    }
    
    public void mendataRakyat(RakyatJelata tambah){

    };
    
    
    public int getGolongan() {
        return this.golongan;
    }

}
