package org.launchcode.java.stuios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        input.close();

        /*Circle.getArea(radius);*/

        System.out.println("Area of circle:" + Circle.getArea(radius));
    }
}
