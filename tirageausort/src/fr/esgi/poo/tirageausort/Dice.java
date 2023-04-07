package tirageausort.src.fr.esgi.poo.tirageausort;

public class Dice {
    
    private int MAX = 6;

    public int roll() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(MAX) + 1;
    }
}
