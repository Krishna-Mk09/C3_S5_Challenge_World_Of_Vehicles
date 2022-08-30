/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class TransmissionImpl {
    public static void main(String[] args) {
        ModelMP4 model1 = new ModelMP4("manual", "mp4", 4);
        model1.gearRatio(2.540f, 1.920f, 1.510f, 1.000f);
        System.out.println("Type Of Transmission Manual and Model Details = " + model1);


    }
}
