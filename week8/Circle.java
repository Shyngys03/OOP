package week8;

public class Circle extends shape{
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public double Calculate_Area(){
        return pi * radius * radius;
    }

    public void Display_Area(){
        System.out.println("Area of circle = " + Calculate_Area());
    }

    public void Print_Area(){
        System.out.println("Area = " + Calculate_Area());
    }
}
