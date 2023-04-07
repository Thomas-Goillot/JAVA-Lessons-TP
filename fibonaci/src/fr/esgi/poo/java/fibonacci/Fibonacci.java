package fibonaci.src.fr.esgi.poo.java.fibonacci;

public class Fibonacci {


    public int[] fibonacci = new int[10];


    public void fill() {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[2] = fibonacci[0] + fibonacci[1];
        for (int i = 3; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    public void display() {
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
    }





}
