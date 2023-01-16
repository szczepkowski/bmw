package pl.waw.great.bmw;

public class Car {
    protected String vin;

    protected String getVin() {
        return vin;
    }

    public Car(String vin) {
        this.vin = vin;
    }

    public Car() {
    }
}
