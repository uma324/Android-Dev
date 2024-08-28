//Functions based on types of arguments
//default Arguments
/*fun sum(a:Int=10,b:Int=20) {
    val c = a + b
    println(c)
}
fun main(){
    sum(20,50)
    sum()
}*/

//without default arguments
/*fun sum(a:Int, b:Int)
{
    val c=a+b
    println(c)
}
fun main() {
    sum(20,50)

}*/
// it is optional for a kotlin function to return value
/*fun main(args: Array<String>){
    val a = 10;
    val b = 20;
    val result = sum(a,b)
    println(result)
}
fun sum(a:Int, b:Int):Int{
    val x = a + b
    return x
}*/
// que: create a function to convert temperature from celsius to fahrenhiet' and vice versa
/*fun temp(cel:Int){
    val result = ((9*cel)/5)+32
    println(result)
}
fun temp1(far:Int){
    val result = ((9*far)/5)+32
    println(result)
}
fun main(){
    temp(-40)
    temp1(-40)
}*/

// recursive functions ---  that calls itself inorder to solve a problem , where function call  itself
/*fun factorial(n: Int): Int {
    return if(n <= 1) 1 else n * factorial(n-1)
}
fun main()
{
    println("enter the number to find factorial")
    var y:Int = readln().toInt()
    var x=factorial(y)
    print(x)
}*/
// factorial, fibanacco and temperature with recursive function
//class in kotlin --- is a blueprint for creating objects,classes are declared using keyword class, kotlin class has a class header which specifies its type parameters,constructor.
/*class Student
{
    fun result()
    {
        println("Pending")
    }
}
fun main()
{
    var s1 = Student()
    s1.result()
}*/




