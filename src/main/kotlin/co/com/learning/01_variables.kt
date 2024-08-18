package co.com.learning.co.com.learning


fun main() {
    println("Variables In Kotlin\n")

    var myFirstVariable: String = "The general message - Hello From Kotlin"
    println(myFirstVariable)

    println("Change the value of the variable")
    myFirstVariable = "The new value is 'Hi Everybody!'"
    println(myFirstVariable)

    val birthCity = "Pereira"
    println("My hometown is: $birthCity")

    /**
     * Basic Types
     */
    val age: Int = 31
    val transferAmount: Long = 23990290391L
    println("\nAge: $age - Type: ${age::class.java.typeName}")
    println("Transfer Amount: $transferAmount - Type: ${transferAmount::class.java.typeName}")

    val height : Float = 1.76F
    val debtTotal: Double = 19555634489563.69
    println("\nHeight: $height - Type: ${height::class.java.typeName}")
    println("Total Debt: $debtTotal - Type: ${debtTotal::class.java.typeName}")

    val isAuthenticated: Boolean = true
    val female: Char = 'F'
    val male: Char = 'M'
    println("\nIs Authenticated: $isAuthenticated - Type: ${isAuthenticated::class.java.typeName}")
    println("Genders: Female - $female, Male - $male - Type: ${female::class.java.typeName}")

}