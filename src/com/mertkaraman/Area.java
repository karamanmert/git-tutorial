package com.mertkaraman;

public class Area {
    public final IArea area;

    public Area(IArea area) {
        this.area = area;
    }

    public int calculateArea(){
        return  this.area.calculateArea();
    }
}
