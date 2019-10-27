/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA  : Riski Dwi Sabariyanto   
 * KELAS : IF 1
 * NIM   : 10118026
 * Deskripsi Program : Program ini untuk membuat tampilan vehicle.
 */
public class IF110118026Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        System.out.println("");
        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        System.out.println("Brand : "+skateboard.getMyBrand());
        System.out.println("Model : "+skateboard.getMyModel());
        System.out.println("Jumlah Gear : "+skateboard.getMyBoardLength());
    }
    
}
