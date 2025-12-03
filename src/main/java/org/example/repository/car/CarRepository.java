package org.example.repository.car;

import org.example.model.Car;
import org.example.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends BaseRepository<Car> {
    Car save(Car car);

    Optional<Car> findById(Long id);

    List<Car> findAll();

    Car update(Car car);

    void deleteById(Long id);
}
