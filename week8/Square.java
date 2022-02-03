package week8;

public class Square extends shape {
    
    private double length;

    public Square(double length){
        this.length = length;
    }

    public double Calculate_Area(){
        return length * length;
    }

    public void Display_Area(){
        System.out.println("Area of square = " + Calculate_Area());
    }

    public void Print_Area(){
        System.out.println("Area = " + Calculate_Area());
    }
}
