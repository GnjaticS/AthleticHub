import java.util.ArrayList;

public class Album {
    private String naziv;
    private ArrayList<Pesma> listaPesama;

    public Album(String naziv, ArrayList<Pesma> listaPesama) {
        this.naziv = naziv;
        this.listaPesama = listaPesama;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Pesma> getListaPesama() {
        return listaPesama;
    }

    public void setListaPesama(ArrayList<Pesma> listaPesama) {
        this.listaPesama = listaPesama;
    }

    @Override
    public String toString() {
        return "Album{" +
                "naziv='" + naziv + '\'' +
                ", listaPesama=" + listaPesama +
                '}';
    }

    // najveciHit() - koji vraca naziv pesme sa albuma koja ima najvise pregleda

    public String nazivPesme (){
        int najveciPregled = Integer.MIN_VALUE;
        String hit = "";
        for (int i=0; i<listaPesama.size(); i++) {
            if(listaPesama.get(i).getBrojPregleda()>najveciPregled){
                najveciPregled = listaPesama.get(i).getBrojPregleda();
                hit = listaPesama.get(i).getNaziv();
            }

        }
        return hit;


    }
}
