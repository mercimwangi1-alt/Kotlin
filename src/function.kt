fun main() {
    //standard library function--machine define round,,sqrt
    var num = Math.sqrt(144.0)
    println(num)

Day()
student()
    stud(name="john",age=32, course = "web dev")//agurments
    parent()
}


    //user-defined functions--always outside the main function

fun Day(){
    println("Today is Wednesday")
}


fun student(){
    var name = "Jane"
    var age = 19
    var course="Software Engineer"
    println("my name is $name i'm $age years old pursuing $course")

}
//paraments
fun stud(name:String,age:Int,course:String){

    println("my name is $name i'm $age years old pursuing $course")

}
fun parent() {
    println("Enter your name:")

    val name = readln()

    println("Hello $name")
}
