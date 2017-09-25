package com.hbh7;

import java.util.Objects;
import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        System.out.println("Welcome to Temperature Conversion");
        Scanner reader = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        String mode;

        System.out.print( "Convert to Fahrenheit or Celsius? Enter C or F:  ");
        mode = reader.next();

        if(Objects.equals(mode, "f")) {
            System.out.print( "Enter degrees Fahrenheit: ");
            fahrenheit = reader.nextDouble();
            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
            System.out.print( "The equivalent in Celsius is ");
            System.out.println(celsius);
        } else {
            System.out.print( "Enter degrees Celsius: ");
            celsius = reader.nextDouble();
            fahrenheit = (celsius * 1.8) + 32;
            System.out.print( "The equivalent in Fahrenheit is ");
            System.out.println(fahrenheit);
        }
    }
}
