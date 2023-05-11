package trycatchfinally.src.esgi.poo.trycatchfinally;

public class Divider {
    private int dividend;
    private int divisor;

    public Divider(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int divide() {

        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible");
            return 0;
        } finally {
            System.out.println("Opération terminée");
        }

    }

}
