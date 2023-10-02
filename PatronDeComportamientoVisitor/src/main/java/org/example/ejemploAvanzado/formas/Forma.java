package org.example.ejemploAvanzado.formas;

import org.example.ejemploAvanzado.visitor.Visitor;

public interface Forma {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}