package com.git.lakmalz.udacityclassroom.Lession4

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 9){
        println("running secondary constructor")
    }

    /**
     * if we want to set logic to property we can use init block , its like a constructor or block
     */
    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded *2
        }
    }

    init {
        println("constructor fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }

    fun makeDefaultFish() = Fish(true, 34)

    fun fishExample() {
        val fish = Fish(true, 20)
        println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
    }

}