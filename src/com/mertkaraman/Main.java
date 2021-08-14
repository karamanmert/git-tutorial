package com.mertkaraman;


public class Main {

    public static void main(String[] args) {
        Area area = new Area(new Square(5));
        System.out.println(area.calculateArea());
    }
}
