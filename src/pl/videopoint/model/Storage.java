package pl.videopoint.model;

import pl.videopoint.model.exeptions.EmptyBoxException;

public class Storage {
    private static Storage storage;
    ChocolateBox chocolateBox;
    CoffeeBox coffeeBox;
    MilkBox milkBox;

    private Storage() {
        chocolateBox = new ChocolateBox();
        coffeeBox = new CoffeeBox();
        milkBox = new MilkBox();
        fillAll();
    }

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public void fillAll() {
        chocolateBox.filIt();
        coffeeBox.filIt();
        milkBox.filIt();
    }

    public void getCoffee() throws EmptyBoxException {
        if (!coffeeBox.takeProduct()) {
            throw new EmptyBoxException("kawa");
        }
    }

    public void getChocolate() throws EmptyBoxException {
        if (!coffeeBox.takeProduct()) {
            throw new EmptyBoxException("czekolada");
        }
    }

    public void getMilk() throws EmptyBoxException {
        if (!milkBox.takeProduct()) {
            throw new EmptyBoxException("mleko");
        }
    }

}
