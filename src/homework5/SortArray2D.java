package homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {
        System.out.print("Lūdzu ievadīt 2D masīva 1.dimensijas izmēru (rindu skaitu). Pieļaujamās ievades vērtības: 5 - 15: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rinduSkaits = scanner.nextInt();
        while (rinduSkaits < 5 || rinduSkaits > 15) {
            System.out.printf("Norādītais 1.dimensijas izmēru (rindu skaits) %d neatrodas robežās [5:15], ievadiet masīvu atkārtoti: ", rinduSkaits);
            rinduSkaits = scanner.nextInt();
        }
        scanner.close();
        int kolonnuSkaits = random.nextInt(11) + 4;
        int[][] number = new int[rinduSkaits][kolonnuSkaits];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = random.nextInt(900) + 100;
            }
        }
        for (int[] row : number) {
            for (int column : row) {
                System.out.printf("%6d", column);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                for (int k = j + 1; k < number[i].length; k++) {
                    if (number[i][j] < number[i][k]) {
                        int temp = number[i][j];
                        number[i][j] = number[i][k];
                        number[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < number.length / rinduSkaits; i++) {
            int oppositeIndex = number.length - 1;
            int[] temp = number[i];
            number[i] = number[oppositeIndex];
            number[oppositeIndex] = temp;
        }
        for (int[] row : number) {
            for (int column : row) {
                System.out.printf("%6d", column);
            }
            System.out.println();
        }
    }
}