package backjoon;

import java.util.Scanner;

public class Bj10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            System.out.println(input1 + input2);
        }

        scanner.close();
    }
}

