/**
 * @Placed com.exterro.jenkin.service
 */
package com.exterro.jenkin.service;

import java.util.List;

import com.exterro.jenkin.model.Car;

/**
 * @author MirdulaRangasamy
 *
 * @date 18 Aug 2025
 */
public interface CarService {
	public Car addCar(Car car);
	public Car getCar(String regNo);
	public List<Car> getAllCars();
	public Car updateCar(Car car);
	public String deleteCar(String regNo);
}
