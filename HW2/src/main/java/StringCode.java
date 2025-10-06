import java.io.StringBufferInputStream;
import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        StringBuilder string = new StringBuilder();
        int result = 1;
        int maxval = 0;
        for(int i = 0;i < str.length() - 1;i++) {
            if( str.charAt(i) == str.charAt(i+1) ) {
                result++;
            }
            else {
                result = 1;
            }
            maxval = Math.max(maxval, result);
        }

        return maxval; // YOUR CODE HERE
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        if(str.isEmpty()){
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for( int i = 0; i < str.length();i++ ) {

            if(Character.isDigit(str.charAt(i)) && i == str.length() - 1) {
                return stringBuilder.toString();
            }
            if(str.charAt(i) == '0') {
                continue;
            }
            if(!Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
            if( str.charAt(i) <= '9' && str.charAt(i) >= '1') {
                int val = str.charAt(i) - '0';
                for(int j = 0; j < val;j++   ) {
                    stringBuilder.append(str.charAt(i+1));
                }
            }
        }
        return  stringBuilder.toString();
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0 || a.length() < len || b.length() < len) {
            return false;
        }
        HashSet<String> hset = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            hset.add(a.substring(i, i + len));
        }
        for (int j = 0; j <= b.length() - len; j++) {
            if (hset.contains(b.substring(j, j + len))) {
                return true;
            }
        }
        return false; // YOUR CODE HERE
    }

    public static void main(String[] args) {
        
    }

}
