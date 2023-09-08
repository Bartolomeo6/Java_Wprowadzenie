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

        System.out.println("WYLOSOWANA LICZBA: "+losowanaLiczba); // wypisywanie

        /* ----------------------------------------------------------------------- */

        System.out.println("Zgadnij liczbę");

        Scanner klawiatura = new Scanner(System.in);        // SCANNER - wpisywanie wartości
        int wpisanaLiczba = klawiatura.nextInt();

        System.out.println("Wpisano: "+wpisanaLiczba);

        if(losowanaLiczba == wpisanaLiczba)
        {

            System.out.println("Gratulacje");

        }
        else
        {
            int roznica = losowanaLiczba > wpisanaLiczba ? losowanaLiczba - wpisanaLiczba : wpisanaLiczba - losowanaLiczba ;
            System.out.println("Bruh");
            System.out.println("Pomyliłeś się o: "+roznica);

        }
    }
}