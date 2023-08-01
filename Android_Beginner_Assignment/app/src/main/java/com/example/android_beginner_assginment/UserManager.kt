package com.example.android_beginner_assginment

object UserManager {

    var userList:ArrayList<User> = ArrayList()

    init {
        userList.add(User("test","test","테스트중"))
    }
}