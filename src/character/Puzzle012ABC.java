package character;

public class ABC {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = {'1','2','3'};
        System.out.println(letters + " easy as " + numbers);

        System.out.println();
        System.out.println(letters + " easy as " + String.valueOf(numbers));
                                                    // Char[] -> String.valueOf( char[] );

        System.out.println();
        System.out.print(letters + " easy as ");
        System.out.println(numbers);
        System.out.println();




        String letters2 = "XYZ";
        Object numbers2 = new char[] { '1', '2', '3'};
        System.out.print(letters2 + " easy as ");
        System.out.println(numbers2);
    }
}
