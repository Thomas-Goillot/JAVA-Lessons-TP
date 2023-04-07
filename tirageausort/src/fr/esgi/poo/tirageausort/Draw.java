package tirageausort.src.fr.esgi.poo.tirageausort;

public class Draw {
    
    public final static int NUMBER_DRAW = 100;
    private int[] numberDraws = new int[6];

    public void rollDraws() {
        Dice dice = new Dice();
        for (int i = 0; i < NUMBER_DRAW; i++) {
            int number = dice.roll();
            numberDraws[number - 1]++;
        }
    }

    public void displayDraws() {
        for (int i = 0; i < numberDraws.length; i++) {
            System.out.println("Number " + (i + 1) + " : " + numberDraws[i]);
        }
    }

}
