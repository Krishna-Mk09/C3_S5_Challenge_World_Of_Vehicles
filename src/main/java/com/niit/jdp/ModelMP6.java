/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class ModelMP6 extends TypeOfTransmissions {
    public ModelMP6() {
    }

    public ModelMP6(String transmissionType, String modelNumber, int noOfForwardGears) {
        super(transmissionType, modelNumber, noOfForwardGears);
    }

    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6) {
        super.gearRatio(gearRatio1, gearRatio2, gearRatio3, gearRatio4, gearRatio5, gearRatio6);
    }

    @Override
    public String toString() {
        return "ModelMP6{} " + super.toString();
    }
}
