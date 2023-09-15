package com.example.groupactivity1

class Board {
    var size : Int = 0
    var data : ArrayList<Card> = ArrayList()
    var cheatMode : Boolean = false

    constructor(size : Int, cheat : Boolean) {
        for (i in 0..size) {
            data.add(Card((97..122).random().toChar()))
        }
        cheatMode = cheat
    }

    fun printBoard() {
        println("Current Board ${if(cheatMode) "(uncovered)" else ""}")
        for(e in data) {
            println(if(cheatMode) e.printValue() else "-")
        }
    }

}
