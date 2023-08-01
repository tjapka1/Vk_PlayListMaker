import org.testng.annotations.Test;

public class A01_MT1 extends TB{
    @Test
    public void m1(){
        setUp("https://vk.com/exclusivemt");
        pause(1000);
        reg();
        pause(1000);
        scrollAllPage(2);
        pause(1000);
        getADDOneTrack();


    }
}
