package org.ies.shapes.components;

import org.ies.shapes.model.Circle;

import java.util.Scanner;

public class CircleReader {
    private final Scanner scanner;

    public CircleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Circle read() {
        System.out.println("Introduce el color:");
        var color = scanner.nextLine();
        System.out.println("Introduce el radio");
        var radius = scanner.nextDouble();
        scanner.nextLine();
        return new Circle(
                color,
                radius
        );
    }
}
