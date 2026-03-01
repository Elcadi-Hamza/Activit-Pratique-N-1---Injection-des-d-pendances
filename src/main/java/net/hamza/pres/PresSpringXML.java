package net.hamza.pres;

import net.hamza.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main (String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml"); // Spring va lire le fichier resources/config.xml et creer un objet dao et l'objet metier et faire l'injection des depandances
        IMetier metier = (IMetier) springContext.getBean("metier"); // donner mois un bean qui l'id metier
        // or you can use the name of interface and spring gonna look for the class that implements that interface
        // IMetier metier =  springContext.getBean(IMetier.class);
        System.out.println("Res = "+ metier.calcul());
    }
}
