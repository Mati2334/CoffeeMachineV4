package pl.videopoint.logic;

import pl.videopoint.logic.view.UserInterface;

public class EspressoMaker extends Maker {


    EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        boolean staturs = coffeeComponent.addComponent();
        if(staturs){
            userInterface.showCoffeeReady("Espresso gotowe");
        }
    }
}
