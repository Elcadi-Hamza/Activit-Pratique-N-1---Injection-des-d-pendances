package net.hamza.metier;

import net.hamza.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// annotation version text add start
@Component("metier")
// annotation version text add end
public class MetierImpl implements IMetier {
    @Autowired @Qualifier("dao2") // permet de l'injection automatique d'un objet de type IDao et Qualifier permet de selectionner le bean ou le type d'objet s'il y'a plusieur components
    private IDao dao; //Coupage faible (pas d'instensation)
    /**
    * Pour injecter dans l'attribut dao un objet d'une class qui impliment l'interface IDao
    * il y'a deux chemin pour definir l'attribut dao on utilise le constructeur par defaut et setters
    * apres l'instensiation ou le consturcteur avec parammeter au moment de l'instensiation
    **/
    // si tu n'a pas utiliser @Autowired il faut specifier @Qualifier("") dans l'argument de constructeur (@Qualifier("dao") IDao dao)
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
