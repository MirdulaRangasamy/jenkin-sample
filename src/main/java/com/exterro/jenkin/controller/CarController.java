/**
 * @Placed com.exterro.jenkin.controller
 */
package com.exterro.jenkin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.jenkin.model.Car;
import com.exterro.jenkin.service.CarService;

/**
 * @author MirdulaRangasamy
 *
 * @date 18 Aug 2025
 */
//@Controller
public class CarController {
//	@Autowired
//	private CarService carSvc;
//	
//	@RequestMapping("addCar")
//	@ResponseBody
//	public ResponseEntity<Car> addCar(Car car){
//		return ResponseEntity.ok(carSvc.addCar(car));
//	}
//	
//	@RequestMapping("viewCar")
//	@ResponseBody
//	public ResponseEntity<Car> viewCar(String regNo){
//		return ResponseEntity.ok(carSvc.getCar(regNo));
//	}
//	
//	@RequestMapping("viewAllCars")
//	@ResponseBody
//	public ResponseEntity<List<Car>> viewAllCars(){
//		return ResponseEntity.ok(carSvc.getAllCars());
//	}
//
//	@RequestMapping("updateCar")
//	@ResponseBody
//	public ResponseEntity<Car> updateCar(Car car){
//		return ResponseEntity.ok(carSvc.updateCar(car));
//	}
//	
//	@RequestMapping("deleteCar")
//	@ResponseBody
//	public ResponseEntity<String> deleteCar(String regNo){
//		return ResponseEntity.ok(carSvc.deleteCar(regNo));
//	}
}
