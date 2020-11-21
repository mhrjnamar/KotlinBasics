package com.amar.kotlinbasics

import java.util.*

fun main() {
    var fortune: String
    for (i in 1..10){
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Today is easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )



    // using elvis operator to handle null case
//    val birthday = readLine()?.toIntOrNull() ?: 1
    val age = getAge()
    println("Enter your birthday: $age")

    val index = when (age){
        in 1..7 -> 4
        28,31 -> 2
        else -> age.rem(fortunes.size)
    }

    return fortunes[index]

}

fun getAge(): Int{
    return Random().nextInt(100)
}

main()