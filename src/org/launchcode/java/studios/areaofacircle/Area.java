package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        while(true){
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius (or enter 0 to exit ): ");

        if(input.hasNext() || input.hasNextDouble()){
            System.out.println("That didn't work, try entering a real number.");
        }else {
            radius = input.nextDouble();
            if(radius < 0){
                System.out.println("That's a black hole.Please enter a positive number");
            }else if(radius ==0) {
                System.out.println("Thanks!");
                input.close();
                break;
            }else {
//        area =3.14*(radius* radius);
//        System.out.println("The area of a circle with radius" +radius + "is:" +area);

                area = Circle.getArea(radius);
                System.out.println("The area of a circle with radius " + radius + " is: " + area);
                }
            }

        }
    }
}
