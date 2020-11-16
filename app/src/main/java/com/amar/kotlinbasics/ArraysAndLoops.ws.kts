package com.amar.kotlinbasics

fun main() {
//    val myList = mutableListOf("tuna", "salmon", "shark")
    // myList = mutableListOf("Koi", "goldfish")
    // error: val cannot be reassigned

    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList.remove("shark"))

    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants)

    // creating an array
    val school = arrayOf("tuna", "salmon", "shark")

    // typed array
    val numbers = intArrayOf(1, 2, 3)
    // We cannot use mix types in TypedArray
    // eg println(Arrays.toString(intArrayOf(2, "foo)))
    // error: type mismatch: inferred type is String but Int was expected

    // we can mix types in unTypedArray
    val mix = arrayOf("Fish", 2)
    println(mix.contentToString())

    nestingArrays()

    initializingArrayswtihDynamicCode()

    practiceExercise()


}

fun nestingArrays() {
    var fish = 12
    var plants = 5

    val swarm = listOf(fish, plants)

    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
    println(bigSwarm.contentToString())

    // using elements of an array
    for (element in swarm) println("Element: $element")

    // with index for loop
    for ((index, element) in swarm.withIndex()) {
        println("Fish at $index is $element")
    }

    //ranges in alphabet
    for (i in 'b'..'g') print(i)
    println()

    // ranges i  integer
    for (i in 1..5) print(i)
    println()

    // range to go downwards
    for (i in 5 downTo 1) print(i)
    println()

    // range to advance in steps
    for (i in 3..6 step 2) print(i)
    println()
}

fun initializingArrayswtihDynamicCode() {
    val array = Array(5) { it * 2 }
    println(array.asList())

}

fun practiceExercise() {
    val numbers = intArrayOf(11, 12, 13, 14, 15)
    val strings = mutableListOf<String>()
    for(number in numbers) strings.add(number.toString())
    println("Result: $strings")

    // number divisible by 7 form numbers between 0 and 100
    val divisibleNumbers = mutableListOf<Int>()
    for (i in 0..100){
        if (i.rem(7) == 0){
            divisibleNumbers.add(i)
        }
    }
    println(divisibleNumbers)
}


main()