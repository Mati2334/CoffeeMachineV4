package pl.videopoint.ui;

import pl.videopoint.logic.CoffeeMachine;
import pl.videopoint.logic.LateMakiatoMaker;
import pl.videopoint.logic.view.UserInterface;

public class Main {
    public static void main (String[] args){
        System.out.println("Wybierz kawę: \n [E] - espresso\n [L] - latte");
        CoffeeMachine coffeeMachine;
        coffeeMachine = new LateMakiatoMaker(new AdvancedUi());
        coffeeMachine.makeCoffee();

    }

    private static class AdvancedUi implements UserInterface {
        @Override
        public void showStep(String msg) {
            System.out.println("-" + msg);
        }

        @Override
        public void showError(String msg) {
            System.out.println("##" + msg + "##");
        }

        @Override
        public void showCoffeeReady(String msg) {

        }

        @Override
        public void playSound() {

        }
    }
}
