package utils

import org.openqa.selenium.WebDriver

trait StartUpTearDown {
  implicit lazy val webDriver: WebDriver = Driver.instance
}
