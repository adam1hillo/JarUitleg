package be.vdab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("centimeters:");
        Scanner scanner = new Scanner(System.in);
        double centimeters = scanner.nextDouble();
        var converter = new Converter();
        System.out.println(converter.centimetersToInches(centimeters) + " inches");
    }
}
