import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numberOfTemperatures = 5;
        double[] temperatures = new double[numberOfTemperatures];
        double sum = 0.0;

        System.out.println("Please Provide " + numberOfTemperatures + "temperatures");
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.println("Temperature " + (i +1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        // Average Temperature from the 5 inputed.
        double average = sum / numberOfTemperatures;
        System.out.printf("The Average temperature is: %.2f%n", average);

        // Show the temperatures that are above average
        System.out.println("Temperatures above average: ");
        for (double temp : temperatures) {
            if (temp > average) {
                System.out.println(temp);
            }
        }


    }
}
