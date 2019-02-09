package com.briteErp.tests.functional_tests;
import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TopRightSearchBarTests extends TestBase {
    @Test(priority = 1)
    public void checkSearchBox() throws InterruptedException {
        extentLogger = report.createTest("check search box");
        pages.login().BriteErpLink.click();
        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser"));
        extentLogger.info("Click on Sales module");
        pages.topRightSearchBarPage().sales.click();
        Thread.sleep(3000);
        extentLogger.info("Click search bok");
        pages.topRightSearchBarPage().findsearchbox();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void locationOfSearchBox() throws InterruptedException {
        extentLogger = report.createTest("location of the search bar");
        pages.login().BriteErpLink.click();
        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser"));
        extentLogger.info("Click on Sales module");
        pages.topRightSearchBarPage().sales.click();
        Thread.sleep(3000);
        extentLogger.info("Click search box");
        pages.topRightSearchBarPage().findsearchbox();
        Thread.sleep(3000);
        extentLogger.info("Click any category in the left side menu");
        pages.topRightSearchBarPage().quotations.click();
        Thread.sleep(3000);
        extentLogger.info("Click any category in the left side menu");
        pages.topRightSearchBarPage().orders.click();
        Thread.sleep(3000);
        extentLogger.info("Click any category in the left side menu");
        pages.topRightSearchBarPage().customers.click();
        Thread.sleep(3000);
        extentLogger.info("Check search box");
        pages.topRightSearchBarPage().searchbox.click();
    }
    @Test(priority = 3)
    public void clickAdvancedSearch() throws InterruptedException {
        extentLogger = report.createTest("location of the search bar");
        pages.login().BriteErpLink.click();
        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser"));
        extentLogger.info("Click on Sales module");
        pages.topRightSearchBarPage().sales.click();
        Thread.sleep(3000);
        extentLogger.info("Click Advanced Search");
        pages.topRightSearchBarPage().advancedsearch.click();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void FilterGroupByAndFavorites() throws InterruptedException {
        extentLogger = report.createTest("able to see Filter, Group By, and Favorites");
        pages.login().BriteErpLink.click();
        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser"));
        extentLogger.info("Click on Sales module");
        pages.topRightSearchBarPage().sales.click();
        Thread.sleep(3000);
        extentLogger.info("Click search box");
        pages.topRightSearchBarPage().findsearchbox();
        Thread.sleep(3000);
        extentLogger.info("Click Advanced Search");
        pages.topRightSearchBarPage().advancedsearch.click();
        Thread.sleep(3000);
        extentLogger.info("Click Filters");
        pages.topRightSearchBarPage().filters.click();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void selectFilter() throws InterruptedException {
        extentLogger = report.createTest("able to click Filter and select any available filters ");
        pages.login().BriteErpLink.click();
        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser"));
        extentLogger.info("Click on Sales module");
        pages.topRightSearchBarPage().sales.click();
        Thread.sleep(3000);
        extentLogger.info("Click search box");
        pages.topRightSearchBarPage().findsearchbox();
        Thread.sleep(3000);
        extentLogger.info("Click Advanced Search");
        pages.topRightSearchBarPage().advancedsearch.click();
        Thread.sleep(3000);
        extentLogger.info("Click Filters");
        pages.topRightSearchBarPage().filters.click();
        Thread.sleep(3000);
        extentLogger.info("Click My Orders");
       // pages.topRightSearchBarPage().myorders.click();
        Thread.sleep(3000);
    }
}