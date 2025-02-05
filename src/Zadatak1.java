//Napišite program koji od korisnika učitava tekst u
// dvije varijable. U prvoj varijabli odvojeno razmakom ime i prezime,
// a u drugoj varijabli grad rođenja.
// Potrebno je ispisati ime i prezime,
// a ako je duljina imena veća od 7 znakova,
// tražiti korisnika da ponovi unos i ispisati
// mu poruku „Ime sadrži više od 7 znakova”.
// Razmaci prije i nakon imena i prezimena ne uzimaju se u obzir.
// Za grad rođenja potrebno je ispisati koje samoglasnike sadrži
// (provjera prema malim slovima).

//Primjer ispisa:
//Upišite ime i prezime:
//       ”     Miro Mirić  ”
//Upišite grad rođenja:
//Varaždin
//upisali ste ime: Miro
//upisali ste prezime: Mirić
//grad ima samoglasnik a
//grad ima samoglasnik i

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upišite ime i prezime:");
        String ImeiPrezime = sc.nextLine();//varijabla za imeIprezime
        String[] imepezime = ImeiPrezime.split(" ");
        if (imepezime[0].length() > 7) {
            System.out.println("Unesite ime ponovo.Ime sadrzi vise od 7 znakova");
  return;
        }
        System.out.println("Upišite grad rođenja:");
        String GradRođenja = sc.nextLine();//varijabla za gradrodenja
        System.out.println("Upisali ste ime: " + imepezime[0]);
        System.out.println("Upisali ste prezime: " + imepezime[1]);
        GradRođenja = GradRođenja.toLowerCase();
        System.out.println("Grad rođenja je = " + GradRođenja);
        String[] gradrodenja = GradRođenja.split("");


        for (int i = 0; i < GradRođenja.length(); i++) {
            char s = GradRođenja.charAt(i);


            if (s == 'a') {
                System.out.println("Grad ima samoglasnik a");
            }
             if (s == 'e') {
                System.out.println("Grad ima samoglasnik e");
            }  if (s == 'i') {
                System.out.println("Grad ima samoglasnik i");
            }  if (s == 'o') {
                System.out.println("Grad ima samoglasnik o");
            }  if (s == 'u') {
                System.out.println("Grad ima samoglasnik u");
            }
        }
    }


}

