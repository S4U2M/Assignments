package com.example.kiosk

class LogIn() {

    // 로그인 메소드...
    fun logIn(memberList: ArrayList<Member>): Member? {

        while (true) {

            print("| ID : ");
            val id = readLine()!!; println();
            print("| PW : ");
            val passwd = readLine()!!; println();

            val memberInfo = memberList.find { it.ID == id && it.password == passwd }

            return if (memberInfo != null) {
                println("로그인에 성공하였습니다.")
                memberInfo
            } else {
                println("로그인에 실패하였습니다. ID와 비밀번호를 다시 확인해주세요")
                null
            }
        }
    }
}