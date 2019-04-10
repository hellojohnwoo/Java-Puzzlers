package loopy;

public class Puzzle024BigDelight {
    private static final byte TARGET = (byte)0x90;
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
            if (b == TARGET)
                System.out.println("Joy!");


        /*for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.println("Joy!");

        }
        */
    }
}
