import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    CalcScreen screen;

    @Test(priority = 1, description = "Calculate Series")
    public void doSeries(){
        screen = new CalcScreen(driver);
        String value = screen.calculateSeries("100/10*5-10+60");
        System.out.println(value);
        Assert.assertEquals(value,"100");
    }

    @AfterMethod
    public void clear(){
        screen = new CalcScreen(driver);
        screen.btnclear.click();
    }
}
