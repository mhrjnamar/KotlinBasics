package com.amar.kotlinbasics

import java.util.*

fun main() {
    printHello()
    dayOfWeek()

    val isUnit = println("This is an expression")
    println(isUnit)

    val temprature = 10
    val isHot = if (temprature > 50) true else false
    println(isHot)

    // String template
    val message = "You are ${if (temprature > 50) "fried" else "safe"} fish"
    println(message)

    feedTheFish()

    // Ways to call functions start
    // using default value
    swim(100)
    // passing other value
    swim(50, speed = "slow")
    // Ways to call functions end
}

main()


fun printHello() {
    println("hello World")
}

// best practice is to put arguments without default values to first
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return true
}

// Assigning default value
fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        else -> "Saturday"
    }
    println(day)
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    // Ways to call functions start
    // using default value
    swim(100)
    // passing other value
    swim(50, speed = "slow")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    // Ways to call functions end

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun randomDay(): String {
    val week =
        listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    // get random no 0-6. 7 is bound and excluded.
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
//        "Tuesday" ->"pellets"
        "Wednesday" -> "redWorms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
//        "Saturday" ->"lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

