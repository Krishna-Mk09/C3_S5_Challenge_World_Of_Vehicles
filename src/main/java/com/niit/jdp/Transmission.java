/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public abstract class Transmission {

    private String transmissionType;
    private String modelNumber;
    private int noOfForwardGears;

    public Transmission() {
    }

    public Transmission(String transmissionType, String modelNumber, int noOfForwardGears) {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.noOfForwardGears = noOfForwardGears;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getNoOfForwardGears() {
        return noOfForwardGears;
    }

    public void setNoOfForwardGears(int noOfForwardGears) {
        this.noOfForwardGears = noOfForwardGears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transmissionType='" + transmissionType + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", noOfForwardGears=" + noOfForwardGears +
                '}';
    }

}
