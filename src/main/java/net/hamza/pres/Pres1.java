package net.hamza.pres;

import net.hamza.dao.DaoImpl;
import net.hamza.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        // Création de l'objet deao et metier
        DaoImpl d = new DaoImpl();
        // l'injection des depandances via le constructeurs
        MetierImpl metier = new MetierImpl(d);
        // l'injection des depandances via le setter
        // metier.setDao(d);
        System.out.println("Resultat = "+ metier.calcul());
    }
}
