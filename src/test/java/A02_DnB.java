import org.testng.annotations.Test;

public class A02_DnB extends TB{


    @Test
    public void d1(){
        String url = "https://vk.com/dnbtop";
        int countScroll = 10;
        music(url, countScroll, "add");
    };

}
