package core.practice.sber.task3;

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