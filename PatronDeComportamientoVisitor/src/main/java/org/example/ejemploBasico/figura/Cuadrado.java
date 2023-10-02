package org.example.ejemploBasico.figura;

import org.example.ejemploBasico.visitor.Visitor;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitor(this);
    }
}

