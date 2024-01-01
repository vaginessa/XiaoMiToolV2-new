## XiaomiToolV2 [Fork](https://github.com/francescotescari/XiaoMiToolV2/compare/refactor/distribution...topminipie:XiaoMiToolV2:main)

This is the source code of the Xiaomi bootloader unlocking tool.

### State of the project
  - The original XiaomiToolV2 is abandoned and it needed a small correction to make it run on linux.

### Unlock BootLoader

This fork of XiaoMiTool V2 - WORKS (Tested on a real device - 09.12.2023)

Read [wiki](https://github.com/topminipie/XiaoMiToolV2/wiki/Unlock-BootLoader).

### Building and Running 

1. Install dependencies:

#### Ubuntu
```
sudo apt install openjdk-11-jdk git
```

#### Fedora
```
sudo dnf install java-11-openjdk git
```

2. Clone this repo:
```
git clone https://github.com/topminipie/XiaoMiToolV2.git && cd XiaoMiToolV2
```

3. Build:
```
./gradlew build
```

4. Run:
```
chmod +x ./res/tools/lin/adb
chmod +x ./res/tools/lin/fastboot
./gradlew run
```

5. Ignore update notifications.

## Credits

[XiaoMiToolV2 Original](https://github.com/francescotescari/XiaoMiToolV2)

[XiaoMiToolV2 Fork 1](https://github.com/Nik-Kot/XiaoMiToolV2/tree/linux)

[XiaoMiToolV2 Fork 2](https://github.com/tkapias/XiaoMiToolV2)

[Pull Request 1](https://github.com/francescotescari/XiaoMiToolV2/pull/103)

[Pull Request 2](https://github.com/francescotescari/XiaoMiToolV2/pull/98)
