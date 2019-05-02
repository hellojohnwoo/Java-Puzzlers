package loopy;

public class Puzzle025Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++)
            j++;                        // VS. j = j++; (X)
        System.out.println(j);
    }
}


/*
    j = j++;

=

    int tmp = j;
    j = j + 1;
    j = tmp;

    Result : 0

 */