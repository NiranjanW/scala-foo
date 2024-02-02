package example
import sttp.client4.quick._
import sttp.client4.Response

object Weather {
    val latitude:Double = 40.7143
    val longitude:Double = -74.006
val response :Response[String] = quickRequest
    .get(uri"https://api.open-meteo.com/v1/forecast?latitude=$latitude&longitude=$longitude&hourly=temperature_2m")
    .send()
println(response.body)
    
}

