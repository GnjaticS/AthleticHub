package PrviZadatak;

import java.util.ArrayList;

public class Kupac {
    private int id;
    private String name;
    private ArrayList<String> products;

    public Kupac(int id, String name) {
        this.id = id;
        this.name = name;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
    public void addProduct (String product) {
        products.add(product);
    }
    public void removeProduct (String product) {

        products.remove(product);
    }
    // Implementirati metodu ukupnaCena koja izračunava i vraća ukupnu cenu svih proizvoda koje kupac planira kupiti.
    public double ukupnaCena (){
        double ukupno = 0;
        for (String pivot: this.products){
            if (pivot.equalsIgnoreCase("milk")) {
                ukupno += 150;
            } else if (pivot.equalsIgnoreCase("bread")){
                ukupno += 100;
            } else {
                ukupno += 300;
            }

        }
        return ukupno;

    }

}
