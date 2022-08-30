package com.niit.jdp;

public interface TypeOfTransmission {

    /**
     * This function sets the gear ratios for the four motors
     *
     * @param gearRatio1 The gear ratio of the first gear.
     * @param gearRatio2 The gear ratio of the second gear.
     * @param gearRatio3 The gear ratio of the third gear.
     * @param gearRatio4 The gear ratio of the 4th gear.
     */
    void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4);

    /**
     * This function sets the gear ratios for the 5 gears
     *
     * @param gearRatio1 The gear ratio of the first gear.
     * @param gearRatio2 The gear ratio of the second gear.
     * @param gearRatio3 The gear ratio of the third gear.
     * @param gearRatio4 The gear ratio of the 4th gear.
     * @param gearRatio5 The gear ratio of the 5th gear.
     */
    void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5);

    /**
     * This function sets the gear ratios for the robot
     *
     * @param gearRatio1 The gear ratio of the first gear.
     * @param gearRatio2 The gear ratio of the second gear.
     * @param gearRatio3 The gear ratio of the third gear.
     * @param gearRatio4 The gear ratio of the 4th gear.
     * @param gearRatio5 The gear ratio of the 5th gear.
     * @param gearRatio6 The gear ratio of the 6th gear.
     */
    void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6);

    /**
     * This function sets the gear ratios for the 8 gears
     *
     * @param gearRatio1 The gear ratio of the first gear.
     * @param gearRatio2 The gear ratio of the second gear.
     * @param gearRatio3 The gear ratio of the third gear.
     * @param gearRatio4 The gear ratio of the 4th gear.
     * @param gearRatio5 The gear ratio of the 5th gear.
     * @param gearRatio6 The gear ratio of the 6th gear.
     * @param gearRatio7 Gear ratio of the 7th gear
     * @param gearRatio8 The gear ratio of the 8th gear.
     */
    void gearRatio(float gearRatio1, float gearRatio2, float gearRatio3, float gearRatio4, float gearRatio5, float gearRatio6, float gearRatio7, float gearRatio8);

}
