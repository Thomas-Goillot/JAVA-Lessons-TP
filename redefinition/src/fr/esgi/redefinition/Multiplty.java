package redefinition.src.fr.esgi.redefinition;

public class Multiplty extends Sum {

    private int a;
    private int b;

    public Multiplty(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int compute() {
        return a * b;
    }
    
}
