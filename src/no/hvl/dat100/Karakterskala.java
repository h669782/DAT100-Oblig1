package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterskala {

    public static void main(String[] args) {
        int antall = 0;

        while(antall<10) {

        String poengTxt = showInputDialog("Poengsum:");
        int poeng = parseInt(poengTxt);

        while(100 < poeng || poeng < 0) {
            poengTxt = showInputDialog("Ugyldig sum, prøv på nytt:");
            poeng = parseInt(poengTxt);
        }

        switch(poeng/10) {
            case 10:
            case 9:
                System.out.println("Student nr."+ (antall+1) + ": A");
                break;
            case 8:
                System.out.println("Student nr."+ (antall+1) + ": B");
                break;
            case 7:
            case 6:
                System.out.println("Student nr."+ (antall+1) + ": C");
                break;
            case 5:
                System.out.println("Student nr."+ (antall+1) + ": D");
                break;
            case 4:
                System.out.println("Student nr."+ (antall+1) + ": E");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Student nr."+ (antall+1) + ": F");
                break;
            default:
                System.out.println("Ugyldig poengsum");

        }
        antall++;
        }


    }

}