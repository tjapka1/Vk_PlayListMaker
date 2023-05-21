import org.testng.annotations.Test;

public class A01_MTHRAM extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/technoxpamlife");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
