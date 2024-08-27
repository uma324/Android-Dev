// for loop in kotlin is used to iterate over a range of values, collections or arrays
//control flow construct for repeating operations and working with sequences of data
// for loop iterates through anything that provides an iterator that contains a countable number of values
// syntax of ranges -- (item in start..end) {

// syntax of collections (eg: lists,arrays)

// for loop for ranges
/*Both ends of range inclusive
fun main() {
for(i in 1..5) {
println("Number: $i")
}
}*/

/*reverse loop
fun main(args: Array<String>)
{
    for(item in 5 downTo 1){
        println(item)
    }
}*/

//reverse with step size
/*fun main(args: Array<String>)
{
    for(item in 5 downTo 1 step 2)
    {
        println(item)
    }
}*/

// iterating over a list ,when only elements need to be accessed
/*fun main()
{
    val fruits = listOf("Apple", "Banana", "Cherry")
    for(fruit in fruits){
        println("Fruit: $fruit")
    }
}*/
// while loop----repeatedly executes a block of code as long as the specified condition is true
/*fun main()
{
    var i = 5
    while (i>0){
        println("value is :$i")
        i--
    }
}*/

// iterating over list
/*fun main(){
    val fruits = listOf("Apple", "Banana", "Cherry")
    for(fruit in fruits) {
        println("Fruit: $fruit")
    }
    for(index in fruits.indices){
        println("index:$index --> fruit =:${fruits[index]}")
    }
}*/
//do while loop executes a block of code once before checking the condition and then repeats the loop as long as the condition is true

/*fun main()
{
    var i = 5
    do{
        println("value is: $i")
        --i
    }
    while (i > 5)
}*/

 /*fun main(){
     var i = 1
     do{println(i);i++}while(i<6)
 }*/

// functions in kotlin
//functions are reusable blocks of code that perform a specific task. They help in reducing code duplication and improving readability and maintainability , functions are also known as methods or subroutines, functions can take input(parameters) and return output(return tyoe)
// built-in functions -- kotlin provides a number of built-in functions to provide basic functionality

// user defined functions
fun demo() {
    println("Hello,world!")
}
fun main(args: Array<String>)
{
    demo()
}






