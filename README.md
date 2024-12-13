
# Weather Info App

## Description
**Weather Info App** est une application Kotlin simple qui permet de récupérer des informations météorologiques pour une ville donnée en utilisant l'API OpenWeatherMap. Elle fournit des détails tels que la température, les conditions météorologiques, l'humidité, et la vitesse du vent.

## Structure du Projet
```plaintext
├── .gitignore             # Fichiers à exclure du contrôle de version
├── build.gradle.kts       # Configuration du projet Gradle
├── settings.gradle.kts    # Paramètres du projet Gradle
├── src/
│   └── main/
│       └── kotlin/
│           ├── Main.kt             # Point d'entrée principal
│           ├── Models.kt           # Modèles de données
│           ├── WeatherService.kt   # Service pour les appels API
│           └── weatherData.kt      # Modèle pour les données météo
```

## Fonctionnalités
- Saisie du nom d'une ville par l'utilisateur.
- Récupération des données météorologiques via l'API OpenWeatherMap.
- Affichage des informations suivantes :
  - Température
  - Conditions météorologiques
  - Humidité
  - Vitesse du vent

## Prérequis
- **Kotlin 1.8.0** ou version ultérieure
- **Gradle 8.10**
- Clé API OpenWeatherMap (remplacez `apiKey` dans `WeatherService.kt` par votre propre clé)

## Installation
1. Clonez ce dépôt :
   ```bash
   git clone <URL-du-dépôt>
   ```
2. Naviguez dans le répertoire du projet :
   ```bash
   cd WeatherApp
   ```
3. Importez le projet dans votre IDE préféré (IntelliJ IDEA recommandé).
4. Ajoutez votre clé API OpenWeatherMap dans le fichier `WeatherService.kt`.

## Exécution
1. Lancez l'application via votre IDE ou en ligne de commande :
   ```bash
   ./gradlew run
   ```
2. Entrez le nom d'une ville lorsqu'il vous est demandé.

## Dépendances
Le projet utilise les bibliothèques suivantes :
- [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization) pour la sérialisation JSON.
- [Ktor](https://ktor.io/) pour les appels HTTP.

## Contribuer
Les contributions sont les bienvenues ! Veuillez ouvrir une **issue** ou soumettre une **pull request** pour discuter des modifications proposées.

## Licence
Ce projet est sous licence Apache 2.0. Consultez le fichier `LICENSE` pour plus d'informations.
