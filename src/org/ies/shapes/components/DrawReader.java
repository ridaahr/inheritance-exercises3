package org.ies.shapes.components;

import org.ies.shapes.model.Draw;

import java.util.Scanner;

public class DrawReader {
    private final Scanner scanner;
    private final ShapeReader shapeReader;

    public DrawReader(Scanner scanner, ShapeReader shapeReader) {
        this.scanner = scanner;
        this.shapeReader = shapeReader;
    }

    public Draw read() {
        System.out.println("Introduce la coordenada x:");
        var x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce la coordenada y:");
        var y = scanner.nextDouble();
        scanner.nextLine();
        var shape = shapeReader.read();
        return new Draw(
                x,
                y,
                shape
        );
    }
}
