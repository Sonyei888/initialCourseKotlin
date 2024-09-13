package com.sonyei888.androidmaster.sintaxis

fun main(){

}

fun ifMultiple(){
    var age = 22
    var parentPermission = false

    if (age >= 18 && !parentPermission){
        println("Disfruta la vida")
    }else {
        println("mira anime")
    }
}

fun ifInt(){
    var age = 21

    if(age >= 18){
        println("Puede ir donde las ....")
    }else {
        println("Mira anime")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = true
    if(soyFeliz){
        println("Mentiris")
    }
}

fun ifAnidado(){
    val animal = "loro"

    if(animal == "dog"){
        println("Es un perro")
    }else if(animal == "gato") {
        println("Es un michi")
    } else{
        println("Que bicho es ese")
    }
}

fun ifBasico(){
    val name = "sonyei"

    if(name != "pepe"){
        println("Mi pana name no es pepe")
    }else{
        println("Mi pana el sonyei888")
    }
}