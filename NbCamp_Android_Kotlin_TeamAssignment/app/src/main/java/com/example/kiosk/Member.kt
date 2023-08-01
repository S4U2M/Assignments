package com.example.kiosk

class Member(val name:String, val ID:String, val password:String, var balance:Double) {
    var order:Order = Order(Cart());
}