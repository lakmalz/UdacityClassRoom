package com.git.lakmalz.udacityclassroom.Lession4

fun main(args: Array<String>) {
    buildAquarium()
    //-----Challenge----------------
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name}  ${simpleSpice.heat}")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val aquarium = Aquarium(9)
    println("Small Aquarium 2: ${aquarium.volume} liters with" +
            "lenth ${aquarium.length} " +
            "width ${aquarium.width} " +
            "height ${aquarium.height} ")
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println(
        "Length: ${myAquarium.length} " +
                "Width: ${myAquarium.width} " +
                "Height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

}