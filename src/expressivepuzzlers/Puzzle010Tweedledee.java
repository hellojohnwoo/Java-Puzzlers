package expressivepuzzlers;

public class Puzzle010Tweedledee {
    public static void main(String[] args) {


        // x = x + i;       VS.         x += i; (X)

        Object x = "Buy";
        String i = "Effective Java!";

        System.out.println(x = x + i);
    }
}
