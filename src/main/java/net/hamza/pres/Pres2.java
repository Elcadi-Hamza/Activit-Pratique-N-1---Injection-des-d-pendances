package net.hamza.pres;

import net.hamza.dao.IDao;
import net.hamza.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    // FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main (String[] args) throws  Exception {
        //  tu peut utiliser ca ou throws FileNotFounException
        //  try {
        //      Scanner sc = new Scanner(new File("config.txt"));
        //  } catch (FileNotFoundException e) {
        //      throw new RuntimeException(e);
        //  }
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName); //Charge on memoir la class qui dans la variable daoClassName, and si la class n'a pas trouver ClassNotFoundException
        IDao dao = (IDao) cDao.newInstance(); //instancier le constructeur par defaut, c'est comme DaoImpl d = new DaoImpl(); et ajouter les exceptions correspondant
        // (IDao) s'appele un sous casting
        System.out.println(dao.getData());
        // cDao.getConstructor(IDao.class).newInstance(); // constructeur avec parametre

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        // constructeur avec parametre
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao); // constructeur par parametre
        System.out.println("Res = " + metier.calcul());

        // constructeur par defaut + setter
        // si tu vas utiliser le setter au lieu de constructeur avec parametre
        // IMetier metier2 = (IMetier) cMetier.getConstructor().newInstance(); // appeler le consturcteur par defaut
        // Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class); // appler le setter setDao qui accept un seul parametre de type IDao.class (si il y'a 2 paramametre just add a coma ',' and add the type of the parametre like String.class)
        // setDao.invoke(metier2,dao); // Invoke est execute cette methode dans l'objet metier2, avec parametre dao <=> metier2.setDao(dao)




        
        
    }
}
