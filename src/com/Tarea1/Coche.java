package com.Tarea1;

public class Coche {
    String nombres;

    public Coche(String nombre) {
        this.nombres=nombre;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombres='" + nombres + '\'' +
                '}';
    }
}

