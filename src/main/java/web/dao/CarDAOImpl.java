package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    private List<Car> carList;

    {
        carList = Arrays.asList(
                new Car("Volga", "black", 160),
                new Car("BMW", "red", 240),
                new Car("Audi", "white", 230),
                new Car("Tesla", "green", 250),
                new Car("Mazda", "pink", 220));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }


}
