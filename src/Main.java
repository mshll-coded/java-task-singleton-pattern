public class Main {
    public static void main(String[] args) {
        IPhoneSettings iPhoneSettings = IPhoneSettings.getInstance();
        IPhoneSettings iPhoneSettingsAlt = IPhoneSettings.getInstance();

        System.out.println("iS1: " + iPhoneSettings);
        System.out.println("iS2: " + iPhoneSettingsAlt);
        
        iPhoneSettings.setBrightness(100);
        iPhoneSettingsAlt.disableWiFi();
        iPhoneSettingsAlt.setVolume(1);

        System.out.println("iS1: " + iPhoneSettings);
        System.out.println("iS2: " + iPhoneSettingsAlt);

    }
}
