class DOg{
    var isMammal="true"
    var age= 2
    var color="brown"
    var breed ="German Shepherd"
    fun bark(){
        println("Woof! Woof!")
        println("Woof! Woof!")
    }
    fun wail(){
        println("swift, swift")
    }
}

fun main() {
    var dog = DOg()
    println("$dog")
}