fun main() {
myDetails("Glenah",30,"Kenya")

    println(addition(465,335,45,344))

    println(averageNumbers(56,876,96,75,76))

    var fullName="Glenah"
    println(fullName)
    var age=30
    println(age)
    var phoneNumber="0746807381"
    var email="glenahkwamboka@gmail.com"
    println(email)
    var weight=84.43
    println(weight)
    var Ugandan=false
    println(Ugandan)


}
//Create and invoke a function that takes in a users name, age,
// and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya” (2 points)
fun myDetails(name:String,age:Int,nationality:String){
    println("My name is $name,I am $age years old I am from $nationality")
}
// Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int {
    var sum = num1 + num2 + num3 + num4
    return sum
}

//Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun averageNumbers(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int):Int{
    var numbers=(num1+num2+num3+num4+num5)/2
    return numbers

}
//You are creating an app to capture a person’s records. Some of the data you will
    //capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)