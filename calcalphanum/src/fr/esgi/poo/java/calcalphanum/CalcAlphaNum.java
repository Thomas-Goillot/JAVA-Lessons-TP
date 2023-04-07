package calcalphanum.src.fr.esgi.poo.java.calcalphanum;

public class CalcAlphaNum {
    
    public int addition (int a, int b) {
        return a + b;
    }

    public String addition (String a, String b) {
        return a + b;
    }

    public int increment(int a) {
        return ++a;
    }

    public int decrement(int a) {
        return a--;
    }

    public boolean isEquals(int a, int b) {
        return a == b;
    }

    public boolean isEquals(String a, String b) {
        return a == b;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
        
    }
}
