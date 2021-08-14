package com.mertkaraman;
//mert
//karaman
public class Square implements IArea {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int calculateArea() {
        return a*a;
    }
}
