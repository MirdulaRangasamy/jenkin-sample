/**
 * @Placed com.exterro.jenkin.service
 */
package com.exterro.jenkin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.jenkin.model.Car;
import com.exterro.jenkin.repository.CarRepository;

/**
 * @author MirdulaRangasamy
 *
 * @date 18 Aug 2025
 */
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepo;
	
	@Override
	public Car addCar(Car car) {
		return carRepo.save(car);
	}

	@Override
	public Car getCar(String regNo) {
		return carRepo.findByRegNo(regNo).orElseThrow();
	}

	@Override
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}

	@Override
	public Car updateCar(Car car) {
		Car car1 = carRepo.findByRegNo(car.getRegNo()).orElseThrow();
		car.setId(car1.getId()); 
		return carRepo.save(car);
	}

	@Override
	public String deleteCar(String regNo) {
		Optional<Car> car1 = carRepo.findByRegNo(regNo);
		if(car1.isPresent()) {
			carRepo.delete(car1.get());
			return "Car Details Deleted Successfully";
		}
		else {
			return "Car Details Unavailable";
		}
		
	}

}
