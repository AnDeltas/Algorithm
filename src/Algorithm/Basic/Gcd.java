package Algorithm.Basic;


/**
 * 算法描述:
 * 求p和q的最大公约数, 如果q等于0, 最大公约数就是p
 * , 否则, 令r为p除q的余数, p和q的最大公约数就是q
 * 和r的最大公约数
 */
public class Gcd {
    /**
     * 递归实现求最大公约数
     * @return 最大公约数
     */
    public static int gcd1(int p, int q) {
        if (q == 0) return p;
        return gcd1(q, p % q);
    }

    /**
     * 迭代实现最大公约数
     * @return 最大公约数
     */
    public static int gcd2(int p, int q) {
        while (q != 0){
            int tmp = p;
            p = q;
            q = tmp % q;
        }
        return p;
    }

    public static void main(String[] args) {
        // 测试样例
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
        System.out.println("递归实现" + gcd1(a, b));
        System.out.println("迭代实现" + gcd2(a, b));
    }
}
