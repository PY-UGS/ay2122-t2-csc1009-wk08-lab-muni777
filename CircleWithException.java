package com.Munigal.lab8;
import java.lang.Math;
import java.util.Scanner;

public class CircleWithException {
    private double radius, diameter;

    public CircleWithException(double radius){
        this.radius = radius;
    }
    private void setRadius(double radius) throws Exception{
        if (radius<0){
            throw new IllegalArgumentException("Radius cannot be a negative number, please enter a positive number");
        }
        else {
            this.radius = radius; //number input satisfies condition and hence is passed
        }
    }

    private double getRadius() {
        return radius;
    }

    private double getArea() throws Exception {
        double area = Math.PI * Math.pow(radius, 2);
        if (area > 1000) {
            throw new Exception("Area of circle is not allowed to be bigger than 1000");
        } else {
            return area;
        }
    }
    public double getDiameter(){
        diameter = 2 * radius;
        return diameter;
    }

    public static void main(String[] args) {
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter new radius of circle: ");
                double radius = input.nextDouble();
                CircleWithException myCircle = new CircleWithException(radius);
                myCircle.setRadius(radius);
                System.out.println("Area of circle: " + myCircle.getArea());
                System.out.println("Diameter of circle: " + myCircle.getDiameter());
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

