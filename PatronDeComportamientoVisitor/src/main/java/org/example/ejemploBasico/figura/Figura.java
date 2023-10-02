package org.example.ejemploBasico.figura;


import org.example.ejemploBasico.visitor.Visitor;

public interface Figura {
    void aceptar(Visitor visitor);
}
