package kotlinPackage.Functions

fun getFortuneCookie() : String{
    var l = listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.");
    print("Enter Your Birthday")
    var birthday = getBirthday();
    var div : Int = birthday?.div(l.size)!!;
    var message  = ("Your Fortune is:  ${l[div]}");
    return message;
}
fun Hour(arg: Int){
    println("What day is today?")
    if(arg <= 12){
        println("Good Morning Kotlin")
    }else{
        println("Good Night Kotlin")
    }

}
fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
fun main(args: Array<String>) {
    println("\n Tu fortuna es: ${getFortuneCookie()}")

}

