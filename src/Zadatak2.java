//Napišite program koji učitava niz znakova sa
//standardnog ulaza i ispisuje koliko ima slova, koliko brojeva i
//koliko "ostalih znakova". Npr. ako je uneseni niz znakova
//"Danas je 27.02.2010.", program treba ispisati:

//Slova: 7
//Brojevi: 8
//Ostali znakovi: 5
//Koristi klasu Character

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiši niz znakova ");
        String NizZnakova = sc.nextLine();
        int slova = 0;
        int brojevi = 0;
        int znakova = 0;

        for (int i = 0; i < NizZnakova.length(); i++) {
            char s=NizZnakova.charAt(i);
            if (Character.isLetter(s)){//slova
                slova++;
            }
            else if(Character.isDigit(s)){//provjera za broj
                brojevi++;
            }
            else{
                znakova++;
            }
        }
       System.out.println("Broj slova u  upisanom nizu je "+ slova);
        System.out.println("Broj brojeva u  upisanom nizu je "+ brojevi);
        System.out.println("Broj ostalih znakova  u  upisanom nizu je "+ znakova);
    }


}
