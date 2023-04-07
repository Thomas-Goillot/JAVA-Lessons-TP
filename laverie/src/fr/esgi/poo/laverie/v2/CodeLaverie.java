package laverie.src.fr.esgi.poo.laverie.v2;

import java.util.Scanner;

public class CodeLaverie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action = null;

        Laverie laverie = new Laverie(10);
        
        while (!"fin".equals(action)) {

            laverie.displayAllMachinesState();
            laverie.displayOption();

            action = scanner.next();

            laverie.handleAction(action);
        }

        scanner.close();

    }

}
