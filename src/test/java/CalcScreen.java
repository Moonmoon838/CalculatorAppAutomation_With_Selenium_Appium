import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnclear;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String calculateSeries(String str){
        String[] input = str.split("[-+*/]");
        char[] digits = input[0].toCharArray();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits[0]))).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits[1]))).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits[2]))).click();
        btnDiv.click();

        char[] digits1 = input[1].toCharArray();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits1[0]))).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits1[1]))).click();
        btnMul.click();

        char[] digits2 = input[2].toCharArray();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits2[0]))).click();
        //driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits2[1]))).click();
        btnSub.click();

        char[] digits3 = input[3].toCharArray();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits3[0]))).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits3[1]))).click();
        btnPlus.click();

        char[] digits4 = input[4].toCharArray();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits4[0]))).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+String.valueOf(digits4[1]))).click();
        btnEqual.click();

        return txtResult.getText();
    }
}
