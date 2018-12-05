package com.git.lakmalz.udacityclassroom.Lession2

import java.util.*

fun main(args: Array<String>) {
    println("This values pass from tool arguvements setting ${args[0]}")
    dayOfWeek()
    sayGreetings(args[1])
    feedTheFish()
    println("\nYour fortune is: ${getFortuneCookie()}")
    /*var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }*/
    println(whatShouldIDoToday("happy"))
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped."
        }
    )

}

fun sayGreetings(time: String) {
    println(if (time < 12.toString()) "Good morning Kotlin" else "Good night Kotlin.")
}

fun feedTheFish() {
    val day = randomDay()
    val food = "Pallets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("\nEnter your birthday:")
    val birthday = readLine()?.toIntOrNull()?:1
    print("${birthday.rem(fortunes.size)}")
    return fortunes[birthday.rem(fortunes.size)]
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) :String{
    return when{
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "Stay home and read"
    }
}