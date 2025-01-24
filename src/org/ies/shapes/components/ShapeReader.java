package org.ies.shapes.components;

import org.ies.shapes.model.Circle;
import org.ies.shapes.model.Shape;
import org.ies.shapes.model.Triangle;

import java.util.Scanner;

public class ShapeReader {
    private final Scanner scanner;
    private final SquareReader squareReader;
    private final CircleReader circleReader;
    private final TriangleReader triangleReader;

    public ShapeReader(Scanner scanner, SquareReader squareReader, CircleReader circleReader, TriangleReader triangleReader) {
        this.scanner = scanner;
        this.squareReader = squareReader;
        this.circleReader = circleReader;
        this.triangleReader = triangleReader;
    }

    public Shape read() {
        int option;
        do {
            System.out.println("Elige una forma");
            System.out.println("1. Cuadrado");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < 1 || option > 3);
        if (option == 1) {
            return squareReader.read();
        } else if (option == 2) {
            return circleReader.read();
        } else {
            return triangleReader.read();
        }
    }
}
