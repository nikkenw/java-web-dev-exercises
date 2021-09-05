package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle: ");
        Double length = input.nextDouble();
        System.out.println("Enter the width of a rectangle:");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
