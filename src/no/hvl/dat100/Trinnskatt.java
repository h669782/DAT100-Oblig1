package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Trinnskatt {
    public static void main(String[] args){
        String bruttoinntektTxt = showInputDialog("Bruttolønn:");
        int bruttoInntekt = parseInt(bruttoinntektTxt);

        double sats;
        int[] rentesats = {0, 164101, 230951, 580651, 934051};

        if (bruttoInntekt <= rentesats[1]) {
            sats = 10;
        } else if (bruttoInntekt <= rentesats[2]) {
            sats = 0.0093;
        } else if (bruttoInntekt <= rentesats[3]) {
            sats = 0.0241;
        } else if (bruttoInntekt <= rentesats[4]) {
            sats = 0.1152;
        } else {
            sats = 0.1452;
        }

        double nettoInntekt = bruttoInntekt - (bruttoInntekt * sats);
        double skatt = bruttoInntekt*sats;
        
        String utTxt = "Bruttoinntekt: " + bruttoInntekt + "kr" + 
        		       "\nSkatt: " + skatt + "kr" +
        		       "\nNettolonn: " + nettoInntekt + "kr";
        
        showMessageDialog(null, utTxt);
    }
}