package redefinition.src.fr.esgi.redefinition;

public class Sum {

    protected int a;
    protected int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int compute() {
        return a + b;
    }
    
}
