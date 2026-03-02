package net.hamza.pres;

import net.hamza.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.hamza"); // créer les objets basans sur l'annotation
        // => c-a-d il va chercher dans les packages q'on va specifier et trouver les classes qui utilise l'annotation components et il va instancier
        // si tu besion de scanner juste certain package tu peut ecrit comme un argument "net.hamza.dao","net.hamza.metier"
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Res = "+metier.calcul());

    }
}
