/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class TransmissionImpl {
    public static void main(String[] args) {
        TypeOfTransmissions model1 = new TypeOfTransmissions("manual", "mp4", 4);
        ModelMP5 model2 = new ModelMP5("MANUAL", "MP5", 5);
        System.out.println("Type Of Transmission Manual and Model Details = " + model1);
        model1.gearRatio(2.540f, 1.920f, 1.510f, 1.000f);
        System.out.println("model2 = " + model2);
        model2.gearRatio(1.22f, 5.22f, 5.22f, 5.22f, 6.224f);


    }
}
