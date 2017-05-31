package net.tobysullivan.chromedriver

import org.openqa.selenium._
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedCondition, WebDriverWait}

object ChromeDriver {
  def main(args: Array[String]) {
    val driver = new ChromeDriver()

    driver.get("http://google.com")

    println(s"Page title is ${driver.getTitle}")

    val element = driver.findElement(By.name("q"))

    element.sendKeys("Cheese!")
    element.submit()

    new WebDriverWait(driver, 10).until((f: WebDriver) => f.getTitle.toLowerCase.startsWith("cheese!"))

    println(s"Page title is ${driver.getTitle}")

    driver.quit()
  }
}
