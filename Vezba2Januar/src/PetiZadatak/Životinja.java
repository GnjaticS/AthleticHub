package PetiZadatak;

public abstract class Životinja {
    private int godina;
    private boolean sisar;

    public Životinja(int godina, boolean sisar) {
        this.godina = godina;
        this.sisar = sisar;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public boolean isSisar() {
        return sisar;
    }

    public void setSisar(boolean sisar) {
        this.sisar = sisar;
    }

    @Override
    public String toString() {
        return "Životinja{" +
                "godina=" + godina +
                ", sisar=" + sisar +
                '}';
    }
    public abstract void zvukŽivotinje ();
}
