package pl.videopoint.logic.components;

import pl.videopoint.logic.view.UserInterface;
import pl.videopoint.model.Storage;
import pl.videopoint.model.exeptions.EmptyBoxException;

public class MilkComponent extends Component {

    public MilkComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getMilk();
        userInterface.showStep("Mleko");
    }
}
