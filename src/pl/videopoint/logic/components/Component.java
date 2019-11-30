package pl.videopoint.logic.components;

import pl.videopoint.logic.view.UserInterface;
import pl.videopoint.model.Storage;
import pl.videopoint.model.exeptions.EmptyBoxException;

abstract class Component {
    Storage storage;
    UserInterface userInterface;

    public Component(Storage storage, UserInterface userInterface) {
        this.storage = storage;
        this.userInterface = userInterface;
    }

    public final boolean addComponent() {
        boolean status = false;
        try {
            tryAddComponent();
            status = true;
        } catch (EmptyBoxException ebe) {
            userInterface.showError("Brak produktu " + ebe);
        } finally {
            userInterface.playSound();
        }
        return status;
    }

    abstract void tryAddComponent() throws EmptyBoxException;
}
