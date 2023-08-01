package com.example.freeassignment

fun main(){
    var isEnd : Boolean = false
    var menuNum : Int = 0
    val hotelResrvation = HotelReservation()


    while(!isEnd){
        println("[메뉴]")
            println("1. 방 예약, 2. 예약목록 출력, 3. 예약목록 (정령) 출력 4. 시스템 종료, 5. 금액 입금-출금 내역 목록 출력 6. 예약 변경/취소")
        while (true){
            try {
                menuNum = readLine()!!.toInt()
                break
            } catch (e: NumberFormatException){
                println("잘못 입력하셨습니다. 숫자를 입력해주세요")
            }
        }
        when(menuNum){
            1 ->{
                hotelResrvation.reservation()
            }
            2 -> isEnd = true
            3 -> isEnd = true
            4 -> isEnd = true
            5 -> isEnd = true
            6 -> isEnd = true
        }
    }

}

