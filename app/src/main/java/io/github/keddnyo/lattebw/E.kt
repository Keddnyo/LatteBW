package io.github.keddnyo.lattebw

import android.app.Activity
import android.os.Bundle

class E : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when (android.os.Build.BOARD) {
            "latte" -> {
                val f = "bootx64.efi"
                val m = "/mnt/EFI"
                val p = "/EFI/BOOT/"
                e("mount -o remount,rw /")
                e("mkdir $m")
                e("mount -t vfat /dev/bl*/*name/*er $m")
                e("mv $m$p$f $m$p$f.miui")
                e("mv $m$p$f.win $m$p$f")
                e("reboot")
            }
        }
        finish()
    }
    private fun e(c: String) {
        try {
            Runtime.getRuntime().exec(arrayOf("su", "-c", c)).waitFor()
        } catch (e: Exception) {
        }
    }
}