package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GeometricFigures<T extends Figures> {
    private final List<T> figures;

    public GeometricFigures() {
        figures = new ArrayList<>();
    }


    public void add(T t) {
        figures.add(t);
    }

    public T get(int index) {
        return figures.get(index);
    }

    public T remove(int index) {
        return figures.remove(index);
    }

    public void forEach(Consumer<T> consumer) {
        for (T figure : figures) {
            consumer.accept(figure);
        }
    }
}
