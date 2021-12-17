package io.github.keddnyo.lattebw

import android.app.Activity
import android.os.Bundle

class Exec : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when {
            Device().check() -> {
                val file = "bootx64.efi"
                val mount = "/mnt/EFI"
                val path = "/EFI/BOOT/"

                exec("mount -o remount,rw /")
                exec("mkdir $mount")
                exec("mount -t vfat /dev/block/by-name/*loader $mount")
                exec("mv $mount$path$file $mount$path$file.miui")
                exec("mv $mount$path$file.win $mount$path$file")
                exec("reboot")
            }
        }
        finish()
    }

    private fun exec(command: String) {
        try {
            Runtime.getRuntime().exec(arrayOf("su", "-c", command)).waitFor()
        } catch (e: Exception) {
            // None
        }
    }
}