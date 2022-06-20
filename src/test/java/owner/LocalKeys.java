package owner;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/local.properties"})
public interface LocalKeys extends Config {
    @DefaultValue("Android")
    String platformName();

    @DefaultValue("RF8N20V1PCM")
    String deviceName();

    @DefaultValue("12.0")
    String platformVersion();

    @DefaultValue("org.wikipedia.alpha")
    String appPackage();

    @DefaultValue("org.wikipedia.main.MainActivity")
    String appActivity();

    @DefaultValue("http://localhost:4723/wd/hub")
    String localUrl();

    @DefaultValue("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk")
    String downloadAppUrl();
}
