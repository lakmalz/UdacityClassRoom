package com.git.lakmalz.udacityclassroom.Lession3

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val list = spices.filter { it.contains("curry") }.sortedBy { it.length }
    val list1 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    val list2 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    val list3 = spices.take(3).filter { it.startsWith('c') }
    println(list)
    println(list1)
    println(list2)
    println(list3)

}