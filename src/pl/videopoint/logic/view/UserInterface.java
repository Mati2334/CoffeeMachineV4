package pl.videopoint.logic.view;

import java.awt.font.ShapeGraphicAttribute;

public interface UserInterface {

    void showStep(String msg);

    void showError(String msg);

    void showCoffeeReady(String msg);

    void playSound();

}
