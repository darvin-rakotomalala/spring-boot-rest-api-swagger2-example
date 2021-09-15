## Exemple documentation de l'API REST avec Swagger2 Spring Boot
Dans ce projet, nous configurons une application Spring Boot pour intégrer swagger2. <br/>
La documentation des APIs REST est très importante. Cette documentation doit aider les consommateurs 
du service à savoir quels sont tous les services disponibles, les signatures, les entrées attendues.

### Qu'est-ce que Swagger
---
Swagger est un langage de description d'interface pour décrire les API RESTful exprimées à l'aide de JSON et conformes à la [spécification OpenAPI](https://en.wikipedia.org/wiki/OpenAPI_Specification) (OAS).<br/>
Swagger est utilisé avec un ensemble d'outils logiciels open source pour concevoir, créer, documenter et utiliser 
des services Web RESTful. Swagger inclut une documentation automatisée, une génération de code et une génération de cas de test.

### Qu'est-ce qu'une API REST
---
REST signifie REpresentational State Transfer, une approche standardisée de la création de services Web.
Une API REST est une interface de programmation d'application intermédiaire qui permet à deux applications 
de communiquer entre elles via HTTP, un peu comme la façon dont les serveurs communiquent avec les navigateurs.<br/>
	
RESTful est l'approche la plus courante pour créer des services Web en raison de sa facilité d'apprentissage et de création.

### Prérequis
---
Pour ce projet, vous auriez besoin des spécifications suivantes :
- Spring Boot v2.0+
- JDK v1.8+
- Maven 3+ ou Gradle 4+ - outil de construction
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSC, NetBeans, etc.)

### Dependances Maven
---
Dans cet exemple nous allons utiliser les dependances Maven suivants :
- **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
- **Spring Data JPA** - API de persistance Java et Hibernate
- **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications
- Pilote **PostgreSQL** - pilote JDBC pour la base de données PostgreSQL
- **Springfox-swagger2** et les **springfox-swagger-ui** dépendances pour la documentation de l'API Swagger 2

### Tester les APIs REST
---
Pour tester la documentation API Swagger, ouvrez le navigateur et entrez l'URL suivante - `localhost:8080/swagger-ui.html` ou `http://localhost:8080/v2/api-docs` <br/>
Soit utilisez un client REST comme postman pour importer la collection des WS en utilisant url : `http://localhost:8080/v2/api-docs`
<br/><br/>
![imgSwagger2](https://user-images.githubusercontent.com/75081354/133259063-89c8c858-1378-43b3-8dd2-fe2e79aaf10d.png)

### Installation
---
* git clone https://github.com/darvin-rakotomalala/spring-boot-rest-api-swagger2-example.git

### Conclusion
---
Chaque jour, des entreprises et des particuliers commencent à utiliser Swagger comme outil de choix pour exposer les API REST à des tiers.<br/>

En utilisant les outils de Swagger, vous pouvez générer du code basé sur la documentation d'une API, 
ainsi que créer une belle documentation interactive. Cela permet à la fois d'économiser du temps et des efforts et 
offre une norme avec laquelle les personnes peuvent travailler.

