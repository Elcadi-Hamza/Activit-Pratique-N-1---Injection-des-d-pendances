package net.hamza.metier;

import net.hamza.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //Coupage faible (pas d'instensation)
    /**
    * Pour injecter dans l'attribut dao un objet d'une class qui impliment l'interface IDao
    * il y'a deux chemin pour definir l'attribut dao on utilise le constructeur par defaut et setters
    * apres l'instensiation ou le consturcteur avec parammeter au moment de l'instensiation
    **/
    public MetierImpl (IDao dao) {
        this.dao = dao;
    }

    public MetierImpl () {}

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t - 273.15;
        return res;
    }
    // Remarque setters sont des mauvaise pratique et generalement utilise le constructeur par paramétre
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
