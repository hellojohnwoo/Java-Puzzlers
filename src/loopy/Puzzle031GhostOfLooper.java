package loopy;

public class Puzzle031GhostOfLooper {
    public static void main(String[] args) {

    //    while (i != 0)
    //        i >>>= 1;

    }
}


/*
    >>> : Big size type -> Short size type (O) - Not warning message


    short i = -1;

    1. i ((short)0xffff) is not 0, execute for
    2. short i -> int i (byte, char  -> int)
       not data loss
       (short) +,- 0xffff -> (int)0x7fff ffff

    3. int -> short
        data loss about top 16bits
 */


/*
    SUMMMARY
    1. DO NOT USE " >>> etc..."
                about short, byte, char type of Variable
 */