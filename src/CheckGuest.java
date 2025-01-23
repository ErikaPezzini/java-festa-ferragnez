import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Array invitati
        String [] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // Chiedere il nome all'user
        System.out.println("Inserisci nome e cognome:");
        String guest = scan.nextLine();

        // Verificare che il nome sia presente
        boolean invited = false;
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equalsIgnoreCase(guest)) {
                invited = true;
                break;
            }
        }

        // Lasciarlo entrare o no
        if (invited) {
            System.out.println("Benvenuto/a alla festa," + guest + "!");
        } else {
            System.out.println("Mi dispiace, " + guest + ", ma non sei nella lista degli invitati. Non puoi entrare!");
        }

        // Con while
        System.out.println("Inserisci nome e cognome:");
        guest = scan.nextLine();

        invited = false;
        int i = 0;
        while (i < guestList.length) {
            if (guestList[i].equalsIgnoreCase(guest)) {
                invited = true;
                break;
            }
            i++;
        }

        if (invited) {
            System.out.println("Benvenuto/a alla festa," + guest + "!");
        } else {
            System.out.println("Mi dispiace, " + guest + ", ma non sei nella lista degli invitati. Non puoi entrare!");
        }
    }
}
