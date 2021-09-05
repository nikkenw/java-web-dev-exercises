package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of fuel were used?");
        Double fuel = input.nextDouble();

        Double milesPerGallon = miles / fuel;

        System.out.println("Miles per gallon:" + milesPerGallon);
    }
}
