package week8;

public class Rectangle extends shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double Calculate_Area(){
        return length * breadth;
    }

    public void Display_Area(){
        System.out.println("Area of rectangle = " + Calculate_Area());
    }

    public void Print_Area(){
        System.out.println("Area = " + Calculate_Area());
    }
}
