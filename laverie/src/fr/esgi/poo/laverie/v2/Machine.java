package laverie.src.fr.esgi.poo.laverie.v2;

public class Machine {
            
    private boolean isUsed;
    private int name;

    public Machine(int name) {
        this.isUsed = false;
        this.name = name;
    }

    private boolean isUsed() {
        return isUsed;
    }

    public void start() {
        this.isUsed = true;
        System.out.println("Démarrage de la machine à laver n°" + this.name);
    }

    public void stop() {
        this.isUsed = false;
        System.out.println("Arrêt de la machine à laver n°" + this.name);
    }

    public void displayState(){
        System.out.println("Machine à laver n°" + this.name + ": " + this.isUsed);
    }


    


}
