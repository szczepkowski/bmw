package pl.waw.great.bmw;

import java.time.LocalDate;

public class BmwX1 extends Car {

    private String vin;
    private String engine;
    private LocalDate productionDate;

    public BmwX1(String superVin, String vin, String engine, LocalDate productionDate) {
        super(superVin);
        this.vin = vin;
        this.engine = engine;
        this.productionDate = productionDate;
    }

    public BmwX1( ) {
    }

    @Override
    protected String getVin() {
        return vin;
    }

    public String getEngine() {
        return engine;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }
}
