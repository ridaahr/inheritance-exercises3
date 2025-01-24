package org.ies.shapes;

import org.ies.shapes.components.*;
import org.ies.shapes.model.Circle;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var circleReader = new CircleReader(scanner);
        var triangleReader = new TriangleReader(scanner);
        var squareReader = new SquareReader(scanner);
        var shapeReader = new ShapeReader(scanner, squareReader, circleReader, triangleReader);
        var drawReader = new DrawReader(scanner, shapeReader);

        var draw = drawReader.read();
        draw.getShape().info();
    }
}