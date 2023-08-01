import org.testng.annotations.Test;

public class A04_DUB extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/club50522777");
        pause(1000);
        reg();
        pause(1000);
        //getMusik();
    }
}
