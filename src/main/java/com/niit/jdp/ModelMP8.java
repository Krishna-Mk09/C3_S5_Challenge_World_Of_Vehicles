/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class ModelMP8 extends TypeOfTransmissions {
    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6, float gearRatio7, float gearRatio8) {
        super.gearRatio(gearRatio1, gearRatio2, gearRatio3, gearRatio4, gearRatio5, gearRatio6, gearRatio7, gearRatio8);
    }

    public ModelMP8() {
    }

    public ModelMP8(String transmissionType, String modelNumber, int noOfForwardGears) {
        super(transmissionType, modelNumber, noOfForwardGears);
    }

    @Override
    public String toString() {
        return "ModelMP8{} " + super.toString();
    }
}
