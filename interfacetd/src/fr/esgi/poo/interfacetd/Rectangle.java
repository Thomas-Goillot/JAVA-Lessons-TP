package interfacetd.src.fr.esgi.poo.interfacetd;

public class Rectangle implements Areable {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        computeArea();
    }

    @Override
    public void computeArea() {
        System.out.println("Rectangle area: " + (width * height));
    }
    
}
