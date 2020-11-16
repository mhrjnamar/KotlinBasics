package com.amar.kotlinbasics

fun main(){
    // String
    println("Hello Fish")
    // String concatenation
    println("Hello"+"Fish")
    // String templates combining with values
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish+numberOfPlants} fish and plants")

    val fish = "fish"
    val plant = "plant"
    println(fish == plant)
    println(fish == fish)
    println(fish != plant)

    val numberOfFishes = 50
    val numberOfPlant = 23

    // conditions
    if (numberOfFishes > numberOfPlant) println("Good ratio!")
    else
        println("unhealthy ratio")

    // Ranges
    val fishes = 50
    if (fishes in 1..100) println(fishes)

    //When
    when (numberOfFishes) {
        0 -> println("Empty tank")
        50 -> println("Full tank")
        else -> println("Perfect!")
    }

    // Exercise
    val fishName = "Shark"
    when(fishName.length){
        0 -> println("No name")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")

    }


}

main()