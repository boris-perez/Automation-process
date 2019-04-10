package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Machine.Machine;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMachine {
    private Machine machine;


    @Given("^Enter home$")
    public void enterHome() throws Throwable{
        machine = LoadPage.loginPage();
    }
    @And("^Go register section$")
    public void goRegisterSection() {
        machine.registerMachine();
    }

    @And("^Go to machine section$")
    public void goToMachineSection() throws Throwable {
        machine.machineSection();
    }

    @And("^Delete a machine$")
    public void deleteAMachine() throws Throwable{
        machine.deleteMachine();
    }

    @And("^Edit a machine$")
    public void editAMachine() {
        machine.editMachine();
    }
}
