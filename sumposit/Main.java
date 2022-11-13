package sumposit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumAllPositNum1(4);
        sumAllPositNum();
    }

    public static void sumAllPositNum1(long n) {
        long sumAllPositNum1 = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                sumAllPositNum1 += n;
            }
            n--;

        }
        System.out.println("Сумма всех положительных чисел ровна" + sumAllPositNum1);
    }

    public static void sumAllPositNum() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sumAllPositNum = 0;
        for (long i = 1; i <= n; i++) {
            long a = sc.nextLong();
            if (a > 0 && a % 2 == 0) {
                sumAllPositNum += a;
            }
        }
          System.out.println("Сумма всех положительных чисел ровна" + sumAllPositNum);
    }
}

