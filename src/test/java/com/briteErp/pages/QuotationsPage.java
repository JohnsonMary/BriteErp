package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class QuotationsPage { // Avsar

    public QuotationsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Sales")
    public WebElement salesLink;

    @FindBy(linkText = "Quotations")
    public WebElement quoteLeft;

    @FindBy(linkText = "Orders")
    public WebElement ordersLeft;

    @FindBy(linkText = "Customers")
    public WebElement customersLeft;

    @FindBy(xpath = "//ol/li[@class='active' and 1]")
    public WebElement activeHeader;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[6]")
    public WebElement total;

    @FindBy(linkText = "Customer")
    public WebElement customer;

    @FindBy(linkText = "Products")
    public WebElement products;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//li[text()='New']")
    public WebElement newTextonHeader;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardBtn;

    @FindBy(linkText = "Contacts & Addresses")
    public WebElement contactAddressTab;

    @FindBy(linkText = "Internal Notes")
    public WebElement intNotesTab;

    @FindBy(linkText = "Sales & Purchases")
    public WebElement salesPurchaseTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[5]/ul/li[4]/a")
    public WebElement invoicingTab;

    @FindBy(xpath = "//div[text()='Fiscal Information']")
    public WebElement fiscalInfoText;


    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public WebElement anyCustomer;

    @FindBy(xpath = "//span[text()='Meetings']")
    public WebElement meetingsBtn;

    @FindBy(xpath = "//span[text()='All day']")
    public WebElement allDayText;

    @FindBy(xpath = "//*[@accesskey='k']")
    public WebElement thumbBtn;




    @FindBy(xpath = "//li[text()='Customers']")
    public WebElement customerHeaderText;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    public WebElement listBtn;

    @FindBy(xpath = "//th[text()='Name']")
    public WebElement nameText;

    @FindBy(xpath = "//th[text()='Phone']")
    public WebElement phoneText;

    @FindBy(xpath = "//th[text()='Email']")
    public WebElement emailText;

}
