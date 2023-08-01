import org.testng.annotations.Test;

public class A01_MTHRAM extends TB{

    @Test
    public void m1(){
        String url = "https://vk.com/technoxpamlife";
        int countScroll = 40;
        music(url, countScroll, "add");
    }
}
