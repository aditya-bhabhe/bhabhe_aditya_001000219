/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author adity
 */
public class VitalSigns {
    private int patientRespRate;
    private int patientHeartRate;
    private double patientBloodPressure;
    private double patientWeightKg;
    private double patientWeightPounds;
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getPatientRespRate() {
        return patientRespRate;
    }

    public double getPatientWeightPounds() {
        return patientWeightPounds;
    }

    public void setPatientWeightPounds(double patientWeightPounds) {
        this.patientWeightPounds = patientWeightPounds;
    }

    public void setPatientRespRate(int patientRespRate) {
        this.patientRespRate = patientRespRate;
    }

    public int getPatientHeartRate() {
        return patientHeartRate;
    }

    public void setPatientHeartRate(int patientHeartRate) {
        this.patientHeartRate = patientHeartRate;
    }

    public double getPatientBloodPressure() {
        return patientBloodPressure;
    }

    public void setPatientBloodPressure(double patientBloodPressure) {
        this.patientBloodPressure = patientBloodPressure;
    }

    public double getPatientWeightKg() {
        return patientWeightKg;
    }

    public void setPatientWeightKg(double patientWeightKg) {
        this.patientWeightKg = patientWeightKg;
    }
}
