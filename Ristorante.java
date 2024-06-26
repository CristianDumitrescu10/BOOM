import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class Ristorante {

    public static void main(String[] args) {
        Menu menu = new Ordinazione();
        //Piatto piattis= new Piatto("Carbonara", 14);
        menu.aggiungiPiatto();
        //Aggiungo piatti questo
        //System.out.println(menu.ArrayList<Piatto>);
        //Voglio Stampare un Menu
        


        menu.stampaMenu();

        // Ordiniamo
        Ordinazione ordinazione = new Ordinazione();

        // Stampo ordinazione
        ordinazione.stampaOrdinazione();
    }
}


class Piatto{
    String nome;
    double prezzo;

    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}

class Menu {
    ArrayList<Piatto> piatti = new ArrayList<>(); 
    
    public Menu() {
        this.piatti = new ArrayList<>();
    }

    public void aggiungiPiatto() {
        Piatto piattis= new Piatto("Carbonara", 14);
        piatti.add(piattis);
    }

    public void rimuoviPiatto(Piatto piatto) {
        piatti.remove(piatto);
    }

    public void modificaPrezzoPiatto(String nomePiatto, double nuovoPrezzo) {
        for (Piatto piatto : piatti) {
            if (piatto.getNome().equals(nomePiatto)) {
                piatto.setPrezzo(nuovoPrezzo);
                break;
            }
        }
    }
    public void stampaMenu() {
        System.out.println("Menu:");
        for (Piatto piatto : piatti) {
            System.out.println("- " + piatto.getNome() + ": " + piatto.getPrezzo() + "€");
        }
    }
}

class Ordinazione extends Menu{
    public Ordinazione(){
        super();
    }


    public double calcolaTotale() {
        double totale = 0;
        for (Piatto piatto : piatti) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }

    public void stampaOrdinazione() {
        System.out.println("Ordinazione:");
        for (Piatto piatto : piatti) {
            System.out.println("- " + piatto.getNome());
        }
        System.out.println("Totale: " + calcolaTotale() + "€");
    }
}


