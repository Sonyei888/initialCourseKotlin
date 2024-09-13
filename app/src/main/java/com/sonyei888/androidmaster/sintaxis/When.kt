package com.sonyei888.androidmaster.sintaxis

import java.time.Month

fun main(){

}
fun result(value: Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("Sonyei88")
    }
}

fun getSemester(month: Int){
    when(month){
        in 1..6 -> println("Primer semeste")
        in 7..12 -> println("Segundo semestre")
        else -> println("Mi pana no sabe cuantos meses tiene un el año?")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("Febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("Mi pana no sabe cuantos meses tiene un el año?")
    }
}

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> println("Primer trimestres")
        4, 5, 6 -> println("Segundo trimestres")
        7, 8, 9 -> println("Tercer trimestres")
        10, 11, 12 -> println("Cuarto trimestres")
        else -> println("Un año tiene 4 trimestres, inteligente")
    }
}