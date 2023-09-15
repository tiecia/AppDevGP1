package com.example.groupactivity1

class Card {
    var value : Char = 'a'
    var revealed : Boolean = false

    constructor(initValue : Char) {
        value = initValue
    }

    fun printValue() {
        println(if(revealed) value else "-")
    }
}