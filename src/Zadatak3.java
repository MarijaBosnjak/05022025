//Zadatak3
//Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i
// okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Dobar


import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi zeljenu recenicu ");
        String recenica = sc.nextLine();

        String[] rijeci = recenica.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = rijeci.length - 1; i >= 0; i--) {
            sb.append(rijeci[i]);
            if (i > 0) {
                sb.append(" ");
            }
            System.out.println("Obrnuti redosljed rijeci je: " +sb.toString());
        }
    }

}
