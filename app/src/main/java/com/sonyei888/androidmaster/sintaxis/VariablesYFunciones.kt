package com.sonyei888.androidmaster.sintaxis

val age:Int = 22
var age2:Int = 22

fun main(){

}

fun showMyname(name:String){
    println("Me llamo S$name")
}
fun showMyage(currentAge:Int){
    println("tengo $currentAge años")
}
fun add(firstNumbre:Int, secondNumber:Int){
    println(firstNumbre + secondNumber)
}
fun subtract(firstNumbre:Int, secondNumber:Int):Int{
    return firstNumbre - secondNumber;
}
fun subtractCool(firstNumbre:Int, secondNumber:Int) = firstNumbre - secondNumber;
fun variablesAlfaNumericas(){
    //Valor alfanumericas

    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    val stringExample:String = "mundo"
}
fun variablesBoolean(){
    //Valor booleanas

    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false

    //funciones aritmeticas

    println(age + age2)

    println("Modulo")
    println(age % age2)

}
fun variablesNumericas(){
//Valor numericas

    val example:Long = 22

    val floatExample:Float = 22.5f

    val doubleExample:Double = 2241.212345
}
