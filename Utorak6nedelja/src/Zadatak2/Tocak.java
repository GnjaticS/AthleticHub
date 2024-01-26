package Zadatak2;

public class Tocak {
    private int daniKorišćenja;
    private String model;

    public Tocak(int a, String b) {
        this.daniKorišćenja = a;
        this.model = b;
    }

    public int getDaniKorišćenja () {
        return daniKorišćenja;
    }
    public void setDaniKorišćenja (int noviDani) {
        this.daniKorišćenja = noviDani;
    }
    public String getModel () {
        return model;
    }
    public void setModel (String noviModel) {
        this.model = noviModel;
    }
    public String toString () {
        return daniKorišćenja + " " + model;
    }


}
