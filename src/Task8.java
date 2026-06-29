//Создайте простую игру, основанную на угадывании букв.
//Пользователь должен угадать загаданную букву A-Z введя ее в консоль. Если
//пользователь угадал букву, то программа выведет «Right» и игра закончится, если
//нет, то пользователь продолжит вводить буквы.
//(Опционально) Вывести:
//«You’re too low», - если пользователь ввел букву меньше загаданной
//«You’re too high», - если пользователь ввел букву больше загаданной
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char hiddenLetter = 'H';

        while(true) {
            char letter = scanner.nextLine().charAt(0);

            if(letter == hiddenLetter) {
                System.out.print("Right");
                break;
            } else System.out.println("You’re too " + (letter > hiddenLetter ? "high" : "low"));
        }
    }
}

