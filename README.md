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
```
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