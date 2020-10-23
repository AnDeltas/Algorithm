package Algorithm.Basic;

/**
 * 矩阵乘法
 */
public class matrix {
    public static void printMatrix(int[][] m){
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        final int N = 3, M = 4;
        int[][] a = new int[N][M];
        int[][] b = new int[M][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                b[j][i] = a[i][j] = i * j;
            }

        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // TODO
                System.out.println("待完成");
            }
        }

        printMatrix(a);
        printMatrix(b);
        printMatrix(c);
    }
}
