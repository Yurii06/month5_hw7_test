package com.geektech.month5_hw7_test

class Math {

    fun add(a: String, b: String): String {

        if (a.contains("..") or b.contains("..")) {
            return "Введите цифры , а не символы"
        }
        if (a == "" || b == "") {
            return "Заполните все поля"
        }

        return try {
            if (a.contains(".") or b.contains(".")) {
                var result = (a.replace(" ","").toDouble() + b.replace(" ","").toDouble()).toString()
                if (result.toDouble() % 1 > 0.0) {
                    result
                } else {
                    result.replace(".0", "")
                }
            } else {
                (a.replace(" ","").toInt() + b.replace(" ","").toInt()).toString()
            }
        } catch (ex: Exception) {
            "Некорректный ввод!"
        }
    }

    fun divide(a: String, b: String): String {
        return if (b == "0") {
            "Школьные правила , на ноль не делят!"
        } else {
            (a.toInt() / b.toInt()).toString()
        }
    }
}