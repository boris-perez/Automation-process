package org.umssdiplo.automationv01.core.managepage.Machine;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Machine extends BasePage {
    @FindBy(id = "machines")
    private WebElement machineSection;

    @FindBy(id = "newMachine")
    private WebElement newMachine;

    @FindBy(id = "name")
    private WebElement names;

    @FindBy(id = "mark")
    private WebElement marks;

    @FindBy(id = "model")
    private WebElement models;

    @FindBy(id = "capacity")
    private WebElement capacity;

    @FindBy( css = "#capacity>option:nth-child(2)")
    private WebElement medium;

    @FindBy(id = "price")
    private WebElement prices;

    @FindBy(id = "description")
    private WebElement descriptions;

    @FindBy(id = "submit")
    private WebElement submit;

    public void machineSection() {
        CommonEvents.clickButton(machineSection);
        CommonEvents.clickButton(newMachine);
        }

    public void registerMachine(){
        String name = PropertyAccessor.getInstance().getName();
        String mark = PropertyAccessor.getInstance().getMark();
        String model = PropertyAccessor.getInstance().getModel();
        String price = PropertyAccessor.getInstance().getPrice();
        String description = PropertyAccessor.getInstance().getDescription();
        CommonEvents.setInputField(names, name);
        CommonEvents.setInputField(marks, mark);
        CommonEvents.setInputField(models, model);
        CommonEvents.clickButton(capacity);
        CommonEvents.clickButton(medium);
        CommonEvents.setInputField(prices, price);
        CommonEvents.setInputField(descriptions, description);
        CommonEvents.clickButton(submit);
    }
}
