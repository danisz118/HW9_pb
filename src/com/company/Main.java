package com.company;

public class Main {

    public static void main(String[] args) {
        GeometricFigures<Square> set = new GeometricFigures<>();
        set.add(new Square("Квадрат0"));
        set.add(new Square("Квадрат1"));
        set.add(new Square("Квадрат2"));
        set.forEach(square -> System.out.println(square.getName()) );
        set.remove(2);
        set.forEach(square -> System.out.println(square.getName()) );


        GeometricFigures<Triangle> set2 = new GeometricFigures<>();
        set2.add(new Triangle("Треугольник0"));
        set2.add(new Triangle("Треугольник1"));
        set2.add(new Triangle("Треугольник2"));
        set2.forEach(triangle -> System.out.println(triangle.getName()));
        set2.remove(0);
        set2.remove(1);
        set2.forEach(triangle -> System.out.println(triangle.getName()));
	// write your code here
    }
}
