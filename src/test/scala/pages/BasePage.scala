package pages

import org.scalatest.Matchers
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import utils.StartUpTearDown

trait BasePage extends WebBrowser with Eventually with Matchers with StartUpTearDown {

}
