package com.amar.kotlinbasics

fun main() {
    println(1 + 1)
    println(53 - 3)
    println(50 / 5)
    println(1 / 2)
    println(1.0 / 2.0)
    println(6 * 50)

    val fish = 2
    fish.times(6)
    fish.div(10)
    fish.plus(3)
    fish.minus(3)

    // use primitive 'int' as an object
    1.toLong()

    // all the numerical types in kotlin have a super type called number

    // or, put int in a box
    val boxed: Number = 1
    boxed.toLong()

    // types of variables val and var
    // val cannot be changed after assigned whereas ver can be changed

    val aquarium = 1

    var fishes = 2
    fishes = 50

    // Once variable type is defined it cannot be changed
    // X fishes = "God Fish"

    // We cannot implement short value to long value
    /**
     * eg
     */
    val b: Byte = 1 //OK, literals are statically checked

    /**
     *val i : Int = b
     * error: type mismatch: inferred type is Byte but Int was expected
     */
    // Solution : by casting
    val i: Int = b.toInt()

    //Kotlin supports '_' in numbers
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("Million: $oneMillion")

    // Nullability
    /**
    When we explicitly assign null
    var rocks : Int = null
    error: null can not be a value of a non null tye Int
    use '?' operator to indicate that the variable can be null
     */
    var marbles: Int? = null

    //In complex Data types
    val lotsOfFish: List<String?> = listOf(null, null)
    var everMoreFish: List<String>? = null
    var definitelyFish: List<String?>? = null
    definitelyFish = listOf(null, null)

    // Fore Null ( generally bad idea to use)
    // goldFish!!.eat()
    // in programming term '!' is also called Bang
    // goldfish = null
    //  gold fish!!.eat()
    // kotlin.KotlinNullPointerException

    // check null using '?' operator
    var fishFoodTreats = 5
    // if fishFoodTreats is not null call dec function
    // if dec() is null return 0
    // ?; also called elvis operator
    println(fishFoodTreats?.dec() ?:0)

}

main()