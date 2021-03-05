package homework3;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.print("Ievadiet vārdu, uzvārdu: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        scanner.close();
        System.out.printf("'%s'\n", name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.printf("'%s'", surname.toUpperCase());
    }
}
