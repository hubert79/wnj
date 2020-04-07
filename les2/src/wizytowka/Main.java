package wizytowka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int wiek;

        System.out.println("Podaj wiek");
        Scanner in = new Scanner(System.in);
        wiek = in.nextInt();

        if(wiek < 18){
            System.out.println("smarkacz");
        }
        else {
            System.out.println("stary");
        }
    }
}
