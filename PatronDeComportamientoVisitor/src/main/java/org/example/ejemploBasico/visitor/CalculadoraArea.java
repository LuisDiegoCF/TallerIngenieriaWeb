package org.example.ejemploBasico.visitor;

import org.example.ejemploBasico.figura.Circulo;
import org.example.ejemploBasico.figura.Cuadrado;

public class CalculadoraArea implements Visitor {
    double areaTotal = 0;

    @Override
    public void visitor(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRadio(), 2);
        areaTotal += area;
    }

    @Override
    public void visitor(Cuadrado cuadrado) {
        double area = Math.pow(cuadrado.getLado(), 2);
        areaTotal += area;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}