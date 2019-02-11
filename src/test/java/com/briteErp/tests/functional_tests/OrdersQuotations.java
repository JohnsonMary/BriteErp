package com.briteErp.tests.functional_tests;

import com.briteErp.pages.QuotationsPage;
import com.briteErp.utilities.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.transform.sax.SAXSource;
import java.util.concurrent.TimeUnit;

import static com.briteErp.utilities.ApplicationConstants.*;
import static com.briteErp.utilities.BrowserUtils.waitForPageToLoad;
import static org.testng.Assert.assertEquals;

public class OrdersQuotations extends TestBase { //Avsar

    String sumeyye = "Sumeyye Satilmis";
    String zubeyir = "Zubeyir Hubeyit";
    String searchText = "Zubeyir";
    String favText = "Leblebiciler";

    // Select favDrop = new Select(pages.quotationsPage().favoritesBtn);


   // @Test(priority = 1, timeOut = 200000, description = "Sales Manager gets the orders table after login.")
    public void plainLogin() throws InterruptedException {
        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2"));

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        Thread.sleep(5000);

        extentLogger.info("Active Header Match");
        BrowserUtils.verifyElementDisplayed(pages.quotationsPage().activeHeader);
        assertEquals(pages.quotationsPage().activeHeader.getText(), ApplicationConstants.ACTIVE_HEADER_ORDERS_QUOTATIONS);
    }

  //  @Test(priority = 2, timeOut = 200000, description = "Sales Manager sorts items ascending or descending by clicking on the headers.")
    public void sortHeaders() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        Thread.sleep(5000);

        extentLogger.info("Active Header Match");
        BrowserUtils.verifyElementDisplayed(pages.quotationsPage().activeHeader);
        assertEquals(pages.quotationsPage().activeHeader.getText(), ApplicationConstants.ACTIVE_HEADER_ORDERS_QUOTATIONS);

        System.out.println(pages.quotationsPage().activeHeader.getText());

        Driver.getDriver().navigate().refresh();

        extentLogger.info("Sort Descending");
        pages.quotationsPage().total.click();
        Thread.sleep(2000);

        extentLogger.info("Sort Ascending");
        pages.quotationsPage().total.click();

    }

  //  @Test(priority = 3, timeOut = 200000, description = "Sales Manager sees the New Customer form with fill-in sections")

    public void newCustomerWindow() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        Thread.sleep(5000);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        Thread.sleep(2000);

        extentLogger.info("Click on Create Customer");
        pages.quotationsPage().createBtn.click();
        Thread.sleep(3000);

        System.out.println(pages.quotationsPage().newTextonHeader.getText());

        extentLogger.info("Check if the Header Matches");
        Assert.assertTrue(pages.quotationsPage().newTextonHeader.getText().equals(NEW_ON_HEADER));

    }

   // @Test(priority = 4, timeOut = 200000, description = "SM switch bottom tabs titled; Contact & Addresses, Internal Notes, Sales & Puchases and Invoicing")

    public void bottomTabSwitch() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        Thread.sleep(5000);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        Thread.sleep(2000);

        extentLogger.info("Click on Create Customer");
        pages.quotationsPage().createBtn.click();
        Thread.sleep(3000);

        extentLogger.info("Click on Contacts & Addresses");
        pages.quotationsPage().contactAddressTab.click();
        Thread.sleep(1000);

        extentLogger.info("Click on Internal Notes");
        pages.quotationsPage().intNotesTab.click();
        Thread.sleep(1000);

        extentLogger.info("Click on Sales & Purchases");
        pages.quotationsPage().salesPurchaseTab.click();
        Thread.sleep(1000);

        extentLogger.info("Click on Invoicing");
        pages.quotationsPage().invoicingTab.click();
        Thread.sleep(2000);

        extentLogger.info("Check if the Fiscal Info Text displays");
        Assert.assertTrue(pages.quotationsPage().fiscalInfoText.isDisplayed());

    }

  //  @Test(priority = 5, timeOut = 200000, description = "SM can see the Meetings under the customer information window.")

    public void meetingsDisplay() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        Thread.sleep(5000);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        Thread.sleep(2000);

        extentLogger.info("Click on a random customer");
        pages.quotationsPage().anyCustomer.click();
        Thread.sleep(4000);

        extentLogger.info("Click on Meetings Box");
        pages.quotationsPage().meetingsBtn.click();
        Thread.sleep(2000);

        System.out.println(pages.quotationsPage().allDayText.getText());

        extentLogger.info("Check if the Calendar Opened referring to All Day");
        Assert.assertTrue(pages.quotationsPage().allDayText.isDisplayed());

    }

   // @Test(priority = 6, timeOut = 200000, description = "SM swithces to list and thumbnail view correctly.")

    public void listToThumb() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        BrowserUtils.wait(2);

        BrowserUtils.verifyElementDisplayed(pages.quotationsPage().customerHeaderText);
        BrowserUtils.wait(4);

        // Let's see the button text
        System.out.println(pages.quotationsPage().listBtn.getText());

        extentLogger.info("Click on List view under Customers");
        pages.quotationsPage().listBtn.click();

        extentLogger.info("Check if the header Name, Phone and Email becomes visible");
        Assert.assertTrue(pages.quotationsPage().nameText.isDisplayed()
                && pages.quotationsPage().phoneText.isDisplayed()
                && pages.quotationsPage().emailText.isDisplayed());
    }

    @Test(priority = 7, timeOut = 200000, description = "SM can open the order from the list and display the invoice with all fields.")

    public void displayOrder() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Go to Orders on the left");
        pages.quotationsPage().ordersLeft.click();
        BrowserUtils.wait(3);
        ;

        extentLogger.info("Click on the first cell on Orders List");
        pages.quotationsPage().tableCellLeft.click();
        BrowserUtils.wait(4);
        ;

        extentLogger.info("Check if Delivery Address becomes visible");
        Assert.assertTrue(pages.quotationsPage().deliveryAddress.isDisplayed());

    }

    @Test(priority = 8, timeOut = 200000, description = "SM swithces to list and thumbnail view correctly.")

    public void customerSearch() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        BrowserUtils.wait(2);

        BrowserUtils.verifyElementDisplayed(pages.quotationsPage().customerHeaderText);
        BrowserUtils.wait(4);


        extentLogger.info("Type in Seach Box");
        pages.quotationsPage().searchBox.sendKeys(sumeyye, Keys.RETURN);
        BrowserUtils.wait(2);

        extentLogger.info("Check if customer name mathces the search box chars");
        Assert.assertEquals(sumeyye, pages.quotationsPage().customerBoxName.getText());

    }

    @Test(priority = 9, timeOut = 200000, description = "SM can edit a customer")

    public void deleteCustomer() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(
                ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2")
        );

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Click on Customers");
        pages.quotationsPage().customersLeft.click();
        BrowserUtils.wait(2);

        BrowserUtils.verifyElementDisplayed(pages.quotationsPage().customerHeaderText);
        BrowserUtils.wait(4);

        extentLogger.info("Type in Seach Box");
        pages.quotationsPage().searchBox.sendKeys(sumeyye, Keys.RETURN);
        BrowserUtils.wait(3);

        extentLogger.info("Click and open the customer searched");
        pages.quotationsPage().customerBoxName.click();
        BrowserUtils.wait(3);

        extentLogger.info("Click on Edit");
        pages.quotationsPage().editBtn.click();

        extentLogger.info("Click on the Name Field and Enter a New Name");
        pages.quotationsPage().customerNameField.clear();

        pages.quotationsPage().customerNameField.sendKeys(zubeyir);
        BrowserUtils.wait(2);

        pages.quotationsPage().saveBtn.click();
        BrowserUtils.wait(4);

