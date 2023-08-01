package com.example.test

class TryCatchInt(private var menuNum:Int) {

    fun catch(): Int {
        while (true){
            try {
                print("메뉴를 골라주세요(메뉴 번호로 입력) :")
                menuNum = readLine()!!.toInt()
                // Int는 정수 이외에 코드가 들어갔을 때 오류가 난다.
                // 즉 readLine에서 문자형태가 입력되면 오류가난다. e:NumberFormatException
                return menuNum
                break

            }catch (e:NumberFormatException){
                println("잘못 입력하셨습니다. 숫자 번호를 입력해주세요")
            }
        }
    }
}