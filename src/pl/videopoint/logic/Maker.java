package pl.videopoint.logic;

import pl.videopoint.logic.components.ChocolateComponent;
import pl.videopoint.logic.components.CoffeeComponent;
import pl.videopoint.logic.components.MilkComponent;
import pl.videopoint.logic.view.UserInterface;
import pl.videopoint.model.Storage;

abstract class Maker implements CoffeeMachine {
    UserInterface userInterface;
    CoffeeComponent coffeeComponent;
    ChocolateComponent chocolateComponent;
    MilkComponent milkComponent;
    private boolean sugar;

    Maker(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void makeCoffee() {
        Storage storage = Storage.getInstance();
        chocolateComponent = new ChocolateComponent(storage, userInterface);
        coffeeComponent = new CoffeeComponent(storage, userInterface);
        milkComponent = new MilkComponent(storage, userInterface);
    }

    @Override
    public void addSugar() {
        sugar = true;
        userInterface.showStep("Dodano cukier");
    }

    @Override
    public void setUserInterface(UserInterface userInterface) {
        userInterface = userInterface;
    }
}
