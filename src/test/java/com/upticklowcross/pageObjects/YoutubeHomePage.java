package com.upticklowcross.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeHomePage extends BasePage{

  public YoutubeHomePage(WebDriver driver) {
    super(driver);
  }
  
  public YoutubeMusicPage clickOnMusic(){
    driver.findElement(By.id("appbar-guide-button")).click();
    WebDriverWait wdw = new WebDriverWait(driver, 10);
    wdw.until(ExpectedConditions.elementToBeClickable(
        By.xpath(".//*[@id='UC-9-kyTW8ZkZNDHQJ6FgpwQ-guide-item']/a/span/span[2]")));
    driver
        .findElement(By.xpath(".//*[@id='UC-9-kyTW8ZkZNDHQJ6FgpwQ-guide-item']/a/span/span[2]"))
        .click();
    return new YoutubeMusicPage(driver);
  }
  
  public YoutubeSportsPage clickOnSports(){
    driver.findElement(By.id("appbar-guide-button")).click();
    WebDriverWait wdw = new WebDriverWait(driver, 10);
    wdw.until(ExpectedConditions.elementToBeClickable(
        By.xpath(".//*[@id='UCEgdi0XIXXZ-qJOFPf4JSKw-guide-item']/a/span/span[2]")));
    driver
        .findElement(By.xpath(".//*[@id='UCEgdi0XIXXZ-qJOFPf4JSKw-guide-item']/a/span/span[2]"))
        .click();
    return new YoutubeSportsPage(driver);
  }
}
