package com.example.test


class CoffeeandEspreesso(private val cart: MutableList<Drink>) {

    private val menu = mapOf(
        "아메리카노" to Drink("아메리카노", 4500, "에스프레소에 물을 넣은 미국놈들 커피"),
        "카페라떼" to Drink("카페라떼", 5000, "에스프레소에 우유를 넣은 커피"),
        "카푸치노" to Drink("카푸치노", 5000, "에스프레소와 거품을 많이 낸 스팀 우유를 넣은 커피"),
        "에스프레소" to Drink("에스프레소", 4500, "순수한 에스프레소 커피"),
        "카페모카" to Drink("카페모카", 5500, "초코 시럽을 넣은 커피")
    )

    var menuNum:Int = 0
    var catch = TryCatchInt(menuNum)

    fun coffeemenu(): MutableList<Drink> {
        while (true){

        println("==== 커피 메뉴 ====")
        for ((index, coffee) in menu.entries.withIndex())
        {
            println("${index + 1}. ${coffee.key} - ${coffee.value.price}원 | ${coffee.value.drinkInfo}")
        }
            println("6. 뒤로가기")

            menuNum = catch.catch()


            when(menuNum){
            in 1..5 -> {
                val coffeeChoice = menu.entries.elementAt(menuNum - 1)
                val coffee = coffeeChoice.value
                cart.add(coffee) //코틀린에서 지원하는 list넣는 법
                println("${coffee.name}가 장바구니에 담겼습니다.")
            }

            6 ->{
                return cart
                break
            }
        }

        }
    }
}