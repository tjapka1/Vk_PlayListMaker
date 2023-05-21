import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TB {

    public WebDriver driver;

      public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","A:\\tools\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver();

        //installPlugin();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


    }
    public void installPlugin (){
        driver.get("https://chrome.google.com/webstore/detail/vkd-%D1%81%D0%BA%D0%B0%D1%87%D0%B0%D1%82%D1%8C-%D0%BC%D1%83%D0%B7%D1%8B%D0%BA%D1%83-%D0%B8-%D0%B2%D0%B8%D0%B4%D0%B5/faaapecbbejcllckafljlleeiopokmij/related");
        driver.findElement(By.className("webstore-test-button-label")).click();
        pause(20000);
    }


    public void scroll(int counter){
         int count=0;
        while (count==counter){
        scrolUnt();
        pause(1000);
        count++;
        }
    }

    private void scrolUnt() {
        clickWithJSExecutor(0, 1000);
    }
    private void scrolOb() {
        clickWithJSExecutor(0, -1000);
    }


    public void tearDown() {driver.quit();}
    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickWithJSExecutor(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        //element.click();
    }

    public void reg() {
        driver.findElement(By.className("quick_login_button")).click();
        driver.findElement(By.className("VkIdForm__input")).sendKeys("+4915226858002");
        driver.findElement(By.className("FlatButton__in")).click();
        pause(1000);
              driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div/form/div[1]/div[3]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("14041988");
        driver.findElement(By.className("vkuiButton__in")).click();

        pause(1000);

    }


    public void getMusik() {
        clickWithJSExecutor(0, 800);
       while (true){
       while (true) {
//           openPost();
           getADDOneTrack();
           pause(10000);

           }
       }
    }

    private void openPost() {
          driver.findElement(By.className("wall_post_text")).click();
    }

    private void getPlayOneTrack() {
        List<WebElement> tracs = driver.findElements(By.className("SecondaryAttachment__iconButton--audioPlay"));
        System.out.println(tracs.size());

        while (true) {

            for (WebElement trak  : tracs) {
                trak.click();
                clickWithJSExecutor(0, 100);
                System.out.println(trak.getText());
                pause(11200);
            }


        openList();
        }
    }
    private void getADDOneTrack() {
        List<WebElement> traks = driver.findElements(By.id("add_24__Page-2"));
        System.out.println(traks.size());

        while (true) {

            for (WebElement trak : traks) {
                trak.click();
                clickWithJSExecutor(0, 100);
                System.out.println(trak.getText());
                pause(1200);
            }

        openList();
        }
    }

    private void openList() {
        driver.findElement(By.className("SecondaryAttachmentGroupShowMore__label")).click();
    }

    public void getPosts(){

        clickWithJSExecutor(0, 2500);

    }

}
