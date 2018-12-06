package com.git.lakmalz.udacityclassroom.Lession4

class Spice(val name: String, val spiciness: String = "mild") {
    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild")
    )

    fun makeFilter() {
        println(spices.filter { it.heat < 5 })
    }

    fun makeSalt() = Spice("Spice")
    
}