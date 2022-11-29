package ru.lamoda.config;


import org.aeonbits.owner.ConfigFactory;
import ru.lamoda.config.web.WebConfig;

public enum ConfigReader {
    Instance;

    private static final WebConfig webConfig =
            ConfigFactory.create(
                    WebConfig.class,
                    System.getProperties()
            );

    public WebConfig read() {
        return webConfig;
    }
}
