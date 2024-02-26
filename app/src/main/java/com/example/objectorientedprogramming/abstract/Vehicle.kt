package com.example.objectorientedprogramming.abstract

abstract class Vehicle {

    //abstract function
    abstract fun vehicleName(name:String) : String

    //no-abstract function
    fun vehicleType(type:String) : String
    {
        return type
    }

    //abstract property
    abstract var model:Int

    //non-abstract
    var speed:Int? = null

}