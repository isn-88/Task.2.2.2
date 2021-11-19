package web.dao;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarsDAOImpl implements CarsDAO{
    private List<Car> cars;

    public CarsDAOImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", 9_800_000));
        cars.add(new Car("Audi", "Q5", 4_590_000));
        cars.add(new Car("Toyota", "Prado", 4_223_000));
        cars.add(new Car("Infinity", "QX55", 4_170_000));
        cars.add(new Car("Lexus", "RX", 4_156_000));
    }

    @Override
    public List<Car> getCarsAll() {
        return cars;
    }

    @Override
    public List<Car> getCarsCount(int count) {
        List<Car> selectCars;
        selectCars = cars.stream().limit(count).collect(Collectors.toList());
        return selectCars;
    }
}