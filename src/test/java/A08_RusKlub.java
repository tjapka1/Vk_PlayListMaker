import org.testng.annotations.Test;

public class A08_RusKlub extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/rusremix");
        pause(1000);
        reg();
        pause(1000);
        openPost();
    }
}
