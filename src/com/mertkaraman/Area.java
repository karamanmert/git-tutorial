package com.mertkaraman;

public class Area {
    public final IArea area;

    public Area(IArea area) {
        this.area = area;
    }
    public void calculateArea(){
        this.area.calculateArea();
    }
}
