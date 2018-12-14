package com.example.frank.leovision.models;


import java.util.ArrayList;

public class Productos {
    private int id;
    private String name;
    private String description;
    public Productos(int i, String name) {
        this.id = i;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Productos> getProductsAsString() {
        ArrayList<Productos> o = new ArrayList<>();
        o.add(new Productos(1,"LENTES CONVERGENTES"));
        o.add(new Productos(2, "BICONVEXA"));
        o.add(new Productos(3, "PLANO CONVEXA"));
        o.add(new Productos(4,"MENISCO CONVERGENTE"));
        o.add(new Productos(4,"LENTES DIVERGENTES"));
        o.add(new Productos(5,"BICÓNCAVA"));
        o.add(new Productos(6,"LENTES DE DESCANSO"));
        o.add(new Productos(7,"LENTES DE CONTACTO"));
        o.add(new Productos(8,"LENTES OFTALMICOS"));
        return o;
    }

    public String toString() {
        return this.name;
    }
    public static Productos getById(int _id) {
        for (Productos product : Productos.getProductsAsString()) {
            if (product.getId() == _id) {
                return product;
            }
        }
        return null;

    }



}
