package core.practice.sber;

//В три переменные a, b и c записаны три вещественных числа. Создать
//программу, которая будет находить и выводить на экран вещественные корни
//квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
public class Task9 {
    public static void main(String[] args) {
        //!double a = 1;
        //!double b = 2;
        //!double c = 1;
        double a = 2;
        double b = 5;
        double c = -3;
        double d = b * b - 4 * a * c;

        if (d < 0) System.out.println("Корней нет");
        else if (Math.abs(d) < 1e-10) System.out.println("x = " + -b / (2 * a));
        else {
            System.out.println("x1 = " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));
        }
    }
}

