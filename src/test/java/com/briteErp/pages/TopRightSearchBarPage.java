package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopRightSearchBarPage {

    public TopRightSearchBarPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Sales")
    public WebElement sales;

    @FindBy(xpath = "//input[@class = 'o_searchview_input']")
    public WebElement searchbox;

    @FindBy(linkText = "Quotations")
    public WebElement quotations;

    @FindBy(linkText = "Orders")
    public WebElement orders;

    @FindBy(linkText = "Customers")
    public WebElement customers;

    @FindBy(xpath = "//span[@class = 'o_searchview_more fa fa-search-plus']")
    public WebElement advancedsearch;

    @FindBy(xpath = "//span[@class = 'fa fa-filter']")
    public WebElement filters;




    public void findsearchbox() throws InterruptedException {
        Thread.sleep(5000);
        sales.click();
        searchbox.click();
    }

}