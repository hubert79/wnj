package wizytowka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);

        while (true){

            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            System.out.println("##########");

            if(a != b && b != c && a != c){

                if(a > b && a >c){
                    System.out.println(a);
                }
                else if(b > a && b >c){
                    System.out.println(b);
                }
                else if(c > a && c >b){
                    System.out.println(c);
                }
            }
            else if(a == b && b == c && a == c){
                System.out.println(a);
            }
            else if(a == b && a != c && b != c){

                if(a > c){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }
            }
            else if(a == c && a != b && c != b){

                if(a > b){
                    System.out.println(a);
                }
                else {
                    System.out.println(b);
                }
            }
            else if(b == c && b != a && c != a){

                if(b > a){
                    System.out.println(b);
                }
                else {
                    System.out.println(a);
                }
            }
            System.out.println("##########");
        }
    }
}
