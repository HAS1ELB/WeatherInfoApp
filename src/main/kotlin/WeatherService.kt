package main.kotlin

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class WeatherService {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getWeather(city: String): WeatherData? {
        val apiKey = "8968762c3d93088358757de96530e8dd" // Remplacez par votre clé API OpenWeatherMap
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$city&units=metric&appid=$apiKey"

        return try {
            val response: WeatherApiResponse = client.get(url).body()
            WeatherData(
                temperature = response.main.temp,
                condition = response.weather.firstOrNull()?.description.orEmpty(),
                humidity = response.main.humidity,
                windSpeed = response.wind.speed
            )
        } catch (e: Exception) {
            println("Erreur : ${e.message}")
            null
        }
    }
}
