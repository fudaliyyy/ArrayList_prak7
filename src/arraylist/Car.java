/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author Zephyrus
 */
public class Car {

        //variabel global
        public String carType;
        public String polNum;
        public String merk;
        public boolean status;
        
        //konstruktor dengan parameter
        Car(String carType, String polNum, String merk, boolean status){
            this.carType = carType;
            this.polNum = polNum;
            this.merk = merk;
            this.status = status;
        }
        
        //konstruktor dengan parameter
        Car (String carType, String polNum, String merk){
            this.carType = carType;
            this.polNum = polNum;
            this.merk = merk;
        }
        
        //setter getter
        public String getCarType(){
            return carType;
        }
        
        public String getPolNum(){
            return polNum;
        }
        
        public String getMerk(){
            return merk;
        }
        
        public boolean isStatus(){
            return status;
        }
    }

