package com.sonyei888.androidmaster.sintaxis

fun main(){
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(0, "Sonyei888")
    println(weekDays)

    if (weekDays.isEmpty()){
        //vacio
    }else {
        weekDays.forEach { println(it) }
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{ weekDay -> println(weekDay)}

}