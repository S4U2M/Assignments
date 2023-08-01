package com.example.test

class MainMenu {

    var money: Int = 10000
    val cart = mutableListOf<Drink>()
    var menuSelect:Int = 0

    var isEnd : Boolean = true
    var coffeeMenu = CoffeeandEspreesso(cart)
    var frappuccinoMenu = FrappuccinoAndBlended(cart)
    var teavana = Teavana(cart)
    var oder = Order(money)
    var catch = TryCatchInt(menuSelect)


    fun mainmenu(){

        while(isEnd){
            println("StarBucks\n"+
                    "1. Coffee& Espresso\n" +
                    "2. Fraoouccino & BLended\n" +
                    "3. Teavana\n" +
                    "4. Oder\n" +
                    "5. End\n" +
                    "현재 잔액은 ${money}원입니다."
                    )

            menuSelect = catch.catch()

            when(menuSelect){
                1 -> coffeeMenu.coffeemenu()
                2 -> frappuccinoMenu.frappuccinoMenu()
                3 -> teavana.teavanaMenu()
                4 -> money = oder.showCart(cart)
                5 -> isEnd = false
            }
        }
    }
}