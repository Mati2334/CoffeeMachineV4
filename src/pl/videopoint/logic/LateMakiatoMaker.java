package pl.videopoint.logic;

import pl.videopoint.logic.view.UserInterface;

public class LateMakiatoMaker extends Maker {


    LateMakiatoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        boolean staturs = coffeeComponent.addComponent() && milkComponent.addComponent()&& chocolateComponent.addComponent();
        if(staturs){
            userInterface.showCoffeeReady("LatteMacchiato gotowe");
        }
    }
}
