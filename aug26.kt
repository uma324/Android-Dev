/* Control flow --- kotlin flow control statements
IF-ELSE
simple if statement
fun main() {
    var temperature = 25
    if (temperature > 20) {
        println("it's a warm day.")
    }
}
*/

/* IF-else statement
fun main() {
    var temperature = 25
    if (temperature > 20) {
        println("it's a warm day.")
    } else
        println("good weather")
}
*/

/*fun main() {
    var num = 30
    if(num >= 20) {
        println("A")
    }
    else if (num >= 70){
        println("B")
    }
    else if (num <= 50){
        println("C")
    }
    else{
        println("D")
    }
}*/

/* Calculator with all arithmetic operations

fun main() {
    val num1 = 3
    val num2 = 4
    val operator = "*"
    if (operator == "+"){
        println("Result: $(num1 + num2)")
    }
    else if (operator == "-"){
        println("Result: $(num1 - num2)")
    }
    else if (operator == "/"){
        println("Result: $(num1 / num2)")

    }
    else if (operator == "%"){
        println("Result: $(num1 % num2)")

    }
    else if (operator == "/")
        if(num2 != 0){
            println("Result: $(num1 / num2)")
        }else {
            println("Error: division by zero ")
        } else {
            println("Error: Unsupported operator")
    }

}*/

/*ge Classification
fun main() {
    val age = 15
    if(age < 13) {
        println("you are a child")
    }
    else if(age in 13..19){
        println("you are a teenager")
    }
    else if(age in 20..64) {
        println("you are an adult")
    }
    else {
        println("You are a senior")
    }
}*/


/* When expression is used 'when' returns a value that can be assigned to a variable or used directly in expressions
fun main(){
val dayOfWeek = 4
val dayName = when(dayOfWeek) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Invalid Day"
}
    println("The 3rd day of the week is $dayName")
}*/

/*fun main()
{
    val number = 8
    when {
        number % 2 == 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
        else -> println("Unexpected number")
    }
}*/

