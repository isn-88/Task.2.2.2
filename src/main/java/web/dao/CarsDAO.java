package web.dao;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarsDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", 2020));
        cars.add(new Car("Audi", "Q5", 2019));
        cars.add(new Car("Toyota", "Prado", 2021));
        cars.add(new Car("Infinity", "QX55", 2021));
        cars.add(new Car("Lexus", "RX", 2020));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsCount(int count) {
        List<Car> selectCars;
        selectCars = cars.stream().limit(count).collect(Collectors.toList());
        return selectCars;
    }
}