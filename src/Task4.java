//В переменной n хранится натуральное трёхзначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n.
public class Task4 {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.print(sum);
    }
}
