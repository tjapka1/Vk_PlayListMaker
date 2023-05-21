import org.testng.annotations.Test;

public class A05_DanceHall extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/dancehalltune");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
