package com.selenium.brokenlink.test;

import com.selenium.broken.base.BaseClass;
import com.selenium.broken.utility.BrokenLink;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenlinkTest extends BaseClass {

    @Test
    public void test_broken_link() throws IOException {
        BrokenLink brokenLink=new BrokenLink(driver);
        brokenLink.broken_link();
        String exceptedUrl=driver.getCurrentUrl();
        Assert.assertEquals(brokenLink.broken_link(),exceptedUrl);
    }
}
