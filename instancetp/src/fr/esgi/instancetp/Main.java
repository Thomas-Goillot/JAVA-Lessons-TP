package instancetp.src.fr.esgi.instancetp;

public class Main {

    public static void main(String[] args) {
        Son son = new Son();

        System.out.println(son.foo());

        System.out.println(son instanceof Son);

        Father father = new Father();

        System.out.println(father.foo());

        System.out.println(father instanceof Father);

        GrandFather grandFather = new GrandFather();

        System.out.println(grandFather.foo());

        System.out.println(grandFather instanceof GrandFather);




    }

}