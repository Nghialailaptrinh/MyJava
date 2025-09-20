package MyCode;

import java.util.Scanner;

public class Main {

    public static int UCLN(int a, int b) {
        int c;
        while (a != 0) {
            c = a;
            a = b % a;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println("Hello Java!");  // ✅ Sửa ở đây

        try (Scanner sc = new Scanner(System.in)) { // ✅ không còn cảnh báo resource leak
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(UCLN(a, b));
        }
    }
}
