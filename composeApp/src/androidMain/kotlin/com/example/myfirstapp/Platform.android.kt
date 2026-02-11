package com.example.myfirstapp

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatformName(): String {
    return "Android ${Build.VERSION.SDK_INT}"
}
