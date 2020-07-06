package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void iterateCars(Collection<? extends Car> cars) {

        for (Car car : cars) {

            System.out.println("Еще один шаг в цикле пройден!");
        }
    }
    public static void main(String[] args) {
       List<Car> cars = new ArrayList<>();
       cars.add(new Car());
       cars.add(new Car());

       List<Ford> ford = new ArrayList<>();
       ford.add(new Ford());
       ford.add(new Ford());

       List<Porsche> porsche = new ArrayList<>();
       porsche.add(new Porsche());
       porsche.add(new Porsche());

       iterateCars(cars);
       iterateCars(ford);
       iterateCars(porsche);

       

	// write your code here
    }
}
