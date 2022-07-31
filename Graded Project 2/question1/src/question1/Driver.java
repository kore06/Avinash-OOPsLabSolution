package question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        AssembleFloor assembleFloor = new AssembleFloor();
        ArrayList<Integer> floorArray=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building");

        int floors = sc.nextInt();

        for(int i=0;i<floors;i++){
            System.out.println("Enter the floor size given on day : " + (i+1));
            floorArray.add(sc.nextInt());
        }

        System.out.println("The order of construction is as follows");
        assembleFloor.assembleFloors(floorArray);
    }
}