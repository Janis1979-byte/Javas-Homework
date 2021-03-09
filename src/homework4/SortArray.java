package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        System.out.print("Lūdzu ievadīt masīvu izmēru robežās [20 : 40]: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number < 20 || number > 40) {
            System.out.printf("Norādītais masīvs %d neatrodas robežās [20:40], ievadiet masīvu atkārtoti: ", number);
            number = scanner.nextInt();
        }
        scanner.close();
        Random random = new Random();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}



