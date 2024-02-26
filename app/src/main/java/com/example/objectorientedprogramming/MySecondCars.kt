package com.example.objectorientedprogramming

class MySecondCars {

    var name:String? = null
    private var model:Int? = null
        private set
                get

//    constructor()
    //Secondary Constructor
    constructor(name:String?, model:Int?)
    {
        this.name = name
        this.model = model
    }
}