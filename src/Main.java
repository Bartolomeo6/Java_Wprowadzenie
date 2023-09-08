import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {  /* psvm - haxy */

        System.out.println("Witaj na losowaniu liczb (JAVA - wprowadzenie)");

        //kom. jednoliniowy
        /*kom. wieloliniowy*/

        System.out.println("Losowanie liczby całkowitej z zakresu 1-100");
        int losowanaLiczba = (int)(Math.random()*100+1); /* Math.random() losuje liczbę z zakresu <0;1) */

        /*
        TYPY PROSTE:
        - byte, short, int, long -> całkowite

        - float, double -> rzeczywiste

        boolean
        char

        rzutowanie rozszerzające - domyślne
        rzutowanie zawężające z double (int)

         */

        /* System.out.println("WYLOSOWANA LICZBA: "+losowanaLiczba); // wypisywanie */

        /* ----------------------------------------------------------------------- */

        System.out.println("Zgadnij liczbę");       //sout

        Scanner klawiatura = new Scanner(System.in);        // SCANNER - wpisywanie wartości

        int wpisanaLiczba;

        //////////////////// PĘTLA FOR ///////////////////

                            // fori

        //////////////////// PĘTLA WHILE ///////////////////

        wpisanaLiczba = klawiatura.nextInt();           // przy WHILE musi być wcześniej zainicjowana zmienna

        while(wpisanaLiczba != losowanaLiczba)
        {

            wpisanaLiczba = klawiatura.nextInt();
            System.out.println("Wpisano: " + wpisanaLiczba);

            if (losowanaLiczba == wpisanaLiczba)
            {
                System.out.println("Gratulacje");
                break;
            }

            else if (losowanaLiczba < wpisanaLiczba)
            {

                System.out.println("Za duża wartość...");

            }

            else
            {

                System.out.println("Za mało!");

            }
        }
        /*
        else
        {
            //////////////////// SPRAWDZANIE LICZBY (IF skrócony //////////////

            int roznica = losowanaLiczba > wpisanaLiczba ? losowanaLiczba - wpisanaLiczba : wpisanaLiczba - losowanaLiczba;

            /////////////////////// dzielenie całkowite ///////////////////////////

                                       roznica /= 10;

            ///////////////////////// WYRAŻENIE SWITCH ////////////////////////////////

            System.out.println
            (

                 switch (roznica)
                 {

                     case 0 -> "Close ONE!";
                     case 1 -> "No nieźle";
                     case 2 -> "Całkiem, całkiem...";
                     default -> "Spróbuj jeszcze raz!";

                 }

            );
            */

            ///////////////////////////// SWITCH - NORMALNY //////////////////////////////

            /*switch(roznica)
            {

                case 0:
                    System.out.println("Close ONE!");
                    break;

                case 1:
                    System.out.println("No nieźle");
                    break;

                case 2:
                    System.out.println("Całkiem, całkiem...");
                    break;

                default:
                    System.out.println("Spróbuj jeszcze raz!");

            }*/

            /*System.out.println("Bruh");
            System.out.println("Pomyliłeś się o: "+roznica);

        }*/
    }
}