package pl.videopoint.model;

class MilkBox extends Box {

    private static final int MAX_MILK = 15;

    @Override
    void filIt() {
        numberOfProduct = MAX_MILK;
    }
}
