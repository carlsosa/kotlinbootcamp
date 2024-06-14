package kotlinPackage.Functions

fun whatShouldIDoToday(mood: String, weather: String, temperature: Int ){
    val condition = when{
        mood=="Happy" && weather =="Sunny" -> "Sal a caminar"
        mood == "SAD" && temperature==10 -> "Hace frio, abrigate"
        mood == "Anger" && temperature > 25 -> "Hace mucho calor, quedate en cuarto con AC"
        else -> "Haz cualquier cosa"
    }
    println(condition)
}

