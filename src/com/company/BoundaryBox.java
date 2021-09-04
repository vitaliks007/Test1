package com.company;

public class BoundaryBox {
    Point leftDownCorner = new Point(0, 0);
    Point rightUpperCorner = new Point(0, 0);

    Shape shape;

    public BoundaryBox(Shape shape) {
        this.shape = shape;
        for(Point p : shape.getTrial()){
            if (p.x < leftDownCorner.getX()){
                this.leftDownCorner.setX(p.x);
            }

            if (p.y < leftDownCorner.getY()){
                this.leftDownCorner.setY(p.y);
            }

            if (p.x > rightUpperCorner.getX()){
                this.rightUpperCorner.setX(p.x);
            }

            if (p.y > rightUpperCorner.getY()){
                this.rightUpperCorner.setY(p.y);
            }
        }
    }

    public Point getLeftDownCorner() {
        return leftDownCorner;
    }

    public void setLeftDownCorner(Point leftDownCorner) {
        this.leftDownCorner = leftDownCorner;
    }

    public Point getRightUpperCorner() {
        return rightUpperCorner;
    }

    public void setRightUpperCorner(Point rightUpperCorner) {
        this.rightUpperCorner = rightUpperCorner;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "BoundaryBox{" +
                "leftDownCorner=" + leftDownCorner +
                ", rightUpperCorner=" + rightUpperCorner +
                ", shape=" + shape +
                '}';
    }
}
