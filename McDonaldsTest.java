
//Sistema di abinamento del McDonalds Tavolo
//Output- Abbinare uno dei 6 tavoli che deve essere libero all ordine e stampare, numero tavolo, totale ordine con budget scelto e piatti per nr di persone
import java.util.Scanner;
import java.util.ArrayList;
public class McDonaldsTest {

    public static void main(String[] args) {
        Scanner myStr = new Scanner(System.in);
        int numeroTavoli = 6;

        String databaseTavoli2[] = { "Tavolo1", "Libero", "", "Tavolo2", "Libero", "", "Tavolo3", "Libero", "","Tavolo4", "Libero", "", "Tavolo5", "Libero", "", "Tavolo6", "Libero", "", };

        ArrayList<String> tavoli4 = new ArrayList<>();

        for (int i = 0; i < databaseTavoli2.length; i++) {
            tavoli4.add(databaseTavoli2[i]);
        }

        System.out.println(tavoli4);

        int j = 1;
        int index = 1;
        boolean condition = true;

        while (condition == true) {
            System.out.println("Un altro cliente ha deciso di sedersi al tavolo? SI");
            String clientePresente = myStr.nextLine();
            if (clientePresente.equalsIgnoreCase("si")) {
                while (j <= numeroTavoli) {
                    String element = tavoli4.get(index);
                    if (element.equals("Libero")) {
                        tavoli4.set(index, "Occupato");
                        // Qua vogliamo inserire tutte le caratteristiche del Cliente
                        break;
                    }
                    j++;
                    index = index + 3;

                }
                System.out.println(tavoli4);
            } else {
                condition = false;
                break;

            }

        }
        j = 1;
        index = 0;
        while (j <= numeroTavoli) {
            System.out.println("Il " + tavoli4.get(index) + " è " + tavoli4.get(index + 1)+ ". le sue caratteristiche sono: " + tavoli4.get(index + 2));
            j++;
            index = index + 3;

        }
        myStr.close();
    }

}
