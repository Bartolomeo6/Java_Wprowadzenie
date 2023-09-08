public class Main
{
    public static void main(String[] args) {  /* psvm - haxy */

        System.out.println("Witaj na losowaniu liczb (JAVA - wprowadzenie)");

        //kom. jednoliniowy
        /*kom. wieloliniowy*/

        System.out.println("Losowanie liczby całkowitej z zakresu 1-100");
        int losowanaLiczba = (int)(Math.random()*100+1); /* Math.random() losuje liczbę z zakresu <0;1) */

        System.out.println("WYLOSOWANA LICZBA: "+losowanaLiczba); // wypisywanie

        /*
        TYPY PROSTE:
        - byte, short, int, long -> całkowite

        - float, double -> rzeczywiste

        boolean
        char

        rzutowanie rozszerzające - domyślne
        rzutowanie

         */
    }
}