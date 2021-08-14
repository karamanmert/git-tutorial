package com.mertkaraman;

//DENEMEEEEEEEE
public class Main {

    public static void main(String[] args) {
        Area area = new Area(new Square(5));
        System.out.println(area.calculateArea());

        Area area2 = new Area(new Rectangle(5,6));
        System.out.println(area2.calculateArea());
    }
}
