package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class CompleteTheTaskTest : BaseTest() {

    private val taskName = "Sleep"

    @Test
    @DisplayName("Тест исчезновение таски после выполнения")
    fun completeTheTaskTest() {
        tasksScreen.plusTaskButton?.click()
        tasksScreen.writeTaskField?.sendKeys(taskName)
        tasksScreen.addTaskButton?.click()

        // Проверка, что таска появилась
        Assertions.assertEquals(true,  driver.findElement(By.xpath("//android.widget.TextView[@text='$taskName']")).isDisplayed)

        tasksScreen.completeTaskButton?.click()
        val wait = WebDriverWait(driver, Duration.ofSeconds(3))
        val isTaskInvisible = wait.until(
            ExpectedConditions.invisibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='$taskName']"))
        )

        // Проверка, что таска исчезла
        Assertions.assertTrue(isTaskInvisible, "Таска '$taskName' все еще видна.")

    }
}