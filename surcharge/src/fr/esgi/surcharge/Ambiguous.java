package surcharge.src.fr.esgi.surcharge;

public class Ambiguous {
    
    public static int calculate(int a, long b) {
        return 10*a + (int) b;
    }

    public static int calculate(long a, int b) {
        return 1000*(int) a + b;
    }

}
