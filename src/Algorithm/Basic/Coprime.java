package Algorithm.Basic;

public class Coprime {
    /**
     * 判断两个数字是否互质
     * 算法分析: 如果两个数字的最大公约数是1, 则两数互质
     */
    public static boolean isCoprime(int i, int j){
        return Gcd.gcd2(i, j) == 1;
    }

    public static void main(String[] args) {
        final int N = 10;
        boolean[][] matrix = new boolean[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = isCoprime(i, j);
            }
        }
        for (boolean[] booleans : matrix) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean + "\t");
            }
            System.out.println();
        }
    }
}
