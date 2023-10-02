package org.example.ejemploBasico.figura;

import org.example.ejemploBasico.visitor.Visitor;

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitor(this);
    }
}