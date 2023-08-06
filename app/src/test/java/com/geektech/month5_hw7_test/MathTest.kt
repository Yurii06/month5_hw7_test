package com.geektech.month5_hw7_test

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("5",math?.add("2","3"))
    }

    @Test
    fun doubleAdd(){
        assertEquals("5",math?.add("2.0","3"))
    }

    @Test
    fun doubleHardAdd(){
        assertEquals("5.2",math?.add("2.2","3"))
    }

    @Test
    fun doubleDotAdd(){
        assertEquals("Вы ввели две точки!",math?.add("2..2","3"))
    }

    @Test
    fun doubleSymbolAdd(){
        assertEquals("Некорректный ввод!",math?.add("2asdgg3","3"))
    }

    @Test
    fun doubleEmptyAdd(){
        assertEquals("Вы не заполнили поля!",math?.add("","3"))
    }

    @Test
    fun doubleSpaceAdd(){
        assertEquals("37",math?.add("2 ","3 5"))
    }


    @Test
    fun simpleDivide(){
        assertEquals("4",math?.divide("8","2"))
    }


    @Test
    fun zeroDived(){
        assertEquals("На ноль делить нельзя!",math?.divide("8","0"))
    }

    @After
    fun detach(){
        math = null
    }
}