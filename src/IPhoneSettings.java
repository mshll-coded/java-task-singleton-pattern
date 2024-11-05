public class IPhoneSettings {

    private static IPhoneSettings instance;
    
    private boolean WiFi;
    private double brightness;
    private int volume;

    private IPhoneSettings() {
        WiFi = false;
        brightness = 0.5;
        volume = 50;
    }

    public static IPhoneSettings getInstance() {
        if (instance == null) instance = new IPhoneSettings();
        return instance;
    }

    public boolean isWiFi() {
        return WiFi;
    }

    public void enableWiFi() {
        WiFi = true;
    }

    public void disableWiFi() {
        WiFi = false;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        if (brightness < 0) this.brightness = 0;
        else if (brightness > 1) this.brightness = 1;
        else this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) this.volume = 100;
        else if (volume < 0) this.volume = 0;
        else this.volume = volume;
    }

    @Override
    public String toString() {
        return "IPhoneSettings{" +
                "WiFi=" + WiFi +
                ", brightness=" + brightness +
                ", volume=" + volume +
                '}';
    }
}
