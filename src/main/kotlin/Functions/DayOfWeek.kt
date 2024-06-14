package kotlin.Functions

import java.util.*

fun main(){
    dayOfTheWeek();
}

fun dayOfTheWeek(){
    println("What Day is today?")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) )
}