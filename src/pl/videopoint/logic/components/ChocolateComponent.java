package pl.videopoint.logic.components;

import pl.videopoint.logic.view.UserInterface;
import pl.videopoint.model.Storage;
import pl.videopoint.model.exeptions.EmptyBoxException;

public class ChocolateComponent extends Component {

    public ChocolateComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getChocolate();
        userInterface.showStep("Czekolada");
    }
}
