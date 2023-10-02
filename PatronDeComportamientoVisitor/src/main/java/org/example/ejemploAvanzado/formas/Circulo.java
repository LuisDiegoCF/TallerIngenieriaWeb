package org.example.ejemploAvanzado.formas;


import org.example.ejemploAvanzado.visitor.Visitor;

public class Circulo extends Punto {
    private int radius;

    public Circulo(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCirculo(this);
    }

    public int getRadius() {
        return radius;
    }
}