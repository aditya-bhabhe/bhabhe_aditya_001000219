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
public class Encounter {
    private Date date = new Date();
    private VitalSigns vitals;

    public Date getDate() {
        return date;
    }
    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }
   
     
}
