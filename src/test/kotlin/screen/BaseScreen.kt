package screen

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.support.PageFactory

open class BaseScreen(driver: AndroidDriver) {

    var driver: AndroidDriver

    init {
        this.driver = driver
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    fun navigateToTasks() {
        driver.findElement(By.xpath("//android.view.View[3]/android.view.View[1]/android.view.View[2]")).click()
    }

    fun navigateToSearchScreen() {
        driver.findElement(By.xpath("//android.view.View[3]/android.view.View[2]/android.view.View[2]")).click()
    }

    fun navigateToCategories() {
        driver.findElement(By.xpath("//android.view.View[3]/android.view.View[3]/android.view.View[2]")).click()
    }


}