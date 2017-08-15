/**
 * Created by jc320680 on 15/08/17.
// */

import java.util.Scanner;

public class MetricConvesion {
    public static void main(String[] args) {
        double centimeters = 2.54;
        double liters = 3.7854;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("How many inches to centimeters");
        double inInch = inputDevice.nextDouble();
        inchesToCentimeters(centimeters, inInch);

        double inGallon = inputDevice.nextDouble();
        gallonsToLiters(liters, inGallon);


    }

    public static void inchesToCentimeters(double centimeters, double inInch){
        System.out.println(inInch/centimeters);
    }

    public static void gallonsToLiters(double liters, double inGallon){
        System.out.println(inGallon/liters);



    }
}
