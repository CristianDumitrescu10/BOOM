import java.util.ArrayList;

class Piatto {
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
    private ArrayList<Piatto> piatti;

    public Menu() {
        this.piatti = new ArrayList<>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
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
class Ordinazione {
    ArrayList<Piatto> piatti;

    public Ordinazione() {
        this.piatti = new ArrayList<>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    public void rimuoviPiatto(Piatto piatto) {
        piatti.remove(piatto);
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

public class Ristorante2 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.aggiungiPiatto(new Piatto("Carbonara", 14));
        menu.stampaMenu();

        // Creazione di un'ordinazione e aggiunta di piatti
        Ordinazione ordinazione = new Ordinazione();
        ordinazione.aggiungiPiatto(new Piatto("Carbonara", 14));
        ordinazione.stampaOrdinazione();
    }
}