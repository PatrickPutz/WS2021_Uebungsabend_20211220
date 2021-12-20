package org.campus02.rec;

import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<Ort> nachbarn;

    public Ort(String name) {
        this.name = name;
        this.nachbarn = new ArrayList<>();
    }

    public void addNachbar(Ort o){
        nachbarn.add(o);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ort> getNachbarn() {
        return nachbarn;
    }

}
