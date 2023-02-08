# WORKSHOP

Création d'un système d'authentification en Java Spring Boot.
Nous utiliserons Postman pour ajouter des utilisateurs à notre Database.


# Prérequis Workshop :

Etape 1:

  Installation de Postman : https://www.postman.com

Etape 2:
  
  Initialiser son projet Spring boot : https://start.spring.io
      
      Project : Maven
      Language : Java
      Spring boot : 3.0.2
      Project Metadata :
          Group : com.Auth
          Artifact : auth
          Name : auth
          Description : Spring Boot Authentification
          Package name : com.Auth
          Packaging : Jar
          Java : 11
          
  Dependencies :
  
      Spring Data Jpa
      MySqlDriver

 
 # Exercices :
 
 
 Exercice 1 :
 
    Créer une database "Workshop" avec mySql
    Créer ensuite une table "user" avec :
     
     - un id
     - un username
     - un password 
     
     Vous devez ensuite l'implémenter dans ressources/application.properties
     
  Exercice 2 :
 
      Implémenter User.java
      
      Ce fichier a pour but de stocker dans des variables ce qu'on a dans la table "user" de notre database "Workshop"
  
  Exercice 3 :
        
       Implémenter UserRepository.java
       
       Ce fichier a pour but d'intéragir avec notre database "Workshop" et notre table "user"
       Il vous faudra une fonction pour le login et une fonction poue le register
  
  Exercice 4 :
  
      Implémenter UserService.java
      Maintenant que nous avons implémenter la possibilité de pouvoir communiquer avec la Database, nous allons maintenant gérer nos cas d'erreurs
      
  Exercice 5 :
  
      Implémenter UserController.java
      Maintenant que nous avons gérer nos cas d'erreur nous pouvons créer nos routes login et signIn dans deux fonctions différentes pour différencier l'action que nous avons à faire dans la Database
      
     
      
  Exercice 6 :
  
      Vous pouvez désormais utiliser Postman pour envoyer des requètes à notre serveur pour s'enregistrer ou s'authentifier !
      
      Vérifier cependant dans votre database que tout fonctionne bien !
      
  
  Bonus :
  
      Réaliser un front dans le langage de votre choix le formulaire d'authentification !
      
    
      
      
       
  
 
