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
  

      
     
      
  Exercice 6 :
  
      Vous pouvez désormais utiliser Postman pour envoyer des requètes à notre serveur pour s'enregistrer ou s'authentifier !
      
      Vérifier cependant dans votre database que tout fonctionne bien !
      
  
  Bonus :
  
      Réaliser un front dans le langage de votre choix le formulaire d'authentification !
      
    
      
      
       
  
 
