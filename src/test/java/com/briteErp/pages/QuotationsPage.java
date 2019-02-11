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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[5]")
    public WebElement tableCellLeft;

    @FindBy(xpath = "//label[text()='Invoice Address']")
    public WebElement deliveryAddress;

    @FindBy(xpath = "//input[@class = 'o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[1]/div[2 and @class='oe_kanban_details']/strong[1 and @class='o_kanban_record_title oe_partner_heading']/span[1]\n")
    public WebElement customerBoxName;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//label[@class='o_form_label' and text()='Company']")
    public WebElement companyRadio;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement customerNameField;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/h1/span")
    public WebElement customerSavedName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement advancedSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button")
    public WebElement favoritesBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filters;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[8]/a")
    public WebElement addToMyDashboard;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[9]/input")
    public WebElement inputDashboard;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_add_to_dashboard_button']")
    public WebElement addBtn;

    @FindBy(linkText = "Dashboards")
    public WebElement dashLink;

    @FindBy(xpath = "//span[@class='oe_header_txt']\n")
    public WebElement dashHeader;

}
