package com.example.freeassignment

import java.time.LocalDate
import java.time.format.DateTimeFormatter


class HotelReservation {
    fun reservation(): Array<*> { //*는 어떤 타입이 나와도 된다는 뜻.
        var name: String =""
        var roomNumber: Int = 0
        var checkInDate: String = ""
        var checkOutDate: String = ""

        val nowDay: LocalDate = LocalDate.now()
        val dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")

        while (true) {
            println("예약자분의 성함을 입력해주세요: ")
            name = readLine().toString()

            if (name != null && !name.any { it.isDigit() }) {
                break
            }

            println("이름에 숫자가 포함되어 있습니다. 다시 입력해주세요.")
        }

        println("예악자분의 방번호를 입력해주세요(방 번호는 100~999이내 입니다.")

            while (true){
            try {
                roomNumber = readLine()!!.toInt()
                if (roomNumber in 100 .. 999){
                    break
                } else{
                    println("잘못된 방번호입니다. 방번호는 100~999 이내입니다.")
                }
            } catch (e: NumberFormatException){
                println("잘못 입력하셨습니다. 숫자를 입력해주세요")
            }
        }

        println("체크인 날짜를 입력해주세요(표기형식 yyyyNNdd : 20230721) 현재 날짜 $nowDay")

        while (true){
            checkInDate = readLine().toString()
            val changeeDateForm = LocalDate.parse(checkInDate,dateFormatter)

            if (changeeDateForm.isBefore(nowDay)){ //LocalDate에서 기본적으로 적용되는 날짜 비교 방법
                println("체크인은 지난 날짜를 입력할 수 없습니다.\n다시 입력해주세요")
            }else{
                break
            }
        }

        println("체크아웃 날짜를 입력해주세요")
        while (true) {
            val checkOutDate = readLine().toString()
            if (checkInDate != checkOutDate && checkInDate < checkOutDate){
                break
            }else{
                println("체크아웃 날짜는 체크인 날짜와 동일하거나 이전 날짜로 지정할 수 없습니다.\n다시 입력해주세요.")
            }
        }
        val reservationMemberInfo = arrayOf(name, roomNumber, checkInDate, checkOutDate)


        return reservationMemberInfo
    }

}

