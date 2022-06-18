/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author Zephyrus
 */
public class CarRider {
    String name;
    int age;
    String phone;
    
    public CarRider(String name, int age, String phone){
        //inisiasi dari variabel lokal ke global
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    //membalikkan nilai String dan int
    public String getName(){
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getPhone() {
        return phone;
    }
}
