
import java.util.ArrayList;

public class PNS extends PegawaiNegara {

    private int golongan;
    private ArrayList<RakyatJelata> rakyat = new ArrayList<>();

    public PNS(String NIP, int gajiPokok, String daerahKekuasaan, int golongan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.golongan = golongan;
    }
    
    public void mendataRakyat(RakyatJelata tambah){
        if (tambah.getDaerah().equals(this.getDaerahKekuasaan())) {
            rakyat.add(tambah);
        } else {
            System.out.println("Bukan orang sini le");
        }
    };
    
    public int getGolongan() {
        return this.golongan;
    }

    public void menyalurkanBantuan() {
        for (RakyatJelata orang : rakyat) {
            if (orang.getJumlahKekayaan() <= 100_000_000) {
                orang.setTambahKekayaan(1_000_000);
            }
        }
    }

    public void getTunjangan() {
        this.setGaji(this.getGaji() + (this.getGolongan() * this.getGolongan()));
    }

}
