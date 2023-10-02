package org.example.ejemploBasico;

import org.example.ejemploBasico.figura.Circulo;
import org.example.ejemploBasico.figura.Cuadrado;
import org.example.ejemploBasico.figura.Figura;
import org.example.ejemploBasico.visitor.CalculadoraArea;

public class Main {
    public static void main(String[] args) {
        /**
         * Patron de comportamiento Visitor (visitante)
         * Es un patrón de diseño de comportamiento que te permite separar algoritmos de los objetos sobre los que operan.
         *
         * Visitor es un patrón de diseño de comportamiento que permite añadir nuevos comportamientos a una jerarquía de
         * clases existente sin alterar el código.
         */
        Figura[] figuras = {
                new Circulo(5),
                new Cuadrado(4),
                new Circulo(3)
        };

        CalculadoraArea calculadora = new CalculadoraArea();

        for (Figura figura : figuras) {
            figura.aceptar(calculadora);
        }

        System.out.println("Área total de las figuras: " + calculadora.getAreaTotal());
    }
}