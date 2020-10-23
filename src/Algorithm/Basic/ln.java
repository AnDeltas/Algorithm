package Algorithm.Basic;

public class ln {
    /**
     * 计算n的阶乘的自然对数
     */
    public static double getLn(double n){
        if (n == 1) return 0;
        return Math.log(n) + getLn(n -1);
    }

    public static void main(String[] args) {
        System.out.println(getLn(7));
    }
}
