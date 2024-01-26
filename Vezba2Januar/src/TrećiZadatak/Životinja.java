package TrećiZadatak;

public class Životinja {
    private String vrsta;

    public Životinja(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return "Životinja{" +
                "vrsta='" + vrsta + '\'' +
                '}';
    }
    public void zvuk() {
    }
}
