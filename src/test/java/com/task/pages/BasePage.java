package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "button")
    public WebElement viewButton;


    @FindBy(xpath = "//span[.='Andrew is from Tacoma']")
    public WebElement originText;

    @FindBy(xpath = "(//table[@id='tabletreeGrid']//span)[20]")
    public WebElement dropDownIcon;


    public WebElement checkbox(String name) {
        String nameLocater = "//table//tr//td[1]//span[contains(.,'"+ name +"')]/..//span[contains(@class,'checkbox')]";
        return Driver.get().findElement(By.xpath(nameLocater));
    }

    public void clickDropIcon() {
        dropDownIcon.click();
    }

    public void clickViewButton() {
        viewButton.click();
    }



}


