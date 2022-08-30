/*
 * Author Name : M.Krishna.
 * Date: 31-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class AMTD5 extends TypeOfTransmissions {
    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5) {
        super.gearRatio(gearRatio1, gearRatio2, gearRatio3, gearRatio4, gearRatio5);
    }

    public AMTD5() {
    }

    public AMTD5(String transmissionType, String modelNumber, int noOfForwardGears) {
        super(transmissionType, modelNumber, noOfForwardGears);
    }

    @Override
    public String toString() {
        return "AMTD5{} " + super.toString();
    }
}
