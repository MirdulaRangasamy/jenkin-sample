/**
 * @Placed com.exterro.jenkin.repository
 */
package com.exterro.jenkin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.jenkin.model.Car;

/**
 * @author MirdulaRangasamy
 *
 * @date 18 Aug 2025
 */
public interface CarRepository extends JpaRepository<Car, Integer>{
	public Optional<Car> findByRegNo(String regNo); 
}
