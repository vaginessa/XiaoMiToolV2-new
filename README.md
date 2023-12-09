## XiaomiToolV2

This is a fork of the source code of the Xiaomi modding tool XiaomiTool V2 (www.xiaomitool.com).

### State of the project
  - The original repo is abandoned and it needed a small correction to make it run on linux.
  - The modifications are mainly based on the original [issue 23](https://github.com/francescotescari/XiaoMiToolV2/issues/23).

### Unlock BootLoader

Check this [wiki](https://github.com/tkapias/XiaoMiToolV2/wiki/Unlock-Bootloader-on-any-Xiaomi-Phones).

### Building and Running 

1. Install dependencies (Fedora):
```sh
sudo dnf install java-11-openjdk git android-tools
```
2. Clone this branch:
```sh
git clone -b main --single-branch --depth 1 https://github.com/topminipie/XiaoMiToolV2.git && cd XiaoMiToolV2
```
3. Build:
```sh
./gradlew build
```

4. Run:
```sh
./gradlew run
```

#### Bundling and distributing

TODO

## Credits

[XiaoMiToolV2 Original](https://github.com/francescotescari/XiaoMiToolV2)

[XiaoMiToolV2 Fork 1](https://github.com/Nik-Kot/XiaoMiToolV2/tree/linux)

[XiaoMiToolV2 Fork 2](https://github.com/tkapias/XiaoMiToolV2)

[Pull Request 1](https://github.com/francescotescari/XiaoMiToolV2/pull/103)

[Pull Request 2](https://github.com/francescotescari/XiaoMiToolV2/pull/98)
