package pl.videopoint.model;

class ChocolateBox extends Box {

    private static final int MAX_CHOCOLATE = 10;

    @Override
    void filIt() {
        numberOfProduct = MAX_CHOCOLATE;
    }
}
