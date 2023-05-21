import org.testng.annotations.Test;

public class A10_Retro extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/retroremixes");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
