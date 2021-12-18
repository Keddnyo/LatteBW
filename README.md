# LatteBW
 Quick boot to Windows on MiPad 2

 [Смотреть README на русском языке](https://github.com/Keddnyo/LatteBW/blob/main/README.ru-RU.md)
 
## Features:
* Small app size
* Quick reboot
* Root required

## First start preparing:
* Open terminal on your tablet
* Type these commands:
  * `su -c mount -o remount,rw /`
  * `su -c mkdir /mnt/EFI/`
  * `su -c mount -t vfat /dev/block/by-name/*loader /mnt/EFI`
* Download files from [Google Drive](https://drive.google.com/folderview?id=1XnILUU79kNeCrRPrIFhPgjMbYFc8V8oW)
* Place boot files to `/mnt/EFI/EFI/BOOT/`
  * Name **bootx64.efi.miui** file as **bootx64.efi**
  
  `mv /mnt/EFI/EFI/BOOT/bootx64.efi.miui /mnt/EFI/EFI/BOOT/bootx64.efi`
  * Keep **bootx64.efi.win** file name as is
* Now you can use LatteBW app

## How it works:
* Just click on icon in app drawer
* App automatically will do the following steps:
  * Mounts EFI partition
  * Swaps the boot files
  * Loads Windows