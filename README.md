# Big City Library v2 : BATCH

## ✨ Présentation :

Ce projet a pour but la création d’un ensemble d’outils numériques pour les différents acteurs des bibliothèques d'une ville.
1. Un envoi automatique de mails : BATCH ([GitHub](https://github.com/Coyote-31/batch))
2. Un Back-end : RESTFull Serveur (Projet développé ici [GitHub](https://github.com/Coyote-31/big_city_library.rest_server))
3. Un Front-end : RESTFull Client Public ([GitHub](https://github.com/Coyote-31/big_city_library.rest_client_public))


> **IMPORTANT:**
> Ce projet fait partie du cursus de formation "Développeur J2EE" de [OpenClassroom](https://openclassrooms.com/).
> Les informations qu'il comporte ne doivent pas être utilisées dans le cadre d'une pratique réelle.
> Les informations présentées ici ne servent qu'à illustrer le projet pour le rendre le plus proche possible de la réalité.

## 📱 Application :

L'application est un BATCH qui communique avec le RESTFull Serveur. Il permet l'envoit automatique de mails.
Développé en **Java EE** sur l'**IDE Visual Studio Code**.
Cette application utilise le framework Spring et les dépendences Lombok & OpenFeign et des JWT pour l'authentification.
Elle est packagée via **[Maven](https://maven.apache.org/index.html)** dans un fichier `.war` pour être déployée sur un serveur compatible comme : **[Apache TomEE v9.0](https://tomee.apache.org/)**.

#### Architecture de l'application :

![Architecture de l'application](https://i.imgur.com/C0z5X92.png)

## 🛠 Déploiement :

Pour déployer correctement l'application veuillez suivre ces étapes :

#### 1. Packaging Maven :

Pour compiler et packager l'application dans un fichier `.war`, il faut utiliser le goal [`install`](https://maven.apache.org/plugins/maven-install-plugin/) de Maven avec la commande `mvn install`. Le fichier se créé alors dans le dossier *target*.
> On peut aussi utiliser le goal [`deploy`](https://maven.apache.org/plugins/maven-deploy-plugin/) mais cela demande de configurer le fichier POM, ce que je ne développerai pas ici.

#### 2. Serveur d'application :

La dernière étape est de mettre en ligne le serveur **[Apache TomEE v9.0](https://tomee.apache.org/)**.

Lorsque ce dernier est en ligne, dans l'interface du serveur Apache cliquer sur le bouton `Manager App`.
Après s'être identifier trouver la partie `Deployer > Fichier WAR à déployer` et y déployer le fichier `.war` précédemment généré à l'étape 1.

✅ **Bravo !** *L'application web est maintenant 100% fonctionnelle !*
