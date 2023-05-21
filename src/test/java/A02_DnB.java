import org.testng.annotations.Test;

public class A02_DnB extends TB{


    @Test
    public void d1(){
        setUp("https://vk.com/dnbtop");
        pause(1000);
        reg();
        pause(2000);
        scroll(20);
        pause(10000);
        getMusik();
        scroll(20);
    };

}
