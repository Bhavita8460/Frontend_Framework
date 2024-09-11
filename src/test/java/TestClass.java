import base.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends Base {

    @Test

    public void setup()throws IOException,InterruptedException {
        launchBrowser();
    }
}
