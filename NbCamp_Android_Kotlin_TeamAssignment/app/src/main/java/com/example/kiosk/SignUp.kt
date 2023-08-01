package com.example.kiosk

class SignUp {

    // 회원 가입 메소드...
    fun signUp(memberList: ArrayList<Member>) {
        while (true) {
            print("| ID : ")
            val id = readLine()!!
            if (memberList.find { it.ID == id } != null) {
                println(" - 아이디 중복! 다시 입력!")
            } else {
                print("| PW : ")
                val passwd = readLine()!!
                print("| 이름 : ")
                val name = readLine()!!
                print("| 잔액 : ")
                val balance = readLine()!!.toDouble()

                memberList.add(Member(name, id, passwd, balance))
                break
            }
        }
    }
}