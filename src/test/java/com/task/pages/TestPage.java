package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage{
    public TestPage(){
        PageFactory.initElements(Driver.get(), this);
    }



    public void clickCheckboxesInCell(String name) {
        String nameLocater = "//table//tr//td[1]//span[contains(.,'"+ name +"')]/..//span[contains(@class,'checkbox')]";
        Driver.get().findElement(By.xpath(nameLocater)).click();



    }

}
