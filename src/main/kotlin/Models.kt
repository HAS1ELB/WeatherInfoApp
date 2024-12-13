package main.kotlin

import kotlinx.serialization.Serializable

@Serializable
data class WeatherApiResponse(
    val main: Main,
    val weather: List<Weather>,
    val wind: Wind
)

@Serializable
data class Main(val temp: Float, val humidity: Int)

@Serializable
data class Weather(val description: String)

@Serializable
data class Wind(val speed: Float)

data class WeatherData(
    val temperature: Float,
    val condition: String,
    val humidity: Int,
    val windSpeed: Float
)
