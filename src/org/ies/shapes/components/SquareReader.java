package org.ies.shapes.components;

import org.ies.shapes.model.Square;
import org.ies.shapes.model.Triangle;

import java.util.Scanner;

public class SquareReader {
    private final Scanner scanner;

    public SquareReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Square read() {
        System.out.println("Introduce el color:");
        var color = scanner.nextLine();
        System.out.println("Introduce el lado");
        var side = scanner.nextDouble();
        scanner.nextLine();
        return new Square(
                color,
                side
        );
    }
}
