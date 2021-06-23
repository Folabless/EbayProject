package co.uk.ebay.hooks;

import co.uk.ebay.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager
{
    @Before
    public void setUp()
    {
        launchBrowser("Chrome");

    }
@After
    public void tearDown()
{
    closeBrowser();
}

}
