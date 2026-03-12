import java.util.*;

public class Problem8ParkingLot {

    static String[] parking = new String[10];

    static int hash(String plate){
        return Math.abs(plate.hashCode()) % parking.length;
    }

    public static void parkVehicle(String plate){

        int index = hash(plate);

        while(parking[index]!=null){
            index = (index+1)%parking.length;
        }

        parking[index]=plate;
        System.out.println("Vehicle "+plate+" parked at "+index);
    }

    public static void exitVehicle(String plate){

        for(int i=0;i<parking.length;i++){
            if(plate.equals(parking[i])){
                parking[i]=null;
                System.out.println("Vehicle exited from spot "+i);
                return;
            }
        }
    }

    public static void main(String[] args){

        parkVehicle("ABC123");
        parkVehicle("XYZ999");
        exitVehicle("ABC123");
    }
}
