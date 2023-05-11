package trycatch.src.fr.esgi.poo.trycatch;

public class IntArray {

    private int[] values;

    private static final int MAX_SIZE = 5;

    public IntArray() {
        this.values = new int[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            this.values[i] = i;
        }

    }

    public void display() {
        for (int i = 0; i < values.length; i++) {
            System.out.println(this.values[i]);
        }
    }

    public void displayWithException(){
        int i = 0;
        try {
            while (true) {
                System.out.println(this.values[i++]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
    }


}
