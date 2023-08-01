package com.example.test

class Teavana(private val cart: MutableList<Drink>) {

    private val menu = mapOf(
        "제주 유기농 말차로 만든 라뗴" to Drink("제주 유기농 말차로 만든 라뗴", 6100, "제주도 유기농 라떼"),
        "유자 민트 티" to Drink("유자 민트 티", 5900, "유자 민트 티"),
        "라임 패션 티" to Drink("라임 패션 티", 5900, "라임 패션 티")
    )
    var menuNum:Int = 0
    var catch = TryCatchInt(menuNum)

    fun teavanaMenu() {
        while (true) {
            println("==== 티바나 메뉴 ====")
            for ((index, teavana) in menu.entries.withIndex()) {
                println("${index + 1}. ${teavana.key} - ${teavana.value.price}원 | ${teavana.value.drinkInfo}")
            }
            println("4. 뒤로가기")

            menuNum = catch.catch()

            when (menuNum) {
                in 1..3 -> {
                    val choice = menu.entries.elementAt(menuNum - 1)
                    val teavana = choice.value
                    cart.add(teavana)
                    println("${teavana.name}가 장바구니에 담겼습니다.")
                }
                4 -> break
            }
        }
    }
}