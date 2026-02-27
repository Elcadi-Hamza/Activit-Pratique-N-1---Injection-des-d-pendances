# Activit-Pratique-N-1---Injection-des-d-pendances
Un compte rendu en reprenant l'exemple traité dans les vidéos des deux dernières séances.
## Consignes :
 - Créer une repository Github
  - Déposer le lien du repository comme seul livrable dans classroom
  - Pour chaque période de  30 min environ, Effectuer un commit et un push
  - Pour le rapport, utiliser le fichier README.MD du repository
  - à la fin de la séance, Faire un dernier commit
  - Après vous continuez à compléter l'activité pratique
---
Ressources vidéo à utiliser 
``` 
https://www.youtube.com/watch?v=vOLqabN-n2k
```
---
## Partie 1 : (Voir support et vidéo)
#### 1 - Création de l'interface IDao une méthode getData
Au premier temps, nous avons créé les packages net.hamza.dao, net.hamza.metier et net.hamza.pres.
Ensuite, nous avons créé l’interface IDao à l’intérieur du package net.hamza.dao.
puis on ajouter la methode getData()
```java
double getData();
```
#### 2. Création d'une implémentation de cette interface 
On créer la class DaoImpl qui implimente l'interface IDao et redefini
la methode getData()
```java
public double getData() {
    System.out.println("Version de base de donneés");
    return 34; // exemple de temperature = 34
}
```
#### 3. Création de l'interface IMetier avec une méthode calcul
On créer l'interface IMetier avec la méthode calcule() dans la package net.hamza.metier.
```java
double calcul();
```
#### 4. Création d'une implémentation de cette interface en utilisant le couplage faible
On créer la classe MetierImpl qui impliment l'interface IMetier dans la package metier et recreer la methode
calcul().
```java
public double calcul() {
    double t = dao.getData();
    double res = t - 273.15;
    return res;
}
```
Puis on utilise l'interface IDao avec le couplage faible (n'est pas instensier l'attribut)
```java
private IDao dao;
```
et definis les methodes pour instencier l'attribut dao (injecter dans l'attribut dao un objet d'une class qui impliment l'interface IDao), il'y a 2 façons de faire ça : 
On utilisant setter et constructeur par défaut: 
```java
public MetierImpl () {
    
}
public void setDao(IDao dao) {
    this.dao = dao;
}
```
ou on utilise le constructeur par paramétre : 
```java
public MetierImpl (IDao dao) {
    this.dao = dao;
}
```
**Remarque : Utilise constructeur par paramétre est mieux et plus optimiser.**
#### 5. Faire l'injection des dépendances :
##### a. Par instanciation statique
On créer la class Pres1 qui va initialiser les objets DaoImpl et MetierImpl
et puis on faire l'injection des dépendances, on utilisant le constructeur par parametre
```java
DaoImpl d = new DaoImpl();
MetierImpl metier = new MetierImpl(d);
```
apres on afficher le resultats 
```java
System.out.println("Resultat = "+ metier.calcul());
```
![img.png](img.png)
**Remarque : le probleme de cette methode d'injection est que la class Pres1 est pas feremer á la modification, parce que il y'a un dépandance fort entre la et les classes
DaoImpl et MetierImpl**
##### b. Par instanciation dynamique

