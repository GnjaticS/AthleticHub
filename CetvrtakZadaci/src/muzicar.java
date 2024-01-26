import java.util.ArrayList;

public abstract class muzicar {
    private ArrayList<Album> listaAlbuma;

    public muzicar(ArrayList<Album> listaAlbuma) {
        this.listaAlbuma = listaAlbuma;
    }

    public ArrayList<Album> getListaAlbuma() {
        return listaAlbuma;
    }

    public void setListaAlbuma(ArrayList<Album> listaAlbuma) {
        this.listaAlbuma = listaAlbuma;
    }

    @Override
    public String toString() {
        return "muzicar{" +
                "listaAlbuma=" + listaAlbuma +
                '}';
    }
    // ukupnoPregleda() - koja vraca ukupan broj pregleda koje Muzicar ima sa svih pesama, sa svih albuma

    public int ukupnoPregleda (){
        int pregledi = 0;
        int brojac = 0;
        for (int i=0; i<listaAlbuma.size(); i++){
            pregledi = listaAlbuma.get(i).getListaPesama().get(brojac).getBrojPregleda();
            brojac++;
        }
        return pregledi;


    }
    public abstract void zarada();
}
