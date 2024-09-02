package co.com.learning.co.com.learning

fun main() {
    println("Collections In Kotlin\n")

    /**
     * Lists
     */
    println("List\n")
    val fruits = listOf("apple", "banana", "kiwi", "strawberries")
    println("List of fruits: $fruits")

    val colombianDishes : MutableList<String> = mutableListOf("Bandeja Paisa", "Arroz atollado", "Changua")
    println("List of Traditional Colombian Dishes: $colombianDishes")

    // Casting the list
    val colombianDishesLock = colombianDishes
    println("List of Traditional Colombian Dishes: $colombianDishesLock")

    // Using list extension functions
    println("\nFirst item: ${colombianDishes.first()}")
    println("Last item: ${colombianDishes.last()}")

    println("Second item: ${colombianDishes[1]}")
    println("Total list items: ${colombianDishes.count()}")

    // Validate if an item is in the collection
    val chicharronaDish = "Chicharronada"
    println("Is chicharronaDish in the collection: ${chicharronaDish in colombianDishes}")

    val colombianCities = mutableListOf("Pereira", "Armenia", "Medellin", "Cucuta")
    println("Cities of Colombia: $colombianCities")

    // add new city in the list
    colombianCities.add("Cali")
    println("List after adding an item to the list")
    println("Cities of Colombia: $colombianCities")

    // remove city in the list
    colombianCities.remove("Cucuta")
    println("List after removing an item to the list")
    println("Cities of Colombia: $colombianCities")


    /**
     * Sets
     */
    println("\n\n******* Sets **********")
    // Read only set
    val capitalCities = setOf("Paris", "Rome", "Berlin", "Amsterdam", "London", "Rome")

    // Mutable set
    val countries : MutableSet<String> = mutableSetOf("France", "Italy", "Germany", "Netherlands", "England", "Germany")

    println("Capital Cities: $capitalCities - Total elements: ${capitalCities.count()}")
    println("Countries: $countries - Total elements: ${countries.count()}")

    // Check that an item is in a set
    println("Is Berlin on the Set: ${"Berlin" in capitalCities}")
    println("Is England on the Set: ${"England" in countries}")

    // Add an item to the set
    println("Original set: $countries")
    countries.add("Colombia")
    println("New set: $countries")

    // Remove an item to the set
    countries.remove("Germany")
    println("New set: $countries")
}