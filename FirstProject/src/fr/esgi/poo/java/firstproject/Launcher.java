package FirstProject.src.fr.esgi.poo.java.firstproject;

public class Launcher {

    public static void main(String[] args) {

        Integer  nombre = 3;

        MySampleClass foo = new MySampleClass(nombre);

        MySampleClass foo2 = new MySampleClass(4); 



        System.out.println("foo myNumber: " + foo.myNumber); //3
        System.out.println("foo isOK: " + foo.getIs0K()); // true

        foo.myNumber = 10;
        foo.setIs0K(true);

        System.out.println("foo myNumber: " + foo.myNumber); //10
        System.out.println("foo isOK: " + foo.getIs0K()); // true

    }

}