package primoProgramma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String nome = null;
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        nome = input.next();
        System.out.println("ho letto "+nome);*/
        Atm atm = new Atm();
        ContoCorrente conto = new ContoCorrente(6);
        System.out.println("saldo: "+conto.getSaldo());
        atm.preleva(conto, 5);
        System.out.println("saldo: "+conto.getSaldo());
        atm.versa(conto, 10);
        System.out.println("saldo: "+conto.getSaldo());
    }
}
