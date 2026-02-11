package com.example.myfirstapp

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatformName(): String {
    return "Desktop JVM"
}
