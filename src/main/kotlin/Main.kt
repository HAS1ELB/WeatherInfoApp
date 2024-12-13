package main.kotlin

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Bienvenue dans Weather Info App !")
    print("Entrez le nom d'une ville : ")
    val city = readLine().orEmpty()

    val weatherService = WeatherService()
    val weather = weatherService.getWeather(city)

    if (weather != null) {
        println("\nDétails météo pour $city :")
        println("Température : ${weather.temperature}°C")
        println("Condition : ${weather.condition}")
        println("Humidité : ${weather.humidity}%")
        println("Vitesse du vent : ${weather.windSpeed} m/s")
    } else {
        println("Désolé, impossible de récupérer les informations pour la ville $city.")
    }
}
