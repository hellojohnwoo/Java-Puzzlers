package loopy;

public class Puzzle027Shifty {
    public static void main(String[] args) {
        int distance = 0;
        for (int val = -1; val != 0; val <<= 1)
            distance++;
        System.out.println(distance);
    }
}

/*
    java Using Two's-complement
    so, (byte, short, int,  long)
    +,- CONSTANT -1 is 1 (All bits)


    int i = 0;
    while (-1 << i != 0)        int -1 : 32bits is All -1 (0xffffff)
        i++;

    ...println(i);

 */


/*
    int -1 (Binary number)
    1111 1111 1111 1111

        -1 << 1
    1111 1111 1111 1110

        -1 << 32
    Not 0, Just -1
    becuz, Only move the 5bits at Right Side
    int Type: 00000 (Binary) ~ 11111 (Binary)
                0            ~ 31
 */


/*
    SUMMARY
    1. DO NOT USE Variable
          USE     Consitance

 */