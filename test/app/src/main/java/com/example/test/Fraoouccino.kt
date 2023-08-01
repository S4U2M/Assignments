package com.example.test

class FrappuccinoAndBlended(private val cart: MutableList<Drink>) {

    private val menu = mapOf(
        "자바칩 프라푸치노" to Drink("자바칩 프라푸치노", 6300, "자바칩 넣은 프라푸치노"),
        "더블 에스프레소 칩" to Drink("더블 에스프레소 프라푸치노", 6300, "에스프레소 넣은 프라푸치노"),
        "카라멜" to Drink("카라멜 프라푸치노", 5900, "카라멜 넣은 프라프치노")
    )
    var menuNum:Int = 0
    var catch = TryCatchInt(menuNum)

    fun frappuccinoMenu() {

        while (true) {
            println("==== 프라푸치노 메뉴 ====")
            for ((index,frappuccino) in menu.entries.withIndex()) {
                println("${index + 1}. ${frappuccino.key} - ${frappuccino.value.price}원 | ${frappuccino.value.drinkInfo}")
            }
            println("4. 뒤로가기")

            menuNum = catch.catch()

            when (menuNum) {
                in 1..3 -> {
                    val Choice = menu.entries.elementAt(menuNum - 1)
                    val Frappuccino = Choice.value
                    cart.add(Frappuccino)
                    println("${Frappuccino.name}가 장바구니에 담겼습니다.")
                }
                4 -> break
            }
        }
    }
}