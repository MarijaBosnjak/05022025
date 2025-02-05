import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Niz znakova-String
        String fakultet="Fakultet organizacije i informatike Varaždin";
        String[] rijecFakultet=fakultet.split(" ");
        for (String s : rijecFakultet) {
            System.out.println(s);

        }
        List<String> niz=  new ArrayList<>();
        niz.add("zazulhagjbjk");//dodavanje elemenata u string
        String recenica = "    Danas je bio hladan dan   ";
        System.out.println ("Ovaj unos ima znakova= " +recenica.length());//length ispisuje broj znakova
        recenica=recenica.trim();//trim uklanja razmake na pocetku i na kraju sringa :)
        System.out.println ("Broj znakova nakon skracivanja je = " +recenica.length());
    }
}