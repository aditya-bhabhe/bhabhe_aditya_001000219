/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author adity
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patient p1 = new Patient();
        Scanner scan = new Scanner(System.in);
        boolean factor = true;
        System.out.println("Enter Patient Information.");
        System.out.println("Enter Patient Name.");
        p1.setPatientName(scan.next());
        System.out.println("Enter Patient Age.");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years.");
        i = scan.nextInt();
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months.");
            p1.setPatientAge(scan.nextFloat()/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years.");
            p1.setPatientAge(scan.nextFloat());
            System.out.println(p1.getPatientAge());
        }
        while(factor == true){
            System.out.println("Enter 0 for adding vitalsigns and 1 to complete the process.");
            int press = scan.nextInt();
            if(press == 0){
                factor = true;
            }else{
                factor = false;
            }
            if(press == 0){
              VitalSigns vs = p1.newVitalSigns();
        System.out.println("Enter patient's heart rate.");
        vs.setPatientHeartRate(scan.nextInt());
        System.out.println("Enter patient's respiratory rate.");
        vs.setPatientRespRate(scan.nextInt());
        System.out.println("Enter patient's blood pressure.");
        vs.setPatientBloodPressure(scan.nextDouble());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg.");
        int a = scan.nextInt();
        if(a == 0){
            System.out.println("Enter patient weight in pounds.");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight);
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg.");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
        }
        vs.setTime(new Date());
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        if(report == true){
            System.out.println("Patient is normal.");
        }else{
            System.out.println("Patient is abnormal.");
        }
//        System.out.println(report);
        System.out.println("----------------------------------------");
        System.out.println("Patient Name : " + p1.getPatientName());
        p1.printVitals();
        System.out.println("Enter patient's parameter to check whether they are in range.");
        System.out.println("1. Respiratory-Rate");
        System.out.println("2. Heart-Rate");
        System.out.println("3. Blood-Pressure");
        System.out.println("4. Weight-Kg");
        System.out.println("5. Weight-Pounds");
        System.out.println("----------------------------------------");
        String s = scan.next();
        p1.isThisVitalSignNormnal(s);
            }else{
                break;
            }
        }
        System.out.println("Program Ends");
        
    }
    
}
