import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        System.out.println("Welcome to Temperature Conversion");
        Scanner reader = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        String mode;
        Converter converter;

        System.out.print( "Convert to Fahrenheit or Celsius? Enter C or F:  ");
        mode = reader.nextLine().trim();

        if("f".equalsIgnoreCase(mode)) {
            converter = n -> (n - 32.0) * 5.0 / 9.0;
            System.out.print( "Enter degrees Fahrenheit: ");
            fahrenheit = reader.nextDouble();
            System.out.printf( "The equivalent in Celsius is %f", converter.convert(fahrenheit));
        } else {
            converter = n -> (n * 1.8) + 32;
            System.out.print( "Enter degrees Celsius: ");
            celsius = reader.nextDouble();
            System.out.printf( "The equivalent in Fahrenheit is %f", converter.convert(celsius));
        }
        reader.close();
    }

    private static interface Converter {
        public double convert(double degrees);
    }
}
