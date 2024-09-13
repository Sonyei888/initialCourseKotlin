package com.sonyei888.androidmaster.sintaxis

fun main(){
    var name:String = "Sonyei888"
    //Indice 0 - 6
    //Tamaño 7

    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    if(weekDays.size < 8){
        println(weekDays[5])
    }else {
        println("Mi pana, son 7 dias de la semana")
    }


    //Bucles para arrays

    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

}
