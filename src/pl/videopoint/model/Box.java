package pl.videopoint.model;

 abstract class Box {
    int numberOfProduct = 0;


    boolean takeProduct() {
        if (isEmpty()) {
            return false;
        }
        numberOfProduct--;
        return true;
    }

    boolean isEmpty() {
        return numberOfProduct <= 0;
    }

    abstract void filIt();
}
