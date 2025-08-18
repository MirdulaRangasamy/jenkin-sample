/**
 * @Placed com.exterro.jenkin.model
 */
package com.exterro.jenkin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author MirdulaRangasamy
 *
 * @date 18 Aug 2025
 */
@Entity
public class Car {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String regNo;
	private String owner;
	private String brand;
	private String model;
	private double cost;

	public Car(int id, String regNo, String owner, String brand, String model, double cost) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.owner = owner;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", regNo=" + regNo + ", owner=" + owner + ", brand=" + brand + ", model=" + model
				+ ", cost=" + cost + "]";
	}

}
