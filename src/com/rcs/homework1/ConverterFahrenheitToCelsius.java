package com.rcs.homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterFahrenheitToCelsius {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        char degreeCelsius = 8451;
        char degreeFahrenheit = 8457;
        System.out.print("Ievadam temperatūru (Fārenheita grādi " + degreeFahrenheit + "): ");
        Scanner scanner = new Scanner(System.in);
        float degreeFahrenheitSize = scanner.nextFloat();
        scanner.close();
        System.out.println("Temperatūra (Celsija grādi " + degreeCelsius + "): " + f.format(5 * (degreeFahrenheitSize - 32) / 9));
    }
}
