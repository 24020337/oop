public class Solution {
    /**
     * find fibonacci number n.
     * @param n is an integer number
     * @return fibonacci number n
     */
    public static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 0) {
            return -1;
        }
        long fibo1 = 0;
        long fibo2 = 1;
        long temp = 0;
        for (int i = 1; i <= n; i++) {
            if (fibo1 > Long.MAX_VALUE - fibo2) {
                return Long.MAX_VALUE;
            }
            temp = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        for(int i=1;i<80;i++) {
            System.out.println("fibo "+i+": "+Solution.fibonacci(i));
            //System.out.println(Solution.fibonaci(i));
        }
    }

}
// 1 1 2 3 5 8 13 21 34 55