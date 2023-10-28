package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface MobileConfig extends Config {

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getVersion();

    @Key("appUrl")
    String getApp();
}