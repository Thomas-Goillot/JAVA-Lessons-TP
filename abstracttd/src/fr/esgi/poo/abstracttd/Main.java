package abstracttd.src.fr.esgi.poo.abstracttd;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        shapes[3] = new Circle();

        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }        

    }

}