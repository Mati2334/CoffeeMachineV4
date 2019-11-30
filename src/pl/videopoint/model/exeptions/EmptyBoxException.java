package pl.videopoint.model.exeptions;

public class EmptyBoxException extends Exception {

    public EmptyBoxException(String nameOfPeroduct) { super("Brak produktu: " + nameOfPeroduct);
    }
}
