package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Corolla", 2018),
            new Car("BMW", "3 Series", 2020),
            new Car("Audi", "A4", 2019),
            new Car("Hyundai", "Elantra", 2021),
            new Car("Kia", "K5", 2022)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
