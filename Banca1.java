import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContoBancario{
    
    //Rappresenta la classe base per tutti i tipi di conti bancari.
    //Attributi privati:
    //titolare: Il nome del titolare del conto.
    private String titolare;
    //saldo: Il saldo corrente del conto.
    private double saldo;
    
    //Metodi:
    //Costruttore: Inizializza il conto con il nome del titolare e il saldo iniziale.
    public ContoBancario(String titolare, double saldo){
        this.titolare=titolare;
        this.saldo=saldo;

    }
    //deposita(double importo): Aumenta il saldo del conto.
    public void deposita(double importo) {
        saldo += importo;
    }
    //preleva(double importo): Diminuisce il saldo del conto se ci sono fondi sufficienti.

    public void preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
        } else {
            System.out.println("NO MONEY");
        }
    }
    //getSaldo(): Restituisce il saldo del conto.
    public double getSaldo() {
        return saldo;
    }
    //getTitolare(): Restituisce il nome del titolare del conto.
    public String getTitolare() {
        return titolare;
    }    
}
//Estende la classe ContoBancario.
class ContoRisparmio extends ContoBancario{
    
    //tassoInteresse: Il tasso di interesse annuale.
    private double tassoInteresse;
    public ContoRisparmio(String titolare, double saldo, double tassoInteresse) {
        super(titolare, saldo);
        this.tassoInteresse = tassoInteresse;
    }

    //Metodo:
        //aggiungiInteresse(): Applica l'interesse al saldo del conto.
    public void aggiungiInteresse(){
        double interesse=getSaldo()*tassoInteresse/100;
        deposita(interesse);
    }
     
    
}
//Gestisce la lista dei conti bancari.

public class Banca1 {
    private List<ContoBancario> conti;

    public Banca1() {
        conti = new ArrayList<>();
    }

    public void aggiungiConto(ContoBancario conto) {
        conti.add(conto);
    }

    public double getSaldoTotale() {
        double saldoTotale = 0;
        for (ContoBancario conto : conti) {
            saldoTotale += conto.getSaldo();
        }
        return saldoTotale;
    }

    public void stampaSaldi() {
        for (ContoBancario conto : conti) {
            System.out.println("Titolare: " + conto.getTitolare() + ", Saldo: " + conto.getSaldo());
        }
    }
    

    public static void main(String[]args){
        Scanner myStr = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        Banca1 banca= new Banca1();

        System.out.println("Benvenuto nella PippoBank");
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println(" ");
        //Questi conti sono inseriti di base
        ContoBancario contoCorrente1 = new ContoBancario("Shrek", 1000000.0);
        ContoRisparmio contoRisparmio2 = new ContoRisparmio("Cristian Dumitrescu", 201.0, 2.5);
        // Aggiunta dei conti alla banca
        banca.aggiungiConto(contoCorrente1);
        banca.aggiungiConto(contoRisparmio2);

        System.out.println("Menù Pippobank");
        System.out.println("Azioni:");
        System.out.println("[1]Aggiungere Nuovo Conto");
        System.out.println("[2]Gestire Conto");
        System.out.println("[3]Stampa Saldo Totale della Banca(Opzione riservata agli Admin)");
        int menu=myInt.nextInt();
        switch (menu) {
            case 1:
                
                break;

            case 2:
                
                break;

            case 3:
                contoCorrente1.deposita(500.0);
                contoCorrente1.preleva(300.0);
    
                contoRisparmio2.aggiungiInteresse();
    
                banca.stampaSaldi();
    
                System.out.println("Saldo totale: " + banca.getSaldoTotale());
                
                break;
        
            default:
                System.out.println("Sei entrato nei meandri oscuri della banca, non so se ne uscirai vivo");

                break;
        }

    }

}