import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        if (original == reversed) System.out.print("Палиндром");
        else System.out.print("Не палиндром");
    }
}