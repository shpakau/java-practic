package dz_1;

import java.util.Scanner;

public class q3 {
    public static void inputNameAndPrintHi() {
        Scanner in = new Scanner(System.in);
        System.out.printf("name: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }
}