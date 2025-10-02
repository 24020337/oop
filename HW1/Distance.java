//Exercise 18, 1.2 IPIJ
public class Distance {
    public static void main(String[] val) {
        int x = Integer.parseInt(val[0]);
        int y = Integer.parseInt(val[1]);
        double distance =Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance is " + distance);
    }
}
