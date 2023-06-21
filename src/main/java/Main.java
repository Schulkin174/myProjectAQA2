import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Алекс\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://novate.ru/"); // открыть страницу

        WebElement input = driver.findElement(By.id("search")); // найти элемент по id: нашли инпут
        input.sendKeys("интерьер"); // вписываем запрос
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-form\"]/input[2]")); // найти элемент по xpath: нашли кнопку
        searchButton.click(); // кликнули на кнопку

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // создаем неявное ожидание, т.е. общее ожидание

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"right\"]/h2[1]")))); // создаем явное ожидаине для конкретного случая
        /* создаем вебдрайвер, который будет отвечать за ожидание, задаем ему несколько параметров: драйвер, передаем время, которое нужно подождать;
        далее вызываем для драйвера метод, в нашем случае until: что мы ожидаем от нужного нам элемента? - Появился, пропал и тд.
        Т.е. обращаемся к какому-л событию посредством ExpectedConditions. У данного класса есть различные методы: выбираем тот, который мы ожидаем.
         */


        driver.quit(); // закрыть браузер
    }
}
