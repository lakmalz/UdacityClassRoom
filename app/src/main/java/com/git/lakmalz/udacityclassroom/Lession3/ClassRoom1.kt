package com.git.lakmalz.udacityclassroom.Lession3

fun main(args: Array<String>) {
println(com.git.lakmalz.udacityclassroom.Lession2.whatShouldIDoToday("happy", "sunny"))
println(com.git.lakmalz.udacityclassroom.Lession2.whatShouldIDoToday("sad"))
println(com.git.lakmalz.udacityclassroom.Lession2.whatShouldIDoToday("How do you feel?"))
}

/**
 * first way
 **/
fun shouldChangeWater1(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

/**
 *second way
 */
fun shouldChangeWater2(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }
}

/**
 * Third way
 * The best practice
 */
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

//--Challenge-----------------------------------------

fun isVeryHot(temperature: Int) = temperature > 35

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(temperature: Int = 23, mood: String, weather: String = "sunny"): String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}
