package com.company;

public abstract class Figures {
    protected  final String name;

    protected Figures(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
