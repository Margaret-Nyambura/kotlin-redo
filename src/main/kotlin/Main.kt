fun main(){
    school("AkiraChix")
    school("Manyatta")
    sentence("Margaret", 28)

    add("1",2)


    var fruit = word("Banana")
    println(fruit)

    var word = sentence("happy cows")
    println(word.length)

    var maths = books("topic")
    println(maths)

    myName("Margaret")
    myName("Nyambura")

}
fun school(name:String){
    println(name[0].toString() + name[2].toString() + name[3].toString())

    println(name[0])
    println(name[2])
    println(name[3])


}
fun sentence(x:String, y:Int) :String{
    var greeting = "Hi my name is $x and I am $y years old"
    println(greeting)
    return greeting
}
fun add(a: String, b:Int){
    var sum = a + b
    println(sum)
}
fun word(name:String) :Int{
    var fruit = name.length
    return fruit
}

fun sentence(word:String) :String{
    return word
}

fun books(title:String) :Int{
    var maths = title.length
    return maths
}

fun myName(name:String){
    if(name == "Margaret")
        println("That's me")
    else {
        println("I don't know who that is")
    }

}