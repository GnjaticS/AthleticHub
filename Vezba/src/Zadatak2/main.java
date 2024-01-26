package Zadatak2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Planina planina1 = new Planina("Maglic", 2300);
        Planina planina2 = new Planina("Everest", 8884);
        Planina planina3 = new Planina("Durmitor", 2523);
        Planina planina4 = new Planina("Fruška Gora", 539);

        ArrayList<Planina> lista = new ArrayList<>();
        lista.add(planina1);
        lista.add(planina2);
        lista.add(planina3);
        lista.add(planina4);

        Planinar planinar = new Amater("Stefan", lista);
        planinar.izbaciPlaninu();
        System.out.println(lista);

        Planinar planinar2 = new Profesionalac("Bojan", lista);
        planinar2.izbaciPlaninu();
        System.out.println("Lista planina na koje se može popeti " + planinar2.getImePlaninara() + " je: " + lista);
    }



}
