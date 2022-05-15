import HW_9.HW_9_1.Abbr;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MainTest {
    @Test
    public  void NewTest(){
        String result = Abbr.getAbbr("Dinar", 4);
        Assert.assertEquals(result, "D...j");
    }
    @Test
    public void NewTest2(){
        String result = StringUtils.abbreviate("Dinar", 4);
        Assert.assertEquals(result, "D...");
    }
}
