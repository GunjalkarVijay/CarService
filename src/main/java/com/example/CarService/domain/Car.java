package com.example.CarService.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.CarService.repository.DAO;

/**
 1. Autowire dao and use the save method in saveVehicleDetails() function.
**/

@Component
public class Car implements Vehicle{

    // Kindly don't change the name of any variable & method as it will affect the test cases:

    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;
    
    @Autowired
    DAO carDao;

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer carId) {
        CarId = carId;
    }

    public String getRegisterationNumber() {
        return RegisterationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        RegisterationNumber = registerationNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarDetails() {
        return CarDetails;
    }

    public void setCarDetails(String carDetails) {
        CarDetails = carDetails;
    }

    public String getCarWork() {
        return CarWork;
    }

    public void setCarWork(String carWork) {
        CarWork = carWork;
    }

    @Override
    public Boolean saveVehicleDetails() {
       int id= carDao.save(this);
       System.out.println("saved"+id);
       return true;
    }

    @Override
    public void createVehicle(String RegistrationNumber, String CarName,String CarDetails,String CarWork ) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);
    }

}


