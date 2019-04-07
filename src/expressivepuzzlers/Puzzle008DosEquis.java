package expressivepuzzlers;

public class Puzzle008DosEquis {
    public static void main(String[] args) {

        char x1 = 'X';
        int i = 0;
        System.out.println(true ? x1 : 0);
        System.out.println(false ? i : x1);
        System.out.println();
        
        char x2 = 'X';
        char j = 1;
        System.out.println(true ? x2 : 1);
        System.out.println(false ? j : x2);
    }
}
