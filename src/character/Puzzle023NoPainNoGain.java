package character;
import java.util.Random;

public class Puzzle023NoPainNoGain {
    public static void main(String[] args) {
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(randomElement(a));
    }

    private static Random rnd = new Random();
    private static String randomElement(String[] a) {
        return a[rnd.nextInt(a.length)];
    }
}
