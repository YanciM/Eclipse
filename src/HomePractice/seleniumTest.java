package HomePractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {
    public static void main(String[] args) {

        System.out.println("Hello");

        System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\yanci\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe");

        WebDriver obj=new FirefoxDriver();
        obj.get("https://google.com");


    }
}
