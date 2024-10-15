package screen

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement

class TasksScreen(driver: AndroidDriver) : BaseScreen(driver) {

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.widget.Button")
    val plusTaskButton: WebElement? = null

    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
    val writeTaskField: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.Button")
    val addTaskButton: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.RadioButton")
    val completeTaskButton: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Shopping List\"]")
    val shoppingListCategory: WebElement? = null

}