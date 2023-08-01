package com.example.kiosk

class MemberManager {
    var memberList:ArrayList<Member> = ArrayList();

    init {
        memberList.add(Member("주찬영", "dannyjoo", "1234", 20.0))
        memberList.add(Member("test", "test", "test", 10.0))
    }
}