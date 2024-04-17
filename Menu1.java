import java.util.Scanner;
import java.util.ArrayList;

class PiattoSpeciale {
    public String tipoPane;
    public int prezzoPane;
    public int numeroIngredienti;

    ArrayList<PiattoSpeciale> piattoSpeciale1 = new ArrayList<>();
    ArrayList<String> listaIngredienti = new ArrayList<>();
    ArrayList<Integer> listaPrezziIngredienti = new ArrayList<>();
    int prezzo;
    int base;

    public PiattoSpeciale(ArrayList<String> listaIngredienti2, ArrayList<Integer> listaPrezziIngredienti2, int numeroIngredienti2) {
        this.listaIngredienti = listaIngredienti2;
        this.listaPrezziIngredienti = listaPrezziIngredienti2;
        this.numeroIngredienti = numeroIngredienti2;

    }

    public void stampaComposizione() {
            System.out.println("Composizione del piatto speciale:");
            for (int i = 0; i < numeroIngredienti; i++) {
                String ingrediente = listaIngredienti.get(i);
                int prezzoIngrediente = listaPrezziIngredienti.get(i);
                System.out.println(ingrediente + " costa [" + prezzoIngrediente + "] Euro");
                prezzo += prezzoIngrediente;
            }
            // Aggiungiamo il prezzo del pane alla somma totale
            prezzo += listaPrezziIngredienti.get(0); // Il prezzo del pane è il primo elemento in listaPrezziIngredienti
        
            System.out.println("Il prezzo totale è: " + (prezzo+1) + " Euro");
    
    }

}

public class Menu1 {

    public String ingredienti;

    public static void main(String[] args) {
        String tipoPane = "";
        int prezzoPane = 0;
        String ingredienti = "";
        int prezzoing = 0;
        ArrayList<PiattoSpeciale> piattoSpeciale1 = new ArrayList<>();
        ArrayList<String> listaIngredienti = new ArrayList<>();
        ArrayList<Integer> listaPrezziIngredienti = new ArrayList<>();

        Scanner myStr = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        Scanner myint = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("Ciao, Vuoi Ordinare ancora? Scrivi Si per continuare");
            String app = myStr.nextLine();
            if (app.equalsIgnoreCase("si")) {
                System.out.println("1° Passo: Ora ti esporro una lista di tipi di pane seleziona il numero giusto");
                System.out.println("1-Pane Bianco");
                System.out.println("2-Pane Integrale");
                System.out.println("3-Focaccia");
                int selezione = myInt.nextInt();
                switch (selezione) {
                    case 1:
                        tipoPane = "Pane Bianco";
                        prezzoPane = 1;
                        System.out.println("Hai selezionato " + tipoPane + " Costa " + prezzoPane + "Euro");

                        break;

                    case 2:
                        tipoPane = "Pane Integrale";
                        prezzoPane = 1;
                        System.out.println("Hai selezionato: " + tipoPane + " Costa " + prezzoPane + " Euro");
                        break;

                    case 3:
                        tipoPane = "Focaccia";
                        prezzoPane =2;
                        System.out.println("Hai selezionato: " + tipoPane + " Costa " + prezzoPane + " Euro");
                        break;

                    default:
                        System.out.println("Monello, hai sbagliato!");
                        condition=false;
                        break;
                }

                listaIngredienti.add(tipoPane.trim());
                listaPrezziIngredienti.add(prezzoPane);
                System.out.println("Inserisci il numero di ingredienti");
                int numeroIngredienti = myint.nextInt();
                int i = 0;
                while (i<numeroIngredienti) {

                    System.out.println("Inserisci ingrediente numero" + (i + 1));
                    ingredienti = myStr.nextLine();
                    listaIngredienti.add(ingredienti.trim());
                    System.out.println("Quanto Costa?");
                    prezzoing = myint.nextInt();
                    listaPrezziIngredienti.add(prezzoing);
                    i++;

                }

                PiattoSpeciale piattoSpeciale = new PiattoSpeciale(listaIngredienti, listaPrezziIngredienti,numeroIngredienti);
                piattoSpeciale.stampaComposizione();
                piattoSpeciale1.add(piattoSpeciale);

            } else {
                System.out.println("Ciao Arrivederci");
                condition = false;
            }
        }
        System.out.println("\nPanini creati:");
        for (PiattoSpeciale piattoSpeciale : piattoSpeciale1) {
            piattoSpeciale.stampaComposizione();
        }
        myStr.close();
        myInt.close();
        myint.close();
    }
}
