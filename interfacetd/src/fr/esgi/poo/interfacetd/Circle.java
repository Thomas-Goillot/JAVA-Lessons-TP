package interfacetd.src.fr.esgi.poo.interfacetd;

public class Circle implements Areable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;

        computeArea();
    }

    @Override
    public void computeArea() {
        System.out.println("Circle area: " + (Math.PI * radius * radius));
    }
    
}
