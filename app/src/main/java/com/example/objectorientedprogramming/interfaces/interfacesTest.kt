package com.example.objectorientedprogramming.interfaces

import com.example.objectorientedprogramming.abstract.Vehicle

fun main(args: Array<String>) {

    var vehicles = Vehicles()

    println("Name: ${vehicles.name}")
    vehicles.go()
    vehicles.stop()
}