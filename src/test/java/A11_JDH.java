import org.testng.annotations.Test;

public class A11_JDH extends TB{

    @Test
    public void m1(){
        setUp("https://vk.com/invoicesound");
        pause(1000);
        reg();
        pause(1000);
        //getMusik();
    }
}
