import org.testng.annotations.Test;

public class A03_Jungle extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/ragga_jungle_ru");
        pause(1000);
        reg();
        pause(1000);
        getMusik();
    }
}
