package org.example.ejemploBasico.visitor;

import org.example.ejemploBasico.figura.Circulo;
import org.example.ejemploBasico.figura.Cuadrado;

public interface Visitor {
    void visitor(Circulo circulo);
    void visitor(Cuadrado cuadrado);
}