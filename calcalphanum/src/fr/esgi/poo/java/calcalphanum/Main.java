package calcalphanum.src.fr.esgi.poo.java.calcalphanum;

public class Main {

    public static void main(String[] args) {

        CalcAlphaNum calcAlphaNum = new CalcAlphaNum();

        System.out.println(calcAlphaNum.addition(1, 2));
        System.out.println(calcAlphaNum.addition("1", "2"));
        System.out.println(calcAlphaNum.increment(1));
        System.out.println(calcAlphaNum.decrement(1));
        System.out.println(calcAlphaNum.isEquals(1, 2));
        System.out.println(calcAlphaNum.isEquals(2, 2));
        System.out.println(calcAlphaNum.isEquals("1", "2"));
        System.out.println(calcAlphaNum.isEquals("2", "2"));
        System.out.println(calcAlphaNum.max(1, 2, 3));
        
    }

}