package com.example.groupactivity1

import java.util.*

fun main() {
    println("Please enter the size of the game board:")
    var boardSizeStr = readln()

    var boardSize = boardSizeStr.toInt()
    if(boardSize<= 1) {
        boardSize = 4
        println("Invalid number of tiles, board adjusted to $boardSize")
    } else if(boardSize % 2 != 0) {
        boardSize--
        println("Invalid number of tiles, board adjusted to $boardSize")
    }

    println("Enable cheat mode?")
    var cheatMode = readln().lowercase(Locale.ROOT) == "y"

    println("Enter max number of incorrect guesses:")
    var incorrectGuesses = readln().toInt()

    var board = Board(boardSize, cheatMode)

    var playing = true
    while(playing) {
        board.printBoard()
        println("Enter the number of cards to turn over: ")
        var move = readln().toInt()
    }

}
