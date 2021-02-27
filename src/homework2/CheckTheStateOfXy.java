package homework2;

import java.util.Scanner;

public class CheckTheStateOfXy {
    public static void main(String[] args) {
        System.out.print("Lūdzu ievadīt X koordināti :");
        Scanner scanner = new Scanner(System.in);
        int xSize = scanner.nextInt();
        System.out.print("Lūdzu ievadīt Y koordināti :");
        int ySize = scanner.nextInt();
        scanner.close();
        if ((xSize == -2 && ySize == 1) || (xSize == 3 && ySize == 1) || (xSize == 3 && ySize == -4) || (xSize == -2 && ySize == -4)) {
            System.out.println(String.format("Koordinātas (%d;%d) atrodas uz figūras līnijas!", xSize, ySize));
        } else if (xSize < -2 || xSize > 3 || ySize < -4 || ySize > 1) {
            System.out.println(String.format("Koordinātas (%d;%d) atrodas figūras ārpusē!", xSize, ySize));
        } else {
            System.out.println(String.format("Koordinātas (%d;%d) atrodas figūras iekšienē!", xSize, ySize));
        }
    }
}




