import java.security.KeyStore.TrustedCertificateEntry

//Q1)Design a Kotlin Program for a store to determine eligibility for a special offer based on the total amount and membership status.
//1.Create a kotlin program that simulates a discount system for a store
//2.Define two variables -- A variable representing the total amount of purchase,A variable indicating whether the customer has a membership
//3.Implement the following logic: If the total amount of the purchases is either 1000 or move then:

/*fun checkDiscount(amt:Int,isperson:Boolean){
    if(amt>1000 && isperson==true){
        println("eligible for 20% discount")
    }
    else if(amt>1000 && isperson==false){
        println("eligible for 10% discount")
    }
    else{
        println("not eligible for discount")
    }
}
fun main()
{
    var amt:Int = 2033
    var isperson:Boolean = true
    checkDiscount(amt, isperson)
}*/

//Q2) Write a kotlin program that simulates a simple banking
/*fun main(){
    val bal = 1000
    var withdraw: Int
    var const: String
    do{
        println("Your current balance is: $bal")
        println("Enter amount to withdraw: ")
        withdraw = readline()?.toInt()?:0
        if(withdraw <= bal){
            bal -= withdraw
            println("Withdrawal successful! New balance: $bal")
        }
        else {
            println("Insufficient balance!")
        }
        println("Do you want to make another withdrawl? (yes/no):")
        cont = readLine()?: "no"
    }
}*/

/*open class Rectangle(val a:Double, val b:Double){
    fun area():Double{return a*b}
    open fun display(){println("Area of the rectangle with dimension $a and $b is${area()}")}
}
class Square(side:Double:Rectangle(side,side)){
    override fun display(){println("Area of Square with $side and $side is ${area()}")}
}
fun main(){
    val myRectangle = Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}*/
