package com.upticklowcross.cucumberTraining;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AbstractStepDefinition {
  protected static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      System.setProperty("webdriver.chrome.driver", System.getenv("DRIVERS")+"\\chromedriver.exe");
      DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setCapability("chrome.switches", Arrays.asList("--silent"));
      driver = new ChromeDriver(capabilities);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    return driver;
  }
}
