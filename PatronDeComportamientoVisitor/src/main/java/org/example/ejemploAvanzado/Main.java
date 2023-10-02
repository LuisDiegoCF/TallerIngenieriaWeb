package org.example.ejemploAvanzado;

import org.example.ejemploAvanzado.formas.*;
import org.example.ejemploAvanzado.visitor.HTMLExportVisitor;
import org.example.ejemploAvanzado.visitor.XMLExportVisitor;

public class Main {
    public static void main(String[] args) {
        /**
         * En este ejemplo, queremos exportar un grupo de formas geométricas a XML. La idea es que no queremos cambiar
         * directamente el código de las formas o, al menos, debemos intentar mantener los cambios al mínimo.
         */
        Punto punto = new Punto(1, 10, 55);
        Circulo circulo = new Circulo(2, 23, 15, 10);
        Rectangulo rectangulo = new Rectangulo(3, 10, 17, 20, 30);

        FormaCompuesta formaCompuesta = new FormaCompuesta(4);
        formaCompuesta.add(punto);
        formaCompuesta.add(circulo);
        formaCompuesta.add(rectangulo);

        FormaCompuesta fc = new FormaCompuesta(5);
        fc.add(punto);
        formaCompuesta.add(fc);

        export(circulo, formaCompuesta);
    }

    private static void export(Forma... formas) {

        System.out.println("------------------------XML---------------------------");
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(formas));
        System.out.println("------------------------HTML---------------------------");
        HTMLExportVisitor htmlExportVisitor = new HTMLExportVisitor();
        System.out.println(htmlExportVisitor.export(formas));
    }
}