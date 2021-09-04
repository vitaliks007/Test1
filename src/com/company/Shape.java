package com.company;

import java.util.Arrays;

public class Shape {
    private int color;
    private Point[] trial;

    public Shape(int color, Point[] trial) {
        this.color = color;
        this.trial = trial;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Point[] getTrial() {
        return trial;
    }

    public void setTrial(Point[] trial) {
        this.trial = trial;
    }

    int getBoundCount(){
        return trial.length-1;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", trial=" + Arrays.toString(trial) +
                '}';
    }
}
