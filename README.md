# Révisions

## Exercice 1

On vous demande de réaliser une ébauche d'application pour gérer une médiathèque.

La médiathèque gère des **Médias** qui peuvent être des **Livres**, **CD**

Ces **Médias** ont tous :

 - Un **Titre**
 - Un **Auteur**
 - Une **Date de retour**

Un **Livre** a en plus :

- Un nombre de pages

Un **CD** a en plus :

- Un nombre de titres
- Une durée (en seconde)



Un **Emprunteur**  a :

- Un **Nom**
- Un **Prénom**
- Une liste de **médias empruntés**

Pour un **Emprunteur** on doit pouvoir

- Eprunter un média en donnant une date de retour

- Voir les **Médias** empruntés comme par exemple :

  - Livre | Le petit Prince | A. St Exupery | 120 pages | A retourner le : 20/12/2018

  - CD | Izia | Izia | 12 Titres | 2432 secondes | A retourner le : 20/12/2018



#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications

Pensez aux constructeurs, à la visibilité des attributs et méthodes.

Pensez au nommage 

Utilisez les collections les plus appropriées

**Avec votre navigateur :**

```
- Aller sur https://classroom.github.com/a/sTVgxC17
- Cliquer sur "Accept this assignement"
- Patientez pendant que votre dépot se créé...
- Cliquer sur le lien vers le dépot (après Your assignment has been created here: ..)
- Copier l'url "https" du dépôt en cliquant sur le bouton vert "Clone or Download"
```

**sur git bash :**

```
$ git clone https://github.com/Le-Cnam/USSI2A-Revisions-votre_identidiant_github
$ cd USSI2A-Revisions-votre_identidiant_github
$ git checkout -b votre_prenom_nom
```

**sur intellij**

```
- Cliquer sur File > New > Project from Exiting Sources (ou *Import Project* si vous êtes sur l'écran d'accueil)
- Selectionner le dossier du projet sur votre disque
- Selectionner Create project from existing sources
- Conserver les informations (Nom, Location, Format)
- IntelliJ détecte que c'est un projet Java
- Aucune bibliothèque n'est integrée au projet : c'est normal
- IntelliJ créé un modules USSI2A-Revisions
- Choisir JDK13
- Aucun Framework n'est detecté : c'est normal
- Aller dans File > Project Structure et Choisir "13" dans Project language level
```

A la fin, n'oublier pas d'enoyer votre travail **sur git bash** avec la commande suivante qui envoie toutes les branches :

```
$ git push origin --all
```



Le code de la classe **net.lecnam.ussi2a.revisions.exo1.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        CD cd = new CD("Izia", "Izia",  12, 2432);

        Emprunteur e = new Emprunteur("Arya", "Stark");
        
        // Ajouter le livre avec une date de retour le 20/12/2018
        // Ajouter le CD avec une date de retour le 20/12/2018
        
        // voir les médias empruntés

    }
}
```



## Exercice 2

On vous demande de réaliser une ébauche d'application pour gérer des employés

Un **Employé** a :

- Un **nom**
- Une **date de naissance**
- Un **salaire**
- Une **date d'embauche**

Un **Ingenieur** a en plus :

- un **grade**

Pour un **Employé** ou un **Ingenieur** on doit pouvoir

- Voir ses caractéristiques tel que :

  - Nom | Date de naissance
- voir son salaire sachant que pour un ingénieur, pour chaque unité de grade, son salaire est augmenté d'autant de centaines (ex, grade 1, +100€, grade 2, + 200€, etc...)
- Doit pouvoir avoir son salaire être **augmenté**
- Doit pouvoir changer de **grade**

Les employés et ingénieurs travaillent au sein d'une **Société** qui possède :

- Un **nom**
- Des **collaborateurs**   

Dans une société, on doit pouvoir :

- Lister les collaborateurs par **date d'embauche croissante**
- Exporter un fichier csv des collaborateurs
- Importer un fichier csv de nouveaux collaborateurs



#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications

Le code de la classe **net.lecnam.ussi2a.revisions.exo2.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        // Ajouter une société
        
        // Ajouter un employee
        // Ajouter un ingenieur
       
        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur
        
        // augmenter le salaire l'employé
        // augmenter le grade de l'ingenieur
        
        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur
        
        // Lister les collaborateur par date d'embauche croissante
        
        // Exporter les collaborateurs dans un csv
        // Importer les collaborateurs depuis un csv

    }
}
```

## Exercice 3

On vous demande de réaliser une ébauche d'application pour gérer des comptes bancaire

Une banque a des clients, chaque client peut avoir 1 seul compte courant et 1 ou plusieurs comptes d'épargne.

Un compte courant ne procure pas d'intéret mais on peut avoir une autorisation de découvert.
Un compte d'épargne a un taux d'interet et procure des intérets

Sur un compte, on faire des opérations (pour verser ou retirer de l'argent). Une exception personalisée doit pouvoir se declancher si on retire de l'argent au dela du seuil minimum 

Ecrire le programme correspondant à ces spécification 

Le code de la classe **net.lecnam.ussi2a.revisions.exo3.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        // Ajouter un client
        
        // Ajouter des comptes
        
        // Réaliser des opérations sur des comptes
        
        // Dépasser le seuil minimum d'un compte
        
        // Lister les comptes d'un client avec le solde

    }
}
```

