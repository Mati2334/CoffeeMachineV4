package pl.videopoint.logic.components;

import pl.videopoint.logic.view.UserInterface;
import pl.videopoint.model.Storage;
import pl.videopoint.model.exeptions.EmptyBoxException;

public class CoffeeComponent extends Component {

    public CoffeeComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getCoffee();
        userInterface.showStep("Kawa");
    }
}
