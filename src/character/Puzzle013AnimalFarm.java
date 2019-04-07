package character;

public class Puzzle013AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length : 10";
        final String dog = "length : " + pig.length();
        System.out.println("Animal are equal1 : " + pig == dog);
        System.out.println("Animal are equal2 : " + (pig == dog));
        System.out.println("Animal are equal3 : " + pig.equals(dog));

                                                                    //  System.identityHashCode()


        System.out.println();

        String a = "intern";
        String b = "intern";
        System.out.println(a == b);


        System.out.println();

        String x = "intern";
        String y = new String("intern");            //  String contructor
        String z = new String("intern");
        System.out.println(x == y);
        System.out.println(y == z);

    }
}
