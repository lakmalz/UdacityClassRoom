package com.git.lakmalz.udacityclassroom.Lession3
/**
 * I think they can explain it better than I can but I will try. In conventional programming when you loop through a collection you might do:
 *for (element in collection) { println(element) }

 *When using Kotlin functional features you can do something like:
 *collection.map { println(it) }

 *Which is equivalent to the code above
 */
var dirty = 20
val waterFilter: (Int) -> Int = { value -> value / 2 } // this is lambda anonymous function

fun main(args: Array<String>) {
    val swim = { println("Swim") }
    swim()

    //    val waterFilter = {value:Int -> value/2} // this is lambda anonymous function


    println(waterFilter(dirty))
    println("Feed fish - ${feedFish(30)}")
}

fun feedFish(dirty:Int) = dirty + 10

/**
 * This has second param is a function type
 */
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    val va = updateDirty(
        dirty,
        waterFilter
    )
    val vq = updateDirty(
        dirty,
        ::feedFish
    )
    val vf = updateDirty(
        dirty,
        { dirty -> dirty + 50 })
}


