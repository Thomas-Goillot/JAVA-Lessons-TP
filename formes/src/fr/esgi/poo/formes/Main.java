package fomes.src.fr.esgi.poo.formes;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Surface du rectangle : " + rectangle.area());
        System.out.println("Périmètre du rectangle : " + rectangle.perimeter());

        Square square = new Square(5);
        System.out.println("Surface du carré : " + square.area());
        System.out.println("Périmètre du carré : " + square.perimeter());
        
    }

}   