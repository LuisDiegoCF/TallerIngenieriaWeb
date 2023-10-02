package org.example.ejemploAvanzado.visitor;

import org.example.ejemploAvanzado.formas.*;

public class XMLExportVisitor implements Visitor {

    public String export(Forma... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Forma forma : args) {
            sb.append(forma.accept(this)).append("\n");
        }
        return sb.toString();
    }

    public String visitPunto(Punto p) {
        return "<punto>" + "\n" +
                "    <id>" + p.getId() + "</id>" + "\n" +
                "    <x>" + p.getX() + "</x>" + "\n" +
                "    <y>" + p.getY() + "</y>" + "\n" +
                "</punto>";
    }

    public String visitCirculo(Circulo c) {
        return "<circulo>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
                "</circulo>";
    }

    public String visitRectangulo(Rectangulo r) {
        return "<rectangulo>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getWidth() + "</width>" + "\n" +
                "    <height>" + r.getHeight() + "</height>" + "\n" +
                "</rectangulo>";
    }

    public String visitFormaCompuesta(FormaCompuesta fc) {
        return "<forma_compuesta>" + "\n" +
                "   <id>" + fc.getId() + "</id>" + "\n" +
                _visitFormaCompuesto(fc) +
                "</forma_compuesta>";
    }

    private String _visitFormaCompuesto(FormaCompuesta fc) {
        StringBuilder sb = new StringBuilder();
        for (Forma forma : fc.children) {
            String obj = forma.accept(this);
            // sangría apropiada para sub-objetos.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }

}