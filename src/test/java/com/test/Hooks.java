package com.test;

import io.cucumber.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    private static AppiumDriver driver;

    public static AppiumDriver validateDriver() throws MalformedURLException {
        UiAutomator2Options capabilities = new UiAutomator2Options();

        capabilities.setCapability("browserstack.user", "murilomunari_xtfEps");
        capabilities.setCapability("browserstack.key", "z3uYEiXk5639GxTnka55");
        capabilities.setApp("bs://095c456f19021c8672aca9666ebf82b81e3b3ed9");
        capabilities.setPlatformName("Android");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Before
    public void startProject() throws MalformedURLException {
        if (getDriver() == null) {
            validateDriver();
        }
    }
}
