package wizytowka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int liczba;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        liczba = in.nextInt();

        System.out.println(liczba);


        while (liczba > 0 & liczba > 1){

            if (liczba%2 == 1){

                liczba = liczba - 1;
                liczba = liczba/2;
            }
            else {
                liczba = liczba/2;
            }
            System.out.println(liczba);
        }
    }
}



























