package character;

public class Puzzle016LinePrinter {
    public static void main(String[] args) {

        // Note : reverse slush u000A is Unicode representation of LineFeed(LF)
        char c = 0x000A;
        System.out.println(c);


        System.out.println("****");


        char d = '\n';
        System.out.println(d);


        System.out.println("********");


        System.out.printf("%n%n");


    }
}
