package homework5;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Random random = new Random();
        int N1 = random.nextInt(4) + 3;
        int N2 = random.nextInt(4) + 3;
        int[][] twoDimArr = new int[N1][N2];
        System.out.printf("Lūdzu izvēlēties masīva aizpldīšanas veidu: \n  A. Aizpildīt masīva elementu vērtības manuāli; \n  B. Aizpildīt masīva elementu vērtības nejauši (ar skaitļiem no 1 līdz 100); \n");
        System.out.print("Jūsu izvēle: ");
        Scanner scanner = new Scanner(System.in);
        char charter1 = scanner.next().charAt(0);
        while (charter1 != 'a' && charter1 != 'A' && charter1 != 'b' && charter1 != 'B') {
            System.out.printf("Nepareizi ievadīta izvēle %s nav A vai B, lūdzu ievadiet atkārtoti! \n", charter1);
            System.out.print("Jūsu izvēle: ");
            charter1 = scanner.next().charAt(0);
        }
        if (charter1 == 'a' || charter1 == 'A')
            for (int i = 0; i < twoDimArr.length; i++) {
                for (int j = 0; j < twoDimArr[i].length; j++) {
                    System.out.printf("array[%d][%d] =", i, j);
                    twoDimArr[i][j] = scanner.nextInt();
                }
            }
        if (charter1 == 'b' || charter1 == 'B') {
            for (int i = 0; i < twoDimArr.length; i++) {
                for (int j = 0; j < twoDimArr[i].length; j++) {
                    twoDimArr[i][j] = random.nextInt(100) + 1;
                }
            }
        }
        for (int[] ints : twoDimArr) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
            scanner.close();
        }
       System.out.println();
        for (int i = twoDimArr.length - 1; i >= 0; i--)
            for (int j = 0; j < twoDimArr[i].length; j++) {
                if (i == j) {
                    twoDimArr[i][j] = twoDimArr[i][j];
                } else {
                    twoDimArr[i][j] = 0;
                }
            }
        System.out.println("Samainītās vērtības");
        for (int[] ints : twoDimArr) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
        }
    }
}





