package com.xiaomitool.v2.language;

import com.xiaomitool.v2.xiaomi.miuithings.Branch;

public enum LRes {
  TIP_WINDOW_CLOSE("Close"),
  TIP_WINDOW_MINIMIZE("Minimize"),
  TIP_WINDOW_SETTINGS("Settings"),
  LOGIN_WHY_LOGIN("Why login?"),
  LOGIN_WHY_LOGIN_TEXT(
      "Log in is used by this tool for some advanced features. For example, it is used to enable bootloader unlock feature (to verify the device-user binding and to request the unlock token to Xiaomi servers) and to install ROMs via recovery depending on the account access level (with a beta authorized account you can install beta ROMs via recovery, which are not installable by default)."),
  OK_UNDERSTAND("Ok, I understand"),
  AGREE("Agree"),
  DONT_AGREE("Don't agree"),
  DISCLAIMER("Disclaimer"),
  SETTINGS_DOWNLOAD_DIR("Download directory"),
  SETTINGS_EXTRACT_DIR("Extraction directory"),
  SETTINGS_SAVE_SESSION("Save user login session"),
  SETTINGS_CLEAR("Clear download and extraction directories"),
  SETTINGS_RESET("Reset default settings"),
  CHOOSE("Choose"),
  LOGIN("Login"),
  LOGOUT("Logout"),
  TRANSLATED_BY("Translated by"),
  TRANSLATOR(""),
  TRANSLATOR_URL("https://www.xiaomitool.com"),
  CHOOSE_RECOVER_DEVICE("My device is bricked\nI want to unbrick it."),
  CHOOSE_MOD_DEVICE("My device works normally\nI want to mod it."),
  SEARCHING_CONNECTED_DEVICES("Searching connected devices"),
  LOADING("Loading"),
  HT_ENABLE_USB_DEBUG("How to enable usb debugging?"),
  SEARCH_AGAIN("Search again"),
  NO_DEVICE_CONNECTED(
      "No devices with USB debugging enabled found.\nPlease enable USB debugging and try again.\n\nIf you connected the device and enabled the usb debugging but it is not recognized,\nplease try changing the USB port and/or cable used."),
  FEATURE_NOT_AVAILABLE("Feature not available yet."),
  UNKNOWN("Unknown"),
  SERIAL("Serial"),
  STATUS("Status"),
  CODENAME("Codename"),
  BRAND("Brand"),
  MODEL("Model"),
  SELECT("Select"),
  SELECTED_DEVICE("Selected device: %1$s"),
  TRY_AGAIN("Try again"),
  DEVICE_NOT_CONNECTED(
      "It seems your device is not connected. Please make sure your device is on, connected to your pc and with USB debugging enabled.\nIf it's rebooting then wait for the boot completion\n\nIf you connected the device and enabled the USB debugging but it is not recognized,\nplease try changing the USB port and/or cable used."),
  AUTH_DEVICE_TEXT(
      "Your device is offline or not authorized. Please authorize your device by clicking on the popup window that is displayed on its screen.\nIf the device is in recovery mode or doesn't have the popup, try to unplug and plug back in the cable"),
  YES("Yes"),
  NO("No"),
  IRRELEVANT("Irrelevant"),
  UNLOCKED("Unlocked"),
  LOCKED("Locked"),
  MIUI_VERSION("MIUI version"),
  ANDROID_VERSION("Android version"),
  SERIAL_NUMBER("Serial number"),
  BOOTLOADER_STATUS("Bootloader status"),
  FASTBOOT_PARSED("Complete fastboot information"),
  RECOVERY_PARSED("Complete recovery information"),
  FINDING_INFO_TEXT(
      "Collecting information from your device to determine which procedures can be executed.\nPlease wait for this operation to finish or any messages from this tool.\nThe device will reboot a few times during this operation."),
  NO_DEVICE_CONNECTED_MODE(
      "No devices in %1$s mode found.\nPlease put your device in %1$s mode and try again.\nMake sure your device is connected to the PC with a valid USB cable."),
  HT_GO_RECOVERY("How to enter recovery mode?"),
  HT_GO_FASTBOOT("How to enter fastboot mode?"),
  BTN_VOLUP_POW(
      "Hold the volume+ and power buttons until your device reboots to recovery menu screen"),
  BTN_VOLDOWN_POW(
      "Hold the volume- and power buttons until your device reboots to fastboot mode screen"),
  HT_RECOVERY_TEXT_1(
      "Use the volume buttons to move to the third option (\"Connect with MIAssistant\" or \"连接小米助手\") and then use the power button to select it"),
  SEARCHING_CONNECTED_MTP_DEVICES("Searching connected MTP devices"),
  MTP_SENDING_FILE("Sending rom file to the device using MTP protocol"),
  STARTING_TASK("Starting task"),
  SECONDS("seconds"),
  MINUTES("minutes"),
  HOURS("hours"),
  PROGRESS_TEXT("Running... [%1$7s/%2$7s %3$s] - %4$3d%% - %5$8s - %6$2d %7$s remaining"),
  TASK_FINISHED("Task finished"),
  MTP_PREPARE_INSTALL("Preparing MTP installation"),
  MTP_ENABLING_DEVICE("Enabling MTP feature on the device"),
  MTP_DEVICE_SELECTED("MTP device detected"),
  FILE_SENT_TO_DEVICE("File sent to the device"),
  MTP_INSTALLING_FILE("Installing rom file on the device using MTP installation"),
  SIDELOAD_INSTALLING_FILE("Installing rom file on the device using sideload installation"),
  ROM_INSTALLED_ON_DEVICE("Rom installed on the device"),
  PARTITION_FORMATTING("Formatting %1$s partition"),
  PARTITION_FORMATTED("Partition formatted"),
  FETCHING_RECOVERY_INFO("Retrieving recovery information"),
  DONATE("Make a donation"),
  DONATE_DONT("Make the dev bankrupt"),
  DONATE_TEXT(
      "This tool was developed thanks to the donations of the users.\nThe developer of this tool isn't paid for his work and he is paying for services with his pocket money, leaving this tool free to use.\nIf you want to show your gratitude to him or support this project, you can offer him a beer by making a donation.\n\nWould you like to make a donation?"),
  INSTALL_SUCCESS("Installation completed successfully!"),
  DOWNLOADING_ROM_FILE("Downloading rom file..."),
  EXIT_TOOL("Close the tool"),
  DONATE_THANKS_TEXT(
      "You can proceed by making the donation using the methods indicated on the website. Thank you, I hope I've been helpful to you with this tool :)"),
  REBOOTING_TO_MODE("Rebooting the device to %1$s mode"),
  DONT_REBOOT_DEVICE("Don't reboot the device and don't disconnect it from the pc"),
  SEARCHING_LATEST_ROM("Searching latest rom %1$s"),
  QUERYING_OTA_ROM("Searching rom update to %1$s"),
  GLOBAL_STABLE("Global stable"),
  GLOBAL_DEVELOPER("Global developer"),
  CHINA_STABLE("Chinese stable"),
  CHINA_DEVELOPER("Chinese developer"),
  EUROPE_STABLE("European stable"),
  EUROPE_DEVELOPER("European developer"),
  RUSSIA_STABLE("Russian stable"),
  RUSSIA_DEVELOPER("Russian developer"),
  INDIA_STABLE("Indian stable"),
  INDIA_DEVELOPER("Indian developer"),
  ROM_SELECTED_ROM("Rom selected: %1$s"),
  INET_CHECKING_CONNECTION("Checking internet connection"),
  INET_CONNECTION_ERROR_TEXT(
      "Internet connection failed.\nInternet connection is required for the proper use of this tool.\n\nPlease connect your pc to Internet and try again"),
  INET_CONNECTION_ERROR_TITLE("Online services connection error"),
  UPDATE_WILL_UPDATE("Download the update"),
  UPDATE_AVAILABLE_TEXT(
      "%1$s.\nIt is recommended to always update to the latest version of the tool because older versions may contain more bugs or outdated procedures that could harm your device.\nLatest version available: %2$s\n\nDo you want to download the latest update?"),
  UPDATE_FULL_UP_AVAIL("An update for this tool is available"),
  UPDATE_QUICK_UP_AVAIL("A quick update for this tool is available (%1$s)"),
  DOWNLOADING_UPDATE("Downloading %1$s update: %s"),
  UPDATE_QUICK_UP_FAILED(
      "Download or installation of quick update failed.\nYou can still install the update by downloading the full package.\n\nDo you want to download the full package update?"),
  INSTALLING_UPDATED("Installing update..."),
  IGNORE("Ignore"),
  LOGIN_CANCELED("Login canceled or failed"),
  LOGIN_SUCCESS("Logged in successfully"),
  PROCEDURE_EXC_TITLE("Procedure error occurred"),
  PROCEDURE_EXC_TEXT("There was an error during the installation procedure.\nError description:"),
  PROCEDURE_EXC_TEXT_2(
      "Error family code:%1$s\nError origin:%s\n\nPress \"%2$s\" to try again the failed procedure.\nPress \"%3$s\" to go a step back and try again the entire latest step\nPress \"%4$s\" to cancel the procedure and abort the installation process"),
  PROCEDURE_EXC_DETAILS("Error type: %1$s\nError description: %2$s"),
  CANCEL("Cancel"),
  STEP_BACK("Step back"),
  DRIVER_FIXING_MTP("Fixing MTP driver issues"),
  DRIVER_INSTALLING("Installing driver %1$s"),
  FETCHING_DOWNLOAD_URL("Fetching download url"),
  TWRP_SEARCHING_FROM("Searching latest TWRP for device %1$s from %2$s"),
  FILE_PLEASE_SELECT("Please select %1$s file"),
  FILE_SELECT_DRAGDROP("Press here to select a file or drag and drop it"),
  FILE_SELECTED("File selected"),
  TWRP_SELECT_FILE("Please select the TWRP file"),
  TWRP_SELECT_FILE_EXP(
      "Failed to obtain the TWRP file for your device automatically. You have to find it and download it by yourself. Usually you just need to search \"twrp %1$s\" on google and in the first results you will find that. Once downloaded press the box below to select it and then continue."),
  CONTINUE("Continue"),
  FILE_PLEASE_SELECT_POPUP("Please select a file and then press continue"),
  CHOOSE_XIAOMI_TITLE("Official Xiaomi ROM"),
  CHOOSE_XIAOMI_SUB("Official ROM coming directly from the OEM"),
  CHOOSE_UNLOCK_TITLE("Unlock, lock bootloader and other"),
  CHOOSE_UNLOCK_SUB("Select this if you want to do bootloader operations"),
  CHOOSE_CUSTOM_TITLE("Custom ROM, not official"),
  CHOOSE_CUSTOM_SUB("Any custom, not official ROM, for example xiaomi.eu, lineageos, ..."),
  CHOOSE_MOD_TITLE("Mods, root and twrp"),
  CHOOSE_MOD_SUB("Any flashable mod, for example magisk, twrp, xposed, ..."),
  ROM_LOCAL_OFFICIAL_SUB("Choose an official ROM to install from your PC"),
  ROM_LOCAL_OFFICIAL("Local official ROM file"),
  ROM_LOCAL("Local ROM file"),
  ROM_LOCAL_SUB("Choose the ROM file to install from your PC"),
  FILE_SELECT_OFFICIAL_TIT("Please select official ROM file"),
  FILE_SELECT_OFFICIAL_TEXT(
      "Press the box below to select the file of the official MIUI ROM that you want to install"),
  UNIMPORTANT("Unimportant"),
  UNLOCK_BOOTLOADER("Unlock bootloader"),
  UNLOCK_DEVICE_BOOTLOADER("Unlock the bootloader of this device"),
  UNLOCK_BOOTLOADER_WARN(
      "You're about to unlock your device.\nThis tool will request the unlock token from Xiaomi server.\nIf your Xiaomi account has been bound to the device for enough time, the server is going to provide the unlock token and this tool will proceed with the unlock procedure.\n\nUnlocking might erase your device data, so if you need to backup some data please cancel this procedure and do a backup on the cloud before trying again."),
  TWRP_RECOVERY("TWRP recovery"),
  TWRP_SELECT_MANUAL("Select a TWRP recovery file to install"),
  TWRP_AUTO_DOWNLOAD("Download and install TWRP automatically"),
  MAGISK_ROOT("Root with magisk"),
  MAGISK_AUTO_DOWNLOAD("Download and install magisk %1$s"),
  XIAOMIEU_TITLE("Xiaomi.eu ROM"),
  XIAOMIEU_AUTO_DOWNLOAD("Download and install Xiaomi.eu ROM"),
  FILE_SELECT_TIT("Please select rom file"),
  FILE_SELECT_TEXT("Press the box below to select the file of the rom that you want to install"),
  ROM_LOCAL_TEXT(
      "Install a ROM that you already downloaded on your pc. Both MIUI and non-MIUI ROMs accepted"),
  MOD_LOCAL("Local mod file"),
  MOD_LOCAL_TEXT("Install a TWRP flashable zip mod already present on your pc"),
  BRANCH_STABLE("Stable"),
  BRANCH_DEVELOPER("Developer"),
  BRANCH_ALPHA("Alpha"),
  ADB_PUSHING_FILE("Pushing file to the device via ADB"),
  INSTALL_TWRP_ZIP("Starting TWRP installation process"),
  ABORT("Abort"),
  REBOOT_STATUS_FAILED(
      "Your device should enter %1$s mode, but it seems it failed to do that or is not recognized or not connected.\nPlease hold the volume%2$s and power button to reboot it to %3$s mode.\n\nFail cause: %4$s"),
  FLASHING_STUFF("Flashing %1$s"),
  BOOTING_STUFF("Booting %1$s"),
  CREATING_DEST_DIR("Creating destination directory"),
  WAITING_DEVICE_ACTIVE("Waiting for device %1$s connection"),
  SEARCHING_LATEST_FASTBOOT("Searching latest fastboot rom: %1$s"),
  CALCULATING_MD5("Calculating MD5 hash of file"),
  SEARCHING_XIAOMIEU_ROM("Searching latest Xiaomi.eu ROM: %1$s"),
  SEARCHING_LATEST_MAGISK("Searching latest magisk zip file"),
  VALIDATING_PKG_ROM("Trying to validate ROM package with MIUI server"),
  SEARCHING_LATEST_RECOVERY_ROM("Searching latest recovery ROM: %1$s"),
  SEARCHING_LATEST_OTA_ROM("Searching latest ROM available through OTA: %1$s"),
  REQUEST_OTA_INSTALLATION_TOKEN("Requesting OTA installation token for ROM: %1$s"),
  BACK_TO_CATEGORIES("Back to categories"),
  BACK_TO_CATEGORIES_TEXT("Go back and choose another category of procedures"),
  STARTING_MIUI_SIDELOAD("Starting MIUI sideload procedure"),
  REQ_CHECK_STOCKRECOVERY("Check if stock recovery is available"),
  REQ_BOOTLOADER_UNLOCKED("Unlock the bootloader"),
  REQ_BOOTLOADER_UNLOCKED_MIUI("Unlock the bootloader (might require days of waiting time)"),
  REQ_INSTALL_TWRP("Install TWRP"),
  CONFIRM_REQUIREMENTS_TEXT(
      "This installation requires some additional steps before the actual procedure can start.\nThis tool will take care of these steps if you confirm the procedure.\nPress \"%1$s\" if you want to continue, \"%2$s\" to go back to ROM selection.\nHere is what it is necessary to do:\n\n"),
  REQ_CHECK_TWRPINSTALL("Check if TWRP recovery is installed"),
  IF_NOT_INSTALLED("If not installed"),
  ENABLE_USB_DEBUG_IF_NOT("Enable USB debugging (if not enabled)"),
  EXTRACTING_ROM_FILE("Extracting ROM file..."),
  CHOOSE_PROCEDURE_CATEGORY("Please choose a procedure category"),
  CHOOSE_PROCEDURE("Please choose which rom/procedure you want"),
  ENTER_STOCK_RECOVERY_MODE(
      "Your device is rebooting to stock recovery mode.\nYou should see this menu in a few seconds.\nPlease use the volume down button to move to the third option and then the power button to select it.\nThis will enable the required ADB connection between the device and this pc.\n\nIf you don't see this menu, just reboot the device and press \"%1$s\"."),
  SKIP("Skip"),
  NO_INTERNET_BEFORE_FETCH(
      "No internet connection found!\n\nThis tool uses Internet connection to find automatically the latest roms and mods that you can install on your device.\nWithout internet connection this feature will not work.\nYou should enable your internet connection to get the best experience out of this tool.\nChoose if you want to skip this feature or enable internet connection and press try again."),
  CONFIRM_INSTALLATION_START(
      "You are about to start the installation procedure!\nThis is the last confirmation request before XiaoMiTool will do all of its things and manage your device with advanced procedures.\n\nYou are going to lose all (or some part) of the personal data (photos, files, applications) on your device, so DO A BACKUP if you want to save them.\nBy pressing \"%1$s\" you are responsible of lost data, bricked devices and all the possible outcomes of the procedure."),
  NEXT_STEP("Next step"),
  PREV_STEP("Previous step"),
  HT_ENABLE_USB_1("Go the device setting by pressing the settings icon in the launcher"),
  HT_ENABLE_USB_2("Tap the \"About phone\" option and enter \"All specs\" menu"),
  HT_ENABLE_USB_3(
      "Tap several (about ten) times the \"MIUI version\" entry in the menu until you get the message \"You are now a developer\""),
  HT_ENABLE_USB_4("Go back to the main settings menu and tap the \"Additional settings\" voice"),
  HT_ENABLE_USB_5("Scroll down and tap the \"Developer options\" menu option"),
  HT_ENABLE_USB_6("Scroll down and find the \"USB Debugging\" option"),
  HT_ENABLE_USB_7("Tap the toggle to enable the USB debugging and press \"OK\" to confirm"),
  OK_FINISHED("Ok, finished all"),
  WAITING_USB_ENABLE(
      "Waiting for USB Debugging connection\nPlease enable the USB Debugging on your device and then press \"%1$s\"!"),
  STEP("Step"),
  CAN_TAKE_COUPLE_MIN("Please wait, it can take a couple of minutes"),
  UNL_UNKNOWN_ERROR("Unknown error: %1$d"),
  UNL_ERR_10000("10000:Request parameter error"),
  UNL_ERR_10001("10001:Signature verification failed"),
  UNL_ERR_10002("10002:The same IP request too often"),
  UNL_ERR_10003("10003:Internal server error"),
  UNL_ERR_10004("10004:Request has expired"),
  UNL_ERR_10005("10005:Invalid Nonce request"),
  UNL_ERR_10006("10006:Client version is too low"),
  UNL_ERR_20030(
      "You have already unlocked a device recently\nYou should wait at least 30 days from the first unlock to unlock another device"),
  UNL_ERR_20031(
      "This device is not bound to your account\nTurn on your device and bind your account to the device by going in MIUI's Settings > Developer options > Mi Unlock status"),
  UNL_ERR_20032("Failed to generate signature value required to unlock"),
  UNL_ERR_20033("User portrait scores too low or black"),
  UNL_ERR_20034("Current account cannot unlock this device"),
  UNL_ERR_20035(
      "This tool is outdated, if you want to unlock your device then go to unlock.update.miui.com to download the latest version of MiUnlock"),
  UNL_ERR_20036(
      "Your account has been bound to this device for not enough time\nYou have to wait %1$d days and %2$d hours before you can unlock this device"),
  UNL_ERR_20036_NOHOURS("You have to wait some days before you can unlock your device"),
  UNL_ERR_20037("Unlock number has reached the upper limit"),
  UNL_ERR_20041(
      "Your Xiaomi account isn't associated with a phone number\nGo to account.xiaomi.com and associate it with your phone number"),
  UNLOCK_ERROR_TEXT(
      "Failed to unlock your device, Xiaomi server returned error %1$d:\nError description: %2$s\nServer description: %3$s"),
  UNLOCK_CHECKING_ACCOUNT("Checking account unlock availability"),
  UNLOCK_CHECKING_DEVICE("Checking device unlock capability"),
  UNLOCK_REQUESTING_TOKEN("Requesting device unlock token"),
  UNLOCK_UNLOCKING_DEVICE("Unlocking device using fastboot"),
  CUSTOM_RECOVERY("Custom recovery"),
  CUSTOM_RECOVERY_TEXT("Install a custom local file recovery, such as TWRP recovery"),
  SEND_FEEDBACK("Send feedback"),
  INCLUDE_LOG_FILES("Include log file (recommended)"),
  UPLOADING_FEEDBACK("Uploading feedback..."),
  FEEDBACK_SENT("Feedback sent, thank you!"),
  FEEDBACK_ERROR("Failed to send the feedback"),
  PLEASE_WAIT_X_SECONDS("Please wait %1$d seconds"),
  FEEDBACK_ASK_TO_LEAVE(
      "It seems that your installation wasn't successful :(\nFeedback is very important to the developer, feedback and logs help the developer to improve this tool.\nThis tool has a built-in function to leave a feedback, including log file.\nWould you like to leave a feedback?"),
  COPIED_TO_CLIPBOARD("Copied to clipboard"),
  FEEDBACK_ONLY_ONE(
      "If you got the same error multiple times, please DO NOT send multiple feedback!"),
  REG_RUSSIA("Russia"),
  REG_CHINA("China"),
  REG_EUROPE("Europe"),
  REG_INDIA("India"),
  REG_GLOBAL("Global"),
  REG_OTHER("Other regions"),
  PLEASE_SELECT_REGION("Please select your region"),
  PLEASE_SELECT_LANGUAGE("Please select your language"),
  PLEASE_SELECT_REGION_TEXT(
      "Depending on your region, specific official ROMs for selected region will be searched\nand specific MIUI servers will be used.\nPlease select the preferred region."),
  SELECT_IF_YOURE_FROM("Select this if you are from %1$s"),
  SELECTED_REGION("Selected region: %1$s"),
  SELECTED_LANG("Selected language: %1$s"),
  ROM_INSTALL_NOT_ALLOWED("You can't install this ROM: %1$s"),
  ROM_INSTALL_NOT_ALLOWED_EXP(
      "The ROM you selected cannot be installed onto the current ROM without unlocking the bootloader.\nThis is because locked bootloader installations must be validated and allowed by Xiaomi server.\nThe server didn't allowed the installation or errors occurred during installation.\nServer response:\n\n%1$s"),
  CLOSING("Closing XiaoMiTool"),
  NO_SPACE_LEFT_DEVICE("No space left on device"),
  INSTALL_APK_APP("Install apk app: %1$s"),
  MAGISK_INSTALL_MANAGER("Installing magisk manager"),
  DATA_ENCRYPTED_DETECT("Detected encrypted data partition"),
  SELECTED_FILE_LIST("Selected file list"),
  FILE_SELECT_MULTIPLE_TITLE("Please select ROM files to install"),
  FILE_SELECT_MULTIPLE_TEXT(
      "Select one or more files to install.\nMake sure they are ordered correctly (from top to bottom) following the wanted installation order.\nA wrong installation order can lead to device bricking or unwanted results."),
  SINGLE_FILE("Single file"),
  MULTIPLE_FILES("Multiple files"),
  RECOVER_PHONE_CHARGED(
      "Please make sure your device is charged.\nSometimes it might seem bricked when it is just discharged.\nFor example, the red blinking notification light can indicate an empty battery.\nIf you are not sure that your phone is charged, leave it attached to the original charger for at least 15 minutes before continuing."),
  FAILED_TO_DO_THAT("Failed to do that"),
  ENTER_FASTBOOT_MODE(
      "To enter fastboot mode, press the volume down and power for several seconds, until the screen turns on.\nYou should see the fastboot logo as shown beside.\nIt is not necessary to turn off the device before pressing the buttons.\nIf the device reboots normally, you are not keeping the buttons pressed for long enough."),
  PLEASE_SELECT_DEVICE("Please select your device"),
  STARTING_RECOVERY_PROC("Starting recovery procedure"),
  SEARCHING_BEST_ROM_TO_RECOVER("Searching the best ROM to recover the device"),
  RECOVERY_MODE_EXP(
      "This is the recovery procedure of XiaoMiTool, you should use only if your device is bricked\n(if it doesn't boot normally to the operating system).\nThis procedure tries to flash a stock, official ROM back to the device, cleaning the data and cache partition.\nPlease note that not all of the bricked devices can be fixed with this tool,\nin particular it DOESN'T work if your device cannot reach fastboot and recovery mode (hard brick).\nAll or part of the data on the device will be lost.\n\nPlease proceed if you want to try to fix your bricked device."),
  DETAILS("Details"),
  ALTERNATIVE("Alternative"),
  ERROR_WHILE_RECOVERING(
      "An error occurred during the device recovery procedure.\nThere is an alternative procedure that could recover the device."),
  ALTERNATIVE_PROCEDURE_EXP(
      "Press \"%1$s\" if you want to read the details of the error and retry the current procedure.\nPress \"%2$s\" if you want to try with the alternative procedure instead."),
  IS_THIS_MIUI_VERSION(
      "Do you have the brick issue where the device only reboots to recovery mode displaying the \"This MIUI version can't be installed on this device\" message?"),
  SUGGEST_UNLOCK_BL_RECOVER(
      "The bootloader of the selected device seems to be locked.\nIn order to recover the device it's strongly suggested to unlock the bootloader if possible.\nIn order to unlock the bootloader your Mi Account has to be bound to the device from the Developer Options in the Settings menu of the device for about several days.\nIf you did not bind your device before bricking it and now it can be turned on, just click \"%1$s\".\n\nDo you want to unlock the bootloader now?.");
  private String text;

  LRes(String defaultText) {
    this.text = defaultText;
  }

  public static String branchToString(Branch branch) {
    if (branch == null) {
      return "null branch";
    }
    switch (branch) {
      case STABLE:
        return LRes.BRANCH_STABLE.toString();
      case DEVELOPER:
      case DEBUG:
        return LRes.BRANCH_DEVELOPER.toString();
      default:
        return LRes.BRANCH_ALPHA.toString();
    }
  }

  public String getKey() {
    return this.name().toLowerCase();
  }

  public String toEnglish() {
    return text;
  }

  public String toEnglish(Object... args) {
    try {
      return String.format(text, args);
    } catch (Exception e) {
      return text;
    }
  }

  public String toString() {
    try {
      return Lang.text(getKey());
    } catch (Exception e) {
      return toEnglish();
    }
  }

  public String toString(Object... args) {
    try {
      return Lang.text(getKey(), args);
    } catch (Exception e) {
      return toEnglish(args);
    }
  }
}
