package entities;

import static java.lang.Math.sqrt;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return (width + height) * 2;
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", Area())
                + "\nPERIMETER = " + String.format("%.2f", Perimeter())
                + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
    }
}
