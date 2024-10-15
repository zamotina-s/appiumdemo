package screen

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement

class SearchScreen(driver: AndroidDriver) : BaseScreen(driver) {

    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
    val searchField: WebElement? = null

}