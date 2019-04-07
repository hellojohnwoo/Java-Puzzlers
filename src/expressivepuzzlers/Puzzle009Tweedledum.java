package expressivepuzzlers;

public class Puzzle009Tweedledum {
    public static void main(String[] args) {

        // x += i;      VS.     x = x + i;

        short x = 0;
        int i = 123456;
        System.out.println(x += i);     // x = x + i;  (X)
                                        /* Be careful
                                            byte, short, char += (X)
                                         */

    }

}
