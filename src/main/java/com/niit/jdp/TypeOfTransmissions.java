/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class TypeOfTransmissions extends Transmission implements TypeOfTransmission {

    public TypeOfTransmissions() {
    }

    public TypeOfTransmissions(String transmissionType, String modelNumber, int noOfForwardGears) {
        super(transmissionType, modelNumber, noOfForwardGears);
    }

    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4) {
        System.out.println("gearRatio1 = " + gearRatio1);
        System.out.println("gearRatio2 = " + gearRatio2);
        System.out.println("gearRatio3 = " + gearRatio3);
        System.out.println("gearRatio4 = " + gearRatio4);
    }

    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5) {
        System.out.println("gearRatio1 = " + gearRatio1);
        System.out.println("gearRatio2 = " + gearRatio2);
        System.out.println("gearRatio3 = " + gearRatio3);
        System.out.println("gearRatio4 = " + gearRatio4);
        System.out.println("gearRatio4 = " + gearRatio5);
    }

    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6) {
        System.out.println("gearRatio1 = " + gearRatio1);
        System.out.println("gearRatio2 = " + gearRatio2);
        System.out.println("gearRatio3 = " + gearRatio3);
        System.out.println("gearRatio4 = " + gearRatio4);
        System.out.println("gearRatio4 = " + gearRatio5);
        System.out.println("gearRatio4 = " + gearRatio6);

    }

    @Override
    public void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6, float gearRatio7, float gearRatio8) {
        System.out.println("gearRatio1 = " + gearRatio1);
        System.out.println("gearRatio2 = " + gearRatio2);
        System.out.println("gearRatio3 = " + gearRatio3);
        System.out.println("gearRatio4 = " + gearRatio4);
        System.out.println("gearRatio1 = " + gearRatio5);
        System.out.println("gearRatio2 = " + gearRatio6);
        System.out.println("gearRatio3 = " + gearRatio7);
        System.out.println("gearRatio4 = " + gearRatio8);
    }

    @Override
    public String toString() {
        return "ModelMP4{} " + super.toString();
    }
}
