package wizytowka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        * poprosić wyświetlenie hasła
        * jeżeli hasło jest prawidłowe napis gratulacje
        * jeżli wyśwetla hasło powtrzóerz
        * po 3 błędnych próbach error
        * */

        int haslo = 12;
        int h;
        int proba = 0;
        Scanner in = new Scanner(System.in);

        while (proba < 3){

            System.out.println("Podaj hasło ");
            h = in.nextInt();

            if(h == haslo){
                proba = 3;
                System.out.println("Gratulacje");
            }
            else {
                System.out.println("błą∂");
                proba++;

                if(proba >+ 3){
                    System.out.println("ERROER");
                }
            }
        }

    }
}