//       extentLogger.info("Check if customer name matches the saved name");
//       Assert.assertEquals(zubeyir,pages.quotationsPage().customerSavedName.getText());

        // save back to Sumeyye
        extentLogger.info("Click on Edit");
        pages.quotationsPage().editBtn.click();

        extentLogger.info("Click on the Name Field and Enter a New Name");
        pages.quotationsPage().customerNameField.clear();

        pages.quotationsPage().customerNameField.sendKeys(sumeyye);
        BrowserUtils.wait(2);

        pages.quotationsPage().saveBtn.click();

        extentLogger.info("Check if customer name matches the saved name");
        Assert.assertEquals(sumeyye, pages.quotationsPage().customerSavedName.getText());

    }

    @Test(priority = 10, timeOut = 200000, description = "SM can save Favorites and add to dashboard then recall.")
    public void test() throws InterruptedException {
        extentLogger = report.createTest("Home Page");
        pages.login().BriteErpLink.click();

        extentLogger.info("Main Login");
        pages.login().login(ConfigurationReader.getProperty("SMUser2"),
                ConfigurationReader.getProperty("SMPass2"));

        extentLogger.info("Go to Sales");
        pages.quotationsPage().salesLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Go to Quotations");
        pages.quotationsPage().quoteLeft.click();
        BrowserUtils.wait(4);

        extentLogger.info("Type in Search Box");
        pages.quotationsPage().searchBox.sendKeys(searchText, Keys.RETURN);
        BrowserUtils.wait(2);

        extentLogger.info("Open Advanced Search");
        pages.quotationsPage().advancedSearch.click();
        BrowserUtils.wait(3);

        extentLogger.info("Open Favorites");
        pages.quotationsPage().favoritesBtn.click();
        BrowserUtils.wait(3);

        extentLogger.info("Open Add to my Dashboard");
        pages.quotationsPage().addToMyDashboard.click();
        BrowserUtils.wait(3);

        extentLogger.info("Save the search on my Dashboard");
        pages.quotationsPage().inputDashboard.click();
        BrowserUtils.wait(1);
        pages.quotationsPage().inputDashboard.clear();
        BrowserUtils.wait(1);
        pages.quotationsPage().inputDashboard.sendKeys(favText, Keys.RETURN);
        BrowserUtils.wait(2);

        pages.quotationsPage().addBtn.click();
        BrowserUtils.wait(2);

        Driver.getDriver().manage().window().maximize();

        extentLogger.info("Open my Dashboard");
        pages.quotationsPage().dashLink.click();
        BrowserUtils.wait(2);

        extentLogger.info("Check to see Dashboard name matches the saved text");
        Assert.assertEquals(favText, pages.quotationsPage().dashHeader.getText());

    }
}
