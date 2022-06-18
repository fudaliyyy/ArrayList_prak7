/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author Zephyrus
 */
public class CarRent {
    //berisi objek car rider
    private CarRider rider;
    
    //berisi objek car
    private Car car;
    private int rentDur;
    
    //konstruktor dengan parameter
    public CarRent (CarRider rider, Car car, int rentDur){
        //inisiasi
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }
    
    //setter getter
    public CarRider getRider(){
        return rider;
    }
    
    public Car getCar(){
        return car;
    }
    
    public int getRentDur(){
        return rentDur;
    }
}
    
    