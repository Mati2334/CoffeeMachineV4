package pl.videopoint.model;

class CoffeeBox extends Box {

    private static final int MAX_COFFEE = 30;

    @Override
    void filIt() {
        numberOfProduct = MAX_COFFEE;
    }
}
