package com.example.kiosk;

class MainMenu {
    fun display() {
        println("STARBUCKS에 오신걸 환영합니다.")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ STARBUCKS MENU ]")
        println("0. 종료")
        println("1. COFFEE & ESPRESSO")
        println("2. FRAPPUCCINO & BLENDED")
        println("3. TEAVANA & COFFEE")
        println("4. COLD BREW & CHOCOLATE")

        println("\n[ ORDER MENU ]")
        println("5. Order ")
        println("6. Cancel \n")
        print(" > 선택 : ")
    }

    // 로그인 화면...
    fun selDisplay() : Int{
        var sel:Int
        while (true){
            try {
                println("|------------------------------|")
                println("| STARBUCKS에 오신걸 환영합니다.  |")
                println("|------------------------------|")
                println("| 1. 로그인       2. 회원가입     |");
                println("| 3. 키오스크 종료                |");
                print("| > 선택 : ");
                 sel = readLine()!!.toInt();
                break
            } catch (e: NumberFormatException){
                println("잘못 입력하였습니다.")
            }
        }
        return sel!!;
    }

    fun loginDisplay(){
        println("|------------------------------|")
        println("|            <로그인>           |")
        println("|------------------------------|")

    }

    fun signUpDisplay(){
        println("|------------------------------|")
        println("|          <회원 가입>          |")
        println("|------------------------------|")
    }
}
