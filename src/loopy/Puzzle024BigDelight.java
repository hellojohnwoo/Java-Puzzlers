package loopy;

public class Puzzle024BigDelight {

    private static final byte TARGET = (byte)0x90;  // = 0x90 (X) : error

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


/*
    0x90 : 2-digit 16(hexa)decimal CONSTANT
            = 1-ditgit -> 4bit, 1-ditgit -> 4bit ...
            = 16 -> 8bit(1byte)

     byte : -128 ~ +127
     but, 0x90 is +144(int type)

     ( (byte) 0x90 == 0x90 ) false
     so, NO +144  -> -122
 */

/*
    SUMMARY
    1. DO N.O.T Compare other types
    2. Declare the constants as much as possible
       and compare them.

    + 3. Mask NG
    + 4. Consider literal about All Default Type
 */