package com.example.test

class Order(private var money:Int) {

    fun showCart(cart: MutableList<Drink>): Int {

        while (true) {
            var totalPrice = calculateTotalPrice(cart)

            println("장바구니에 담긴 커피 목록:")

            showcartlist(cart)

            println("총 가격: $totalPrice 원")
            println("현재 잔액 : $money")

            if (totalPrice >0){

            print("주문 확인이 끝나셨습니까?(y/n)\n" +
                    "삭제할 주문이 있다면 d를 입력해주세요. :")
            var orderCheck = readLine()!!.toString()

            when (orderCheck) {

                "y" -> { //oderCheck에 대한 when
                   println("계산하시겠습니까?(y/n)")
                    var oderCheckY = readLine()!!.toString()

                    when(oderCheckY){
                        "y" ->  //odercheckY에 대한 when
                        {
                            if (totalPrice > money){
                                println("잔액이 부족합니다.\n" +
                                        "주문을 삭제하시겠습니까?(y/n)")
                                var isOrderDel = readLine()!!.toString()

                                when(isOrderDel){
                                    "y" ->{
                                        deleteCartlist(cart)
                                    }
                                    "n" ->continue
                                    else -> println("잘못된 입력입니다. 'y' 또는 'n'을 입력해주세요.")
                                }

                            }else{
                                money = money - totalPrice
                                println("계산되었습니다.\n" +
                                        "계산된 값은 ${totalPrice}입니다.\n" +
                                        "남은 돈은 ${money}입니다.")
                                cart.clear() //list를 초기화해준다.
                                break
                            }
                        }

                        "n" -> continue //odercheckY에 대한 when

                        else -> println("잘못된 입력입니다. 'y' 또는 'n'을 입력해주세요.") //odercheckY에 대한 when
                    }
                }

                "n" -> continue //oderCheck에 대한 when

                "d" -> deleteCartlist(cart) //oderCheck에 대한 when

                else -> println("잘못된 입력입니다. 'y' 또는 'n'을 입력해주세요.\n" +
                        "삭제할 주문이 있다면 'd'를 입력해주세요")

            }
        }else{
            println("메뉴화면으로 돌아갑시겠습니까?(y/n)")
                var zeroCheck = readLine()!!.toString()

                when(zeroCheck){
                    "y" -> break
                    "n" -> continue
                    else ->println("잘못된 입력입니다. 'y' 또는 'n'을 입력해주세요.")
                }
            }
        }
        return money
    }
    private fun calculateTotalPrice(cart: MutableList<Drink>): Int {
        return cart.sumBy {it.price }
    }
    fun showcartlist(cart: MutableList<Drink>){
        for ((index,value ) in cart.withIndex()) {
            println("${index + 1}. ${value.name} - ${value.price}원")
        }
    }

    fun deleteCartlist(cart: MutableList<Drink>){
        while (true){
        if(cart.isNotEmpty())
        {
            showcartlist(cart)
            var totalPrice = calculateTotalPrice(cart)
            println("총 가격: $totalPrice 원")

            println("삭제할메뉴의 번호를 입력해주세요\n" +
                    "메뉴 지우기가 종료되었다면 '0'을 입력해주세요.")
            var delMenu:Int = 0
            val catch = TryCatchInt(delMenu)
            delMenu = catch.catch()

            if(delMenu in 1..cart.size){
                val deletedMenu = cart.removeAt(delMenu - 1)
                println("${deletedMenu.name}가 장바구니에서 삭제되었습니다.")
            }else if(delMenu == 0){
                break
            } else{
                println("잘못 입력하였습니다. 제대로된 번호를 입력해주세요")
            }

        }else{
            println("더이상 지울 수 있는 메뉴가 없습니다. 메뉴 지우기를 종료합니다.")
            break
        }

    }
    }
}