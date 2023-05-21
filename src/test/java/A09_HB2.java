import org.testng.annotations.Test;

public class A09_HB2 extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/hard_bass_kiev");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
