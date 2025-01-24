package org.ies.shapes.components;

import org.ies.shapes.model.Triangle;

import java.util.Scanner;

public class TriangleReader {
    private final Scanner scanner;

    public TriangleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Triangle read() {
        System.out.println("Introduce el color:");
        var color = scanner.nextLine();
        System.out.println("Introduce la base:");
        var base = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce la altura");
        var height = scanner.nextDouble();
        scanner.nextLine();
        return new Triangle(
                color,
                base,
                height
        );
    }
}
