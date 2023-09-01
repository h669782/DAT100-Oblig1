package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class nFakultet {

    public static void main(String[] args) {
        String nTxt = showInputDialog("Skriv inn et tall:");
        int n = parseInt(nTxt);

        while(n<=0) {
            nTxt = showInputDialog("Tallet må være større enn 0:");
            n = parseInt(nTxt);
        }

        int sum = 1;

        for(int i = 1; i <= n ; i++) {
            sum *= i;

            if(i == 1) {
                System.out.print("!" + n + ": " + i + " * ");
            } else if(i == n) {
                System.out.println(i);
            } else {
                System.out.print(i + " * ");
            }
        }
        System.out.println("\nVerdien av !" + n + " er: " + sum);
    }
}