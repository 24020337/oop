public class Prime {
    /**
     * n is Prime or not.
     * @param n is integer number
     * @return Prime or not
     */

    public static boolean isPrime(int n) {
        if ( n <= 1 ) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Prime.isPrime(223232));
    }
}
