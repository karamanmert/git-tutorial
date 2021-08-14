package com.mertkaraman;

public class Rectangle implements IArea {
    public int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a*b;
    }
}
