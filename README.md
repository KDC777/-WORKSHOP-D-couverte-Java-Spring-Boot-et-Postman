# WORKSHOP

Création d'un système d'authentification en Java Spring Boot.
Nous utiliserons Postman pour ajouter des utilisateurs à notre Database mySql.


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

  Créer une database "Workshop".
  Créer ensuite une table "user" avec :
 
       - un id
       - un username
       - un password 
 
 Vous devrez ensuite implémenter et configurer l'accés à votre database dans ressources/application.properties.
 
 
Exercice 2 :

      Implémenter User.java
  
      Ce fichier a pour but de créer des variables, correspondant aux champs présents dans notre table "user", de notre database "Workshop".
  
  
Exercice 3 :

    Implémenter UserController.java
  
    Le but est ici de pouvoir récupérer les informations passés par PostMan.
    Vous devrez donc créer 2 routes différentes (Une pour le logIn et une pour le signIn).
  
    Vérifiez à l'aide de Postman et de prints que vous recevez bien le username et/ou le password !
  
  
Exercice 4 :

    Implémenter UserRepository.java

    Ce fichier a pour but d'intéragir avec notre database "Workshop" de notre table "user".
    Il vous faudra une fonction pour le logIn et une fonction pour le signIn.
   
   
Exercice 5 :

    Implémenter UserService.java
    Maintenant que nous avons implémenter la possibilité de pouvoir communiquer avec la Database et nos routes, il faut maintenant faire le lien entre 
    les deux.

    Une fois fait :
    Vous pouvez à nouveau utiliser Postman pour envoyer des requêtes à votre serveur pour s'enregistrer ou s'authentifier !
    Vérifier cependant dans votre database que tout fonctionne bien !
  
  
Bonus :

    Réaliser un front pour le formulaire d'authentification !
       
  
 
