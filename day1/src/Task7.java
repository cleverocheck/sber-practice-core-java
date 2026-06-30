//Выведите на экран первые n членов последовательности Фибоначчи,
//где n запрашивается у пользователя посредством консоли (2 < n < 100).

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long prev = 0;
        long curr = 1;

        System.out.print(prev + " " + curr);
        for (int i = 2; i < n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
            System.out.print(" " + curr);
        }
    }
}