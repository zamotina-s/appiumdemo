package tests

import org.junit.jupiter.api.DisplayName
import org.openqa.selenium.By
import kotlin.test.Test
import kotlin.test.assertTrue

class RenameCategory : BaseTest() {
    private val categoryName = "Home"

    @Test
    @DisplayName("Проверка переименования категории")
    fun renameCategoryTest() {
        tasksScreen.navigateToCategories()
        categoriesScreen.categoryCard?.click()
        categoriesScreen.categoryInput?.sendKeys(categoryName)
        categoriesScreen.saveButton?.click()

        assertTrue(
            driver.findElement(By.xpath("//android.widget.TextView[@text='$categoryName']")).text.contains(categoryName),
            "Категория не переименована"
        )
    }

    @Test
    @DisplayName("Проверка переименования категории в пустое название")
    fun renameCategoryNegativeTest() {
        val emptyCategoryName = ""

        tasksScreen.navigateToCategories()
        categoriesScreen.categoryCard?.click()
        categoriesScreen.categoryInput?.sendKeys(emptyCategoryName)
        categoriesScreen.saveButton?.click()


        assertTrue(
            driver.findElement(By.xpath("//android.widget.TextView[@text='$categoryName']")).text.contains(categoryName),
            "Категория переименована"
        )
    }
}