package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDAO {

    public List<Car> getCarsAll();

    public List<Car> getCarsCount(int count);
}
