package org.example.ejemploAvanzado.formas;

import org.example.ejemploAvanzado.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FormaCompuesta implements Forma {
    public int id;
    public List<Forma> children = new ArrayList<>();

    public FormaCompuesta(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitFormaCompuesta(this);
    }

    public void add(Forma shape) {
        children.add(shape);
    }
}