package com.example.myapplication

class Calculator{
    fun cal(){

        var addOperation = AddOperation()
        var subOperation = SubtractOperation()
        var mulOperation = MultiplyOperation()
        var divOperation = DivideOperation()

        var num1 : Double =0.0
        var num2 : Double = 0.0
        var operator : String = ""
        var isEnd:Boolean = false //종료 여부 판단하는 변수

        while (!isEnd) { // isEnd가 False이면 무한반복

            while(true){
                try{
                    println("숫자를 입력해주세요")
                    num1 = readLine()!!.toDouble()
                    num2 = readLine()!!.toDouble()
                    break
                } catch (e: NumberFormatException){
                    println("잘못입력하였습니다")
                }

            }
            var result: Double = 0.0

            while (true) {
                println("연산자를 입력해주세요 (+, -, /, *, %). 종료를 원하시면 '종료'를 입력하세요")
                operator = readLine()!!.toString()

                if (operator in listOf("+", "-", "*", "/", "%", "종료")) {
                    break
                } else {
                    println("잘못 입력하였습니다. 다시 입력해 주세요.")
                }
            }

            when (operator) {
                "+" -> result = addOperation.operate(num1 = num1, num2 = num2)
                "-" -> result = subOperation.operate(num1 = num1, num2 = num2)
                "*" -> result = mulOperation.operate(num1 = num1, num2 = num2)
                "/" -> result = divOperation.operate(num1 = num1, num2 = num2)
                "%" -> result = num1 % num2
                "종료" ->  isEnd = true // isEnd를 True로 만들어서 루프종료
            }

            if (operator == "종료"){
                println("종료되었습니다.")
            } else{
                println("결과값은 ${result}입니다")
            }
        }

    }
}