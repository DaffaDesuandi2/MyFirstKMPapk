package com.example.myfirstapp

class Greeting {
    private val platform = getPlatformName()

    fun greet(): String {
        return "Hello, ${platform.length}!"
    }
}