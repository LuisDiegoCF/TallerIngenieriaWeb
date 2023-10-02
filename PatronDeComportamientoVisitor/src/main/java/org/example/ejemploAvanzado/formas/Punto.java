package org.example.ejemploAvanzado.formas;

import org.example.ejemploAvanzado.visitor.Visitor;

public class Punto implements Forma {
    private int id;
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPunto(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}