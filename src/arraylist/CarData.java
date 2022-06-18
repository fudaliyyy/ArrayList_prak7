/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Zephyrus
 */
public class CarData {
    //menampung data tipe data car
    public static ArrayList<Car> carList = new ArrayList<>();
    
    //fungsi untuk menambahkan mobil
    public void addCar (String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }
    
    //setter getter dr carlist
    public ArrayList<Car> getCarList(){
        return carList;
    }
    
    public void setCarList (ArrayList<Car> carList) {
        CarData.carList = carList;
    }
    
    //berisi data dr mobil
    public void listOfCar(){
        
        System.out.println("========================================");
        System.out.println("\t\t LIST MOBIL \t\t");
        
        System.out.println("========================================");
        for (Car data : CarData.carList){
            System.out.println("TIPE MOBIL  :" + data.getCarType());
            System.out.println("NO.POLISI   :" + data.getPolNum());
            System.out.println("MERK        :" + data.getMerk());
            
        System.out.println("----------------------------------------");
        }
    }
}