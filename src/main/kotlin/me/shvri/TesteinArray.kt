package me.shvri

fun main() {
    val values = IntArray(5) //array de 5 vai de 0 a 4 com 5 posições

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // formas de iterar
    for (valor in values) {
        println(valor)
    }
    println("-------------------------")
    //expressão lambda
    values.forEach {
        println(it)
    }
    println("-------------------------")
    values.forEach { valor ->
        println(valor)
    }
    println("-------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-------------------------")
    values.sort() //ordeno por padrão do menor para o maior
    for (valor in values) {
        println(valor)
    }

}