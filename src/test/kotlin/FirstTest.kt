import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.openqa.selenium.By

class FirstTest: BaseTest() {

    @Test
    fun firstTest(){
        driver.activateApp("com.google.android.calculator")

        val nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"))

        val six = driver.findElement(By.id("com.google.android.calculator:id/digit_6"))

        val plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"))

        val equals = driver.findElement(By.id("com.google.android.calculator:id/eq"))

        val resultField by lazy {  driver.findElement(By.xpath("//android.widget.TextView")) }

        nine.click()
        plus.click()
        six.click()
        equals.click()

        Assertions.assertEquals("15", resultField.text, "Ошибка!! 9 + 6 не равно 9 !!!1")

        driver.terminateApp("com.google.android.calculator")
    }
}