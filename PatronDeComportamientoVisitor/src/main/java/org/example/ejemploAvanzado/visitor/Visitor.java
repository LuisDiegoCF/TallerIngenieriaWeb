package org.example.ejemploAvanzado.visitor;

import org.example.ejemploAvanzado.formas.Circulo;
import org.example.ejemploAvanzado.formas.FormaCompuesta;
import org.example.ejemploAvanzado.formas.Punto;
import org.example.ejemploAvanzado.formas.Rectangulo;

public interface Visitor {
    String visitPunto(Punto punto);

    String visitCirculo(Circulo circulo);

    String visitRectangulo(Rectangulo rectangulo);

    String visitFormaCompuesta(FormaCompuesta fc);
}