package loopy;

public class Puzzle026InTheLoop {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (long i = START; i <= END; i++) {       // for (int i = START; i <= END; i++)   (X)
            count++;                                // int i = START;
                                                    // do { count++; } while (i++ != END);  (NG, but some FAST than LONG TYPE)
        System.out.println(count);

        }
    }
}
