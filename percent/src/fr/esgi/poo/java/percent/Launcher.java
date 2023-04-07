package percent.src.fr.esgi.poo.java.percent;

public class Launcher {

    public static void main(String[] args) {
        Percent percent = new Percent(50);
        Launcher launcher = new Launcher();
        launcher.updateInt(percent.getEntier());

        
    }

    public void updateInt(int entier) {
        entier = 2;
    }

    public void updateIntFinal(int entier) {
        entier++;
    }

    public int updateAndReturnInt(int entier) {
        updateInt(entier);
        return entier;
    }

    public void updatePercent(Percent percent){
        percent.setEntier(4);
    }



}