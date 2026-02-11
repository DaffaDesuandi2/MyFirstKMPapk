package com.example.myfirstapp

interface Platform {
    val name: String
}


expect fun getPlatformName(): String

fun greet(): String {
    return "Hello from \${getPlatformName()}!"
}