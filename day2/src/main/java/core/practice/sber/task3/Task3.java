package core.practice.sber.task3;

public class Task3 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        matrix1.setValue(0, 0, 10);
        System.out.println(matrix1);

        Matrix matrix2 = new Matrix();
        matrix2.setValue(0, 0, 20);
        System.out.println(matrix2);

        matrix1.add(matrix2);
        System.out.println(matrix1);

        matrix1.multiply(2);
        System.out.println(matrix1);

        matrix1.multiply(matrix2);
        System.out.println(matrix1);
    }
}