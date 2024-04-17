import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class McDonalds2 {
    static class Tavolo {
        boolean libero;
        String numeroTavolo;
        double prezzoPerPersona;
        Tavolo(boolean libero, double prezzoPerPersona) {
            this.libero = libero;
            this.prezzoPerPersona = prezzoPerPersona;
        }
        public boolean isLibero(){
            return libero;
        }
        public void setLibero(boolean libero) {
            this.libero = libero;
        }
        //Serve solo per farlo partire da solo
        public double getPrezzoPerPersona() {
            return prezzoPerPersona;
        }
        //Serve solo per farlo partire da solo
        public void setPrezzoPerPersona(double prezzoPerPersona) {
            this.prezzoPerPersona = prezzoPerPersona;
        }
    }
    public static void main(String[] args) {
        Scanner myStr = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        int numeroTavoli = 6;
        int budgetTotale;//Prezzo per Persona
        Map<Integer, Tavolo> dizionarioTavoli = new HashMap<>();
        for (int i = 1; i <= numeroTavoli; i++) {
            int nomeTavolo = i;
            boolean libero=true;
            budgetTotale=80;
            //budgetTotale=(McDonaldsSupremo.numeroPersone * McDonaldsSupremo.budget)
            Tavolo tavolo = new Tavolo(libero, budgetTotale);
            dizionarioTavoli.put(nomeTavolo,tavolo); // Prezzo per persona di 80 come esempio
        }
        boolean m=true;
        while(m==true){
            System.out.println("Dizionario dei tavoli:");
            for (Map.Entry<Integer, Tavolo> entry : dizionarioTavoli.entrySet()) {
                Integer nomeTavolo = entry.getKey();
                Tavolo tavolo = entry.getValue();
                System.out.println("Tavolo Numero: " + nomeTavolo + ", é Libero?: " + tavolo.isLibero() + ", Totale Ordine: " + tavolo.getPrezzoPerPersona()+" Euro");
            }
            System.out.println("Scegli quale Tavolo vuoi occupare");
            int sceltaTavolo=myInt.nextInt();
            if (sceltaTavolo >= 1 && sceltaTavolo <= numeroTavoli) {
                Tavolo tavoloScelto = dizionarioTavoli.get(sceltaTavolo);
                boolean tavoloLibero=tavoloScelto.isLibero();
                if (tavoloLibero==true){
                    System.out.println("il tavolo è libero");
                    tavoloScelto.setLibero(false); 
                }else{
                    System.out.println("il tavolo non è libero");
                    System.out.println("Vuoi Liberarlo? rispondi si");
                    String liberare=myStr.nextLine();
                    if(liberare.equalsIgnoreCase("si")){
                        tavoloScelto.setLibero(true);

                    }
                }    
                // Stampa le informazioni del tavolo scelto
                System.out.println("Hai scelto il tavolo " + sceltaTavolo);
                System.out.println("Stato: Libero = " + tavoloScelto.isLibero() + ", Prezzo per persona = " + tavoloScelto.getPrezzoPerPersona()+" Euro");   
            } else {
                System.out.println("Scelta non valida. Inserisci un numero di tavolo valido.");
            }
        }
        myInt.close();
        myStr.close();
    }
}