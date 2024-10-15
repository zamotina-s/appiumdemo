package tests

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.openqa.selenium.By
import kotlin.test.Test
import kotlin.test.assertTrue

class TaskOnTheSearchScreenTest : BaseTest() {

    // Присвоим уникальное имя
    private val taskName = "Being stupid ${System.currentTimeMillis()}"

    @BeforeEach
    fun setTask() {
        tasksScreen.plusTaskButton?.click()
        tasksScreen.writeTaskField?.sendKeys(taskName)
        tasksScreen.addTaskButton?.click()
    }

    @Test
    @DisplayName("Проверка отображения таски на SearchScreen")
    fun taskOnTheSearchScreenTest() {
        tasksScreen.navigateToSearchScreen()
        searchScreen.searchField?.sendKeys(taskName)

        assertTrue(
            driver.findElement(By.xpath("//android.widget.TextView[@text='$taskName']")).text.contains(taskName),
            "Добавленная таска '$taskName' не в списке."
        )

    }
}