package com.git.lakmalz.udacityclassroom.Lession4

/**
 * There are four visibility modifiers in
 * Kotlin: private, protected, internal(it'll be available in the same module only. mean a group of files that are compiled together) and public.
 * The default visibility, used if there is no explicit modifier, is public.
 */
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    /*var width: Int = 20
    var height: Int = 40

    // this is private property
    var length: Int = 100
    private set*/

    //internal(it'll be available in the same module only. mean a group of files that are compiled together)
    internal fun makeWidth() {

    }
    /*fun volume(): Int {
        return width * height * length / 1000
    }*/

    var water = volume * 0.9

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (tank * width)).toInt()
    }

}