import java.util.Scanner;
import  java.util.ArrayList;
import java.util.List; 
class PiattoSpeciale{
    public String tipoPane;
    public int prezzoPane;
    private String ingredienti1;
    private int prezzoing1;
    private String ingredienti2;
    private int prezzoing2;
    int prezzo;
    int base;
    public PiattoSpeciale(String tipoPane, int prezzoPane,String ingredienti1, int prezzoing1,String ingredienti2, int prezzoing2) {
        this.tipoPane = tipoPane;
        this.prezzoPane=prezzoPane;
        this.ingredienti1 = ingredienti1;
        this.prezzoing1=prezzoing1;
        this.ingredienti2 = ingredienti2;
        this.prezzoing2=prezzoing2;
    }

    public void stampaComposizione() {
        System.out.println("- Pane: " + tipoPane+" ["+prezzoPane+"] Euro");
        System.out.println("- Ingrediente 1:  " + ingredienti1+" ["+prezzoing1+"] Euro");
        System.out.println("- Ingrediente 2:  " + ingredienti2+" ["+prezzoing2+"] Euro");
        System.out.println("Il Totale è :  ["+(prezzoPane+prezzoing1+prezzoing2+1)+"] Euro");
        System.out.println();
    }
}

public class Menu {
    
    public String ingredienti;
    public static void main(String[] args) {
        String tipoPane="";
        int prezzoPane=0;
        String ingredienti1="";
        int prezzoing1=0;
        String ingredienti2="";
        int prezzoing2=0;
        List<PiattoSpeciale> piattoSpeciale1 = new ArrayList<>();
        Scanner myStr = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        Scanner myint = new Scanner(System.in);
        boolean condition=true;
        while (condition) {
            System.out.println("Ciao, Vuoi Ordinare? Scrivi Si per continuare");
            String app=myStr.nextLine();
            if (app.equalsIgnoreCase("si")) {
                System.out.println("1° Passo: Ora ti esporro una lista di tipi di pane seleziona il numero giusto");
                System.out.println("1-Pane Bianco");
                System.out.println("2-Pane Integrale");
                System.out.println("3-Focaccia");
                int selezione=myInt.nextInt();
                switch (selezione) {
                    case 1:
                        tipoPane="Pane Bianco";
                        prezzoPane=1;
                        System.out.println("Hai selezionato "+tipoPane+" Costa "+prezzoPane+"Euro");
                        break;

                    case 2:
                        tipoPane="Pane Integrale";
                        prezzoPane=1;
                        System.out.println("Hai selezionato: "+tipoPane+" Costa "+prezzoPane+" Euro");
                        break;

                    case 3:
                        tipoPane="Focaccia";
                        prezzoPane=(int) 1.50;
                        System.out.println("Hai selezionato: "+tipoPane+" Costa "+prezzoPane+" Euro");
                        break;
                
                    default:
                        System.out.println("Monello, hai sbagliato!");
                        condition=false;
                        break;
                }
                System.out.println("Inserisci primo ingrediente");
                ingredienti1=myStr.nextLine();
                System.out.println("Quanto Costa?");
                prezzoing1=myint.nextInt();
                System.out.println("Inserisci secondo ingrediente");
                ingredienti2=myStr.nextLine();
                System.out.println("Quanto Costa?");
                prezzoing2=myint.nextInt();


                PiattoSpeciale piattoSpeciale=new PiattoSpeciale(tipoPane,prezzoPane,ingredienti1,prezzoing1,ingredienti2,prezzoing2);
                piattoSpeciale.stampaComposizione();
                piattoSpeciale1.add(piattoSpeciale);

            }else{
                System.out.println("Ciao Arrivederci");
                condition=false;
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
