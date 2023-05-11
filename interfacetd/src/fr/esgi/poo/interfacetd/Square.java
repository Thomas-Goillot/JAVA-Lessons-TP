package interfacetd.src.fr.esgi.poo.interfacetd;

public class Square implements Areable {

    private int side;

    public Square(int side) {
        this.side = side;

        computeArea();
    }

    @Override
    public void computeArea() {
        System.out.println("Square area: " + (side * side));
    }
    
}
