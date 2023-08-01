package com.example.android_beginner_assginment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat

class SignupActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

    }

    fun signupfinish(view: View) {

        val id = findViewById<EditText>(R.id.id_create)
        val psw = findViewById<EditText>(R.id.psw_create)
        val name = findViewById<EditText>(R.id.name_create)

        val inputId = id.text.toString()
        val inputpsw = psw.text.toString()
        val inputname = name.text.toString()

        if (inputId.isEmpty() || inputpsw.isEmpty() || inputname.isEmpty()) {

            Toast.makeText(this, "공백을 채워주세요", Toast.LENGTH_SHORT).show()
            Changingcolors(id = id, inputId = inputId, psw = psw, inputpsw = inputpsw, name = name, inputname = inputname)

        } else {

            if (UserManager.userList.find { it.id == inputId } == null) {

                UserManager.userList.add(User(inputId, inputpsw, inputname))
                finish()

            } else {

                changingcolor2(id=id,psw=psw,name=name)
                Toast.makeText(this, "중복된 아이디는 생성할 수 없습니다.\n 다시 입력해주세요", Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }

    fun Changingcolors(inputId:String,id:View,inputpsw:String,psw:View,inputname:String,name:View){

        if (inputId.isEmpty()) {
            id.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
        } else {
            id.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white))
        }

        if (inputpsw.isEmpty()) {
            psw.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
        } else {
            psw.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white))
        }

        if (inputname.isEmpty()) {
            name.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
        } else {
            name.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white))
        }
    }

    fun changingcolor2(id: View,psw: View,name: View){
        id.setBackgroundColor(
            ContextCompat.getColor(
                this,
                android.R.color.holo_red_light
            )
        )
        psw.setBackgroundColor(
            ContextCompat.getColor(
                this,
                android.R.color.white
            )
        )
        name.setBackgroundColor(
            ContextCompat.getColor(
                this,
                android.R.color.white
            )
        )
    }

}


