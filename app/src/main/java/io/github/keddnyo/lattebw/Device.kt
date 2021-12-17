package io.github.keddnyo.lattebw

class Device {
    fun check(): Boolean {
        return android.os.Build.BRAND == "Xiaomi" && android.os.Build.MODEL == "MI PAD 2" && android.os.Build.BOARD == "latte"
    }
}