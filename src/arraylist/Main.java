/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author Zephyrus
 */
public class Main {

    public static void main(String[] args) {
        CarRider rider1 = new CarRider ("Chopper", 20, "081212121212");
        CarRider rider2 = new CarRider ("Robin", 21, "082323232323");
        CarRider rider3 = new CarRider ("Nami", 22, "083434343434");
        CarRider rider4 = new CarRider ("Zoro", 23, "084545454545");
        
        CarData data = new CarData ();
        //inisiasi objek dan car data
        data.addCar("SEDAN", "B 1212 ABC", "Suzuki");
        data.addCar("OFF ROAD", "B 2323 DEF", "JEEP");
        data.addCar("SUV", "B 3434 GHI", "Honda");
        data.addCar("HATCHBACK", "B 4545 JKL", "Honda");
       
        data.listOfCar();
        
        RentArchieve archieve = new RentArchieve();
        archieve.Rent(rider1 , data.getCarList().get(0), 14);
        archieve.Rent(rider2, data.getCarList().get(1), 31);
        archieve.Rent(rider3, data.getCarList().get(2), 24);
        archieve.Rent(rider4, data.getCarList().get(3), 20);
        
        System.out.println();
        //menampilkan informasi dari rider
        archieve.info(); 
    }
    
}
