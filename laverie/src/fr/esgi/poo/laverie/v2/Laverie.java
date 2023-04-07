package laverie.src.fr.esgi.poo.laverie.v2;

public class Laverie {
    
    public Machine[] machines;

    public Laverie(int nbMachines) {
        this.machines = new Machine[nbMachines];
        for (int i = 0; i < machines.length; i++) {
            machines[i] = new Machine((i+1));
        }
    }

    public void startMachine(int machineNumber){
        machines[machineNumber-1].start();
    }

    public void stopMachine(int machineNumber){
        machines[machineNumber-1].stop();
    }

    public void displayAllMachinesState() {
        System.out.println("** ETAT DES MACHINES A LAVER **");
        for (Machine machine : machines) {
            machine.displayState();
        }
    }

    public void displayOption(){
        System.out.println("* Opérations possibles *");
        for (int i = 0; i < machines.length; i++) {
            System.out.println((i+1) + "/-" + (i+1) + " : lancer/arrêter la machine à laver n°" + (i+1));
        }
        System.out.println("Que voulez-vous faire (fin=quitter) ?");
    }
    
    public void handleAction(String action){
        if (action.startsWith("-")) {
            action = action.substring(1);
            this.stopMachine(Integer.parseInt(action));
        }
        else {
            this.startMachine(Integer.parseInt(action));
        }
    }



}