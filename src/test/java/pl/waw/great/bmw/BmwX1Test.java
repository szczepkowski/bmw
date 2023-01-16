package pl.waw.great.bmw;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BmwX1Test {

    @Test
    void inheritanceTest(){
        Object car3 = new BmwX1();
        BmwX1 car = (BmwX1) car3;
    }

    @Test
    void test() {

        List<BmwX1> cars = new ArrayList<>();
        BmwX1 bmwX1 = null;
        for (int i = 0; i < 10; i++) {
            bmwX1 = new BmwX1("", String.valueOf(i), "engine XX" + i, LocalDate.now());
            cars.add(bmwX1);
        }

        List<BmwX1> collect = cars.stream()
                .filter(car -> car.getVin().length() > 4)
                .collect(Collectors.toList());

        List<String> vins = cars.stream()
                .map((car) -> car.getVin())
                .collect(Collectors.toList());
    }
}