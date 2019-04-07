package expressivepuzzlers;

public class Puzzle007CleverSwap {
    public static void main(String[] args) {

        int x = 1111;
        int y = 3333;

        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}


/*

int tmp = x;
x = y;
y =tmp;



x ^= y ^= x ^= y;

int tmp1 = x;
int imp2 = y;
int imp3 = x ^ y;

x = tmp3;
y = tmp2 ^ tmp3;
x = tmp1 ^ y;


 */