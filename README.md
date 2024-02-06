#

I will not support this project anymore.
Thank you all for your attention :)

Reasons:
1. The project is too big and hasn't been updated for a long time.
2. Works only on pc.
3. There is a great alternative of ~200 lines of code in Python and working on a phone - [MiTool](https://github.com/offici5l/MiTool), [PC Version](https://github.com/offici5l/un-lock)

I don't see the point of this XiaomiToolV2 fork anymore.

#

## XiaomiToolV2 [Fork](https://github.com/francescotescari/XiaoMiToolV2/compare/refactor/distribution...topminipie:XiaoMiToolV2:main)

[<img alt="CI" src="https://github.com/topminipie/XiaoMiToolV2/actions/workflows/ci.yml/badge.svg">](https://github.com/topminipie/XiaoMiToolV2/actions/workflows/ci.yml)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](./LICENSE)

This is the source code of the Xiaomi bootloader unlocking tool.

### State of the project
  - The original XiaomiToolV2 is abandoned and it needed a small correction to make it run on linux.

### Unlock BootLoader

This fork of XiaoMiTool V2 - [WORKS](https://github.com/topminipie/XiaoMiToolV2/tree/tested) (Tested on a real device - 09.12.2023)

Read [wiki](https://github.com/topminipie/XiaoMiToolV2/wiki).

### Building and Running 

1. Install Java 17 and Git:

#### Ubuntu
```sh
sudo apt install openjdk-17-jdk git
```

#### Fedora
```sh
sudo dnf install java-17-openjdk-devel git
```

2. Clone this repo:
```sh
git clone https://github.com/topminipie/XiaoMiToolV2.git && cd XiaoMiToolV2
```

3. Build:
```sh
./gradlew build
```

4. Run:
```sh
chmod +x ./res/tools/lin/adb
chmod +x ./res/tools/lin/fastboot
./gradlew run
```

5. Ignore update notifications.

6. [Unlock BootLoader](https://github.com/topminipie/XiaoMiToolV2/wiki/Unlock-BootLoader)

## Credits

[XiaoMiToolV2 Original](https://github.com/francescotescari/XiaoMiToolV2)

[XiaoMiToolV2 Fork 1](https://github.com/Nik-Kot/XiaoMiToolV2/tree/linux)

[XiaoMiToolV2 Fork 2](https://github.com/tkapias/XiaoMiToolV2)

[Pull Request 1](https://github.com/francescotescari/XiaoMiToolV2/pull/103)

[Pull Request 2](https://github.com/francescotescari/XiaoMiToolV2/pull/98)
