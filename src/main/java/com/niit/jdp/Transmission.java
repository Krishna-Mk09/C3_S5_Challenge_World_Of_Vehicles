/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class Transmission {

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
}
