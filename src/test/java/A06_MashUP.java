import org.testng.annotations.Test;

public class A06_MashUP extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/public33013767");
        pause(1000);
        reg();
        pause(1000);
        openPost();
    }
}
