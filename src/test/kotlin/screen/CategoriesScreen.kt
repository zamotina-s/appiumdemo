package screen

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement

class CategoriesScreen (driver: AndroidDriver) : BaseScreen(driver) {

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]")
    val categoryCard: WebElement? = null

    @AndroidFindBy(xpath = "//android.view.View/android.widget.EditText")
    val categoryInput: WebElement? = null

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")
    val saveButton: WebElement? = null

}