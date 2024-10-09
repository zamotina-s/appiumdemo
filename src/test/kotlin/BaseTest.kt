
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.appium.java_client.service.local.AppiumServiceBuilder
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import java.time.Duration

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class BaseTest {

    protected lateinit var driver: AndroidDriver

    private val service = AppiumServiceBuilder()
        .withIPAddress("0.0.0.0")
        .usingPort(4723)
        .withTimeout(Duration.ofSeconds(5))
        .build()



    private val uiAutomator2Options = UiAutomator2Options()
        .setDeviceName("Android Device")
        .setUdid("emulator-5554")
        .setAutomationName("UiAutomator2")
        .setPlatformName("Android")


    @BeforeAll
    fun startService() {
        service.start()
        driver = AndroidDriver(service.url, uiAutomator2Options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2))
    }

    @AfterAll
    fun stopService(){
        driver.quit()
        service.stop()
    }
}