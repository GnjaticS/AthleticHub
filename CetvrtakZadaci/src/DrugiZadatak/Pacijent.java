package DrugiZadatak;

public class Pacijent {
    private int id;
    private int brojGodina;
    private String dijagnoza;

    public Pacijent(int id, int brojGodina, String dijagnoza) {
        this.id = id;
        this.brojGodina = brojGodina;
        this.dijagnoza = dijagnoza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    @Override
    public String toString() {
        return "Pacijent{" +
                "id=" + id +
                ", brojGodina=" + brojGodina +
                ", dijagnoza='" + dijagnoza + '\'' +
                '}';
    }

}
