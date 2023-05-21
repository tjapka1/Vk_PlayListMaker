import org.testng.annotations.Test;

public class A09_HB1 extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/hb_pump");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
