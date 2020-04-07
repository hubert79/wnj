package wizytowka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int liczba;
        int silnia = 1;

        System.out.println("Podaj liczbę");
        liczba = in.nextInt();

        while (liczba > 0){

            silnia = silnia * liczba;

            liczba--;
        }
        System.out.println("##########");
        System.out.println(silnia);
        System.out.println("##########");

        while (silnia >= 100){
            silnia = silnia - silnia%10;
            silnia = silnia / 10;
        }
        System.out.println(silnia);
    }
}
