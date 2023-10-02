package org.example.ejemploAvanzado.visitor;

import org.example.ejemploAvanzado.formas.*;

public class HTMLExportVisitor implements Visitor {

    public String export(Forma... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n<head>\n<title>Exportación de Formas</title>\n</head>\n<body>\n");
        for (Forma forma : args) {
            sb.append(forma.accept(this)).append("\n");
        }
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    public String visitPunto(Punto p) {
        return "    <div class=\"punto\">\n" +
                "        <p>ID: " + p.getId() + "</p>\n" +
                "        <p>X: " + p.getX() + "</p>\n" +
                "        <p>Y: " + p.getY() + "</p>\n" +
                "    </div>";
    }

    public String visitCirculo(Circulo c) {
        return "    <div class=\"circulo\">\n" +
                "        <p>ID: " + c.getId() + "</p>\n" +
                "        <p>X: " + c.getX() + "</p>\n" +
                "        <p>Y: " + c.getY() + "</p>\n" +
                "        <p>Radio: " + c.getRadius() + "</p>\n" +
                "    </div>";
    }

    public String visitRectangulo(Rectangulo r) {
        return "    <div class=\"rectangulo\">\n" +
                "        <p>ID: " + r.getId() + "</p>\n" +
                "        <p>X: " + r.getX() + "</p>\n" +
                "        <p>Y: " + r.getY() + "</p>\n" +
                "        <p>Ancho: " + r.getWidth() + "</p>\n" +
                "        <p>Alto: " + r.getHeight() + "</p>\n" +
                "    </div>";
    }

    public String visitFormaCompuesta(FormaCompuesta fc) {
        StringBuilder sb = new StringBuilder();
        sb.append("    <div class=\"forma_compuesto\">\n");
        sb.append("        <p>ID: " + fc.getId() + "</p>\n");
        sb.append(_visitFormaCompuesto(fc));
        sb.append("    </div>");
        return sb.toString();
    }

    private String _visitFormaCompuesto(FormaCompuesta fc) {
        StringBuilder sb = new StringBuilder();
        for (Forma forma : fc.children) {
            String obj = forma.accept(this);
            obj = "        " + obj.replace("\n", "\n        ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
