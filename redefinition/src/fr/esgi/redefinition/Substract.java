package redefinition.src.fr.esgi.redefinition;

public class Substract extends Sum {

    public Substract(int a, int b) {
        super(a, b);
    }

    @Override
    public int compute() {
        return a - b;
    }
}
