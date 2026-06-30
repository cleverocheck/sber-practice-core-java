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

class Matrix {
    public static final int SIZE = 2;
    private final int[][] array = new int[SIZE][SIZE];

    public void setValue(int i, int j, int value) {
        array[i][j] = value;
    }

    public void add(Matrix other) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) setValue(i, j, array[i][j] + other.array[i][j]);
    }

    public void multiply(int scalar) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) setValue(i, j, array[i][j] * scalar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sb.append(String.format("%4d", array[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void multiply(Matrix other) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int sum = 0;
                for (int k = 0; k < SIZE; k++) {
                    sum += this.array[i][k] * other.array[k][j];
                }
                setValue(i, j, sum);
            }
        }
    }
}