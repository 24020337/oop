public class Binary {
    public static void main(String[] args) {
        int n =  Integer.parseInt(args[0]);

        String getBinary = Integer.toBinaryString(n);
        System.out.println(getBinary);
    }
}
