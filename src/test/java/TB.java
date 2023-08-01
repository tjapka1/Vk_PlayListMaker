import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TB {
    private final String VK_LOGIN = "+4915226858002";
    private final String VK_PASSWORD = "14041988";
    public WebDriver driver;

    public void setUp(String url){
      System.setProperty("webdriver.chrome.driver","A:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
     }
    public void tearDown() {
        driver.quit();}
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
    public void music(String url, int countScroll, String funk){
        setUp(url);
        pause(1000);
        reg();
        pause(1000);
        scrollAllPage(countScroll);
        pause(1000);
        switch (funk){
            case "add":
                getADDOneTrack();
                break;
            case "play":
                getPlayOneTrack();
                break;
            default:
                System.out.println("Error");
        }
        getADDOneTrack();

    }
    public void reg() {
        driver.findElement(By.className("quick_login_button")).click();
        driver.findElement(By.className("VkIdForm__input")).sendKeys(VK_LOGIN);
        driver.findElement(By.className("FlatButton__in")).click();
        pause(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[3]/div[1]/div/input")).click();
        pause(300);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys(VK_PASSWORD);
        driver.findElement(By.className("vkuiButton__in")).click();

        pause(1000);

    }
    public void openPost() {
        WebElement post=driver.findElement(By.className("PostHeaderSubtitle__item"));
        post.click();
        pause(1000);
        clickWithJSExecutor(0, 100);
        pause(100);
    }
    public void scrollAllPage(int countScroll) {
        int count = 0;
        boolean scrollDown = true;
        boolean scrollUp = false;
            do {
                clickWithJSExecutor(0, 10000);
                pause(1200);
                count++;
                if (count==countScroll){
                    scrollDown=false;
                    scrollUp=true;}
            }while (scrollDown);
            pause(10000);
            while (scrollUp){
                clickWithJSExecutor(0,-10000);
                pause(1200);
                count--;
                if (count==0){
                    scrollUp=false;
                }
            }



    }
    public String parserData(){
        List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"post-29819975_165241\"]/div/div[1]/div[2]/div[2]/a/time"));
        String dataString = "";
        for (WebElement date : dates){
            dataString=date.toString();
        }
        System.out.println(dataString);
        return dataString;
    }
    private static int EXECUT= 900;
    public void getPlayOneTrack() {
        clickWithJSExecutor(0, EXECUT);
        //List<WebElement> playTracks = driver.findElements(By.xpath("/html/body/div[19]/div/div[1]/div[1]/div[3]/div/div[2]/div/div/div[3]/div/div/div[3]/div[2]/div"));
        List<WebElement> playTracks = driver.findElements(By.className("SecondaryAttachment__iconButton--audioPlay"));
        System.out.println("K o L   "+playTracks.size());

            }
    public void getADDOneTrack() {
        clickWithJSExecutor(0, EXECUT);
        List<WebElement> addTracks = driver.findElements(By.cssSelector("[data-task-click='SecondaryAttachment/addAudio']"));
        changeTracks(addTracks);
    }
    private boolean changeTracks(List<WebElement> tracks) {
        boolean ready =false;
        boolean getAll=true;
        if (tracks != null) {
            while (getAll){
            for (WebElement track : tracks) {
                pause(500);
                track.click();
                clickWithJSExecutor(0, 100);
                pause(1000);

            }
                            }
        }
        return ready;
    }


}
