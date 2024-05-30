
class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        ++this.speed;
    }

    public void brake() {
        --this.speed;
    }
}