# LatteBW
 Быстрая загрузка в режим Windows на MiPad 2

 [Show English README](https://github.com/Keddnyo/LatteBW/blob/main/README.md)
 
## Особенности:
* Малый размер приложения
* Быстрая загрузка
* Нужны права Root

## Подготовка к первому старту:
* Откройте эмулятор терминала на планшете
* Введите команды:
  * `su -c mount -o remount,rw /`
  * `su -c mkdir /mnt/EFI/`
  * `su -c mount -t vfat /dev/block/by-name/*loader /mnt/EFI`
* Скачайте файлы из [Google Drive](https://drive.google.com/folderview?id=1XnILUU79kNeCrRPrIFhPgjMbYFc8V8oW)
* Поместите файлы в директорию `/mnt/EFI/EFI/BOOT/`
  * Файл **bootx64.efi.miui** переименуйте в **bootx64.efi**

  `mv /mnt/EFI/EFI/BOOT/bootx64.efi.miui /mnt/EFI/EFI/BOOT/bootx64.efi`
  * Файл **bootx64.efi.win** оставьте как есть
* Теперь вы можете использовать приложение LatteBW

## Как всё работает:
* Просто нажмите на иконку в списке приложений
* Приложение автоматически выполнит следующие действия:
  * Примонтирует раздел EFI
  * Подменит загрузочные файлы
  * Загрузит Windows