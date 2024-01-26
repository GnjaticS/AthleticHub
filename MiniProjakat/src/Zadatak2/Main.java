package Zadatak2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(9);
        grades.add(9);
        Student student = new Student("st", 3,grades);
        // System.out.println(student.prosek());

        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(5);
        grades2.add(0);

        ArrayList<Student> listaSttudenta = new ArrayList<>();
        listaSttudenta.add(student);
        listaSttudenta.add(new Student("st", 2, grades2));



        Departman dep1 = new Departman(listaSttudenta);
        dep1.removeStudent();
        System.out.println(dep1);

    }
}
