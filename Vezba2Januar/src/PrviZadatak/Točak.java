package PrviZadatak;

public class Točak {
    private int brojDanakorišćenja;
    private String model;

    public Točak(int brojDanakorišćenja, String model) {
        this.brojDanakorišćenja = brojDanakorišćenja;
        this.model = model;
    }

    public int getBrojDanakorišćenja() {
        return brojDanakorišćenja;
    }

    public void setBrojDanakorišćenja(int brojDanakorišćenja) {
        this.brojDanakorišćenja = brojDanakorišćenja;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Točak{" +
                "brojDanakorišćenja=" + brojDanakorišćenja +
                ", model='" + model + '\'' +
                '}';
    }

}
