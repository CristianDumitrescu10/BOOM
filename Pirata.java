import java.util.Scanner;
class Persona {
    protected String nome;
    public Persona(String nome) {
        this.nome = nome;
    }

    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome);
    }
}

class Pirata extends Persona {
    public Pirata(String nome) {
        super(nome);
    }

    public void saluta() {
        System.out.println("Argh! Sono il pirata " + nome + "!, Voglio derubarti di tutti i tuoi Buoni Pasto!");
    }
    public static void main(String[] args) {
        Scanner myStr = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome ");
        String nome1=myStr.nextLine();
        Persona persona1 = new Persona(nome1);
        persona1.saluta(); 

        System.out.println("Inserisci il nome del Pirata ");
        String nome2=myStr.nextLine();
        Pirata pirata1 = new Pirata(nome2);
        pirata1.saluta(); 
        myStr.close();
    }
}