package redefinition.src.fr.esgi.redefinition;

public class Main {

    public static void main(String[] args) {

        Sum sum = new Sum(1, 2);
        System.out.println(sum.compute());

        Substract substract = new Substract(1, 2);
        System.out.println(substract.compute());

        Multiplty multiplty = new Multiplty(1, 2);
        System.out.println(multiplty.compute());
        

    }

}