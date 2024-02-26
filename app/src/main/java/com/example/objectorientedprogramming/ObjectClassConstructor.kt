package com.example.objectorientedprogramming

fun main(args: Array<String>) {

    //creating an object from class
    /*var myCar = Cars() //Creating object

    //Using object we can use class properties
    myCar.name = "Ferrari"
    myCar.model = 2023

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2024

    println("My car's name is ${myCar.name} and it's model is ${myCar.model}")
    println("My car's name is ${myCar2.name} and it's model is ${myCar2.model}")
    */

    //Using Primary Constructor
    //var myNewCar = MyCars("Mercedes",2024)
    //println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

    //Using Secondary Constructor
    var mySecondCar = MySecondCars("Mercedes",2000)

    mySecondCar.name = "Opel"
//    mySecondCar.model = 2010 //set

//    println("My car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}") //get
}