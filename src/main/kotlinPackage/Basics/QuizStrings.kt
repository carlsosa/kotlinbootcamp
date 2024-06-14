package kotlinPackage.Basics

fun welcomeMessage() {
    var welcomeMessage = "Hello and welcome to Kotlin"
     when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
}

fun loops(){
    var list3 : MutableList<String> = mutableListOf()
    for (i in 0..100 step 7){
        list3.add(i.toString())
    }
    print(list3)
}