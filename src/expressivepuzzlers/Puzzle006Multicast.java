package expressivepuzzlers;

public class Puzzle006Multicast {
    public static void main(String[] args) {

        System.out.println( (int) (char) (byte) -1 );
                        //  int <- char <- byte <- int -1
                        //   32 <-  16  <-  8   <- 32 bit
                        //         - (x)   +, -
                        //       2^16 - 1 (= 65535)
    }
}

// Bit Mash : 0 & 1 = 0


/*
    int i = (short) c;      // Sign Extension!!

    char c = (char) (b & 0xff);

    char c = (char) b;      // Sign Extension!!

 */
