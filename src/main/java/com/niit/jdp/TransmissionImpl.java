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
        ModelMP5 model2 = new ModelMP5("MANUAL", "MP5", 5);
        ModelMP6 model3 = new ModelMP6("MANUAL", "MP6", 6);
        ModelMP8 model4 = new ModelMP8("automatic", "automaticCVT", 8);
        System.out.println("Type Of Transmission Manual and Model Details = " + model1);
        model1.gearRatio(2.540f, 1.920f, 1.510f, 1.000f);
        System.out.println("model2 = " + model2);
        model2.gearRatio(1.22f, 5.22f, 5.22f, 5.22f, 6.224f);
        System.out.println("model3 = " + model3);
        model3.gearRatio(3.010f, 2.070f, 1.43f, 1.000f, 0.710f, 0.570f);
        System.out.println("model3 = " + model4);
        model4.gearRatio(4.714f, 3.143f, 2.106f, 1.667f, 1.356f, 1.000f, 5.678f, 6.789f);
    }
}
