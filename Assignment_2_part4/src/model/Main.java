/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adity
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonDirectory pd = new PersonDirectory();
        City c1 = new City();
        Community cm1 = new Community();
        Community cm2 = new Community();
        House h1 = new House();
        Person person1 = new Person();
        Patient p1 = new Patient();
        p1.setFirstName("Aditya");
        p1.setLastName("Bhabhe");
        p1.setAge(2);
        person1.setAge(p1.getAge());
        person1.setFirstName(p1.getFirstName());
        person1.setLastName(p1.getLastName());
        pd.setPerson(person1);
        Encounter e1 = p1.addEncounter();
        VitalSigns v1 = new VitalSigns();
        v1.setPatientBloodPressure(120);
        v1.setPatientHeartRate(90);
        v1.setPatientRespRate(25);
        v1.setPatientWeightKg(12);
        e1.setVitals(v1);
        h1.setPatient(p1);
        
        Patient p2 = new Patient();
        Person person2 = new Person();
        p2.setAge(5);
        p2.setFirstName("Zarana");
        p2.setLastName("Bhadricha");
        person2.setAge(p2.getAge());
        person2.setFirstName(p2.getFirstName());
        person2.setLastName(p2.getLastName());
        pd.setPerson(person2);
        Encounter e2 = p2.addEncounter();
        VitalSigns v2 = new VitalSigns();
        v2.setPatientBloodPressure(100);
        v2.setPatientHeartRate(120);
        v2.setPatientRespRate(22);
        v2.setPatientWeightKg(18);
        e2.setVitals(v2);
        Encounter e4 = p2.addEncounter();
        VitalSigns v4 = new VitalSigns();
        v4.setPatientBloodPressure(110);
        v4.setPatientHeartRate(119);
        v4.setPatientRespRate(30);
        v4.setPatientWeightKg(15);
        e4.setVitals(v4);
        h1.setPatient(p2);
        cm1.setHouse(h1);
        
        House h2 = new House();
        Patient p3 = new Patient();
        Person person3 = new Person();
        p3.setFirstName("Daniel");
        p3.setLastName("John");
        p3.setAge(0);
        person3.setAge(p3.getAge());
        person3.setFirstName(p3.getFirstName());
        person3.setLastName(p3.getLastName());
        pd.setPerson(person3);
        Encounter e3 = p3.addEncounter();
        VitalSigns v3 = new VitalSigns();
        v3.setPatientBloodPressure(40);
        v3.setPatientHeartRate(130);
        v3.setPatientRespRate(35);
        v3.setPatientWeightKg(2);
        e3.setVitals(v3);
        h2.setPatient(p3);
        
        Patient p4 = new Patient();
        Person person4 = new Person();
        p4.setAge(40);
        p4.setFirstName("Radhika");
        p4.setLastName("Reddy");
        person4.setAge(p4.getAge());
        person4.setFirstName(p4.getFirstName());
        person4.setLastName(p4.getLastName());
        pd.setPerson(person4);
        Encounter e5 = p4.addEncounter();
        VitalSigns v5 = new VitalSigns();
        v5.setPatientBloodPressure(125);
        v5.setPatientHeartRate(100);
        v5.setPatientRespRate(20);
        v5.setPatientWeightKg(18);
        e5.setVitals(v5);
        Encounter e6 = p4.addEncounter();
        VitalSigns v6 = new VitalSigns();
        v6.setPatientBloodPressure(130);
        v6.setPatientHeartRate(119);
        v6.setPatientRespRate(30);
        v6.setPatientWeightKg(15);
        e6.setVitals(v6);
        h2.setPatient(p4);
        cm1.setHouse(h2);
        c1.setCommunity(cm1);
     
        
        House h3 = new House();
        Patient p5 = new Patient();
        Person person5 = new Person();
        p5.setFirstName("Saurabh");
        p5.setLastName("Rathi");
        p5.setAge(2);
        person5.setAge(p5.getAge());
        person5.setFirstName(p5.getFirstName());
        person5.setLastName(p5.getLastName());
        pd.setPerson(person5);
        Encounter e7 = p5.addEncounter();
        VitalSigns v7 = new VitalSigns();
        v7.setPatientBloodPressure(120);
        v7.setPatientHeartRate(90);
        v7.setPatientRespRate(25);
        v7.setPatientWeightKg(12);
        e7.setVitals(v7);
        h3.setPatient(p5);
        
        Patient p6 = new Patient();
        Person person6 = new Person();
        p6.setAge(5);
        p6.setFirstName("Ritika");
        p6.setLastName("Kulkarni");
        person6.setAge(p6.getAge());
        person6.setFirstName(p6.getFirstName());
        person6.setLastName(p6.getLastName());
        pd.setPerson(person6);
        Encounter e8 = p2.addEncounter();
        VitalSigns v8 = new VitalSigns();
        v8.setPatientBloodPressure(100);
        v8.setPatientHeartRate(120);
        v8.setPatientRespRate(22);
        v8.setPatientWeightKg(18);
        e8.setVitals(v8);
        Encounter e9 = p6.addEncounter();
        VitalSigns v9 = new VitalSigns();
        v9.setPatientBloodPressure(110);
        v9.setPatientHeartRate(119);
        v9.setPatientRespRate(30);
        v9.setPatientWeightKg(15);
        e9.setVitals(v9);
        h3.setPatient(p6);
        cm2.setHouse(h3);
        
        House h4 = new House();
        Patient p7 = new Patient();
        Person person7 = new Person();
        p7.setFirstName("Jon");
        p7.setLastName("Doe");
        p7.setAge(11);
        person7.setAge(p7.getAge());
        person7.setFirstName(p7.getFirstName());
        person7.setLastName(p7.getLastName());
        pd.setPerson(person7);
        Encounter e10 = p7.addEncounter();
        VitalSigns v10 = new VitalSigns();
        v10.setPatientBloodPressure(120);
        v10.setPatientHeartRate(90);
        v10.setPatientRespRate(25);
        v10.setPatientWeightKg(12);
        e10.setVitals(v10);
        h4.setPatient(p7);
        
        Patient p8 = new Patient();
        Person person8 = new Person();
        p8.setAge(14);
        p8.setFirstName("Ameya");
        p8.setLastName("Ranade");
        person8.setAge(p8.getAge());
        person8.setFirstName(p8.getFirstName());
        person8.setLastName(p8.getLastName());
        pd.setPerson(person8);
        Encounter e11 = p8.addEncounter();
        VitalSigns v11 = new VitalSigns();
        v11.setPatientBloodPressure(100);
        v11.setPatientHeartRate(120);
        v11.setPatientRespRate(22);
        v11.setPatientWeightKg(18);
        e11.setVitals(v11);
        Encounter e12 = p8.addEncounter();
        VitalSigns v12 = new VitalSigns();
        v12.setPatientBloodPressure(110);
        v12.setPatientHeartRate(119);
        v12.setPatientRespRate(30);
        v12.setPatientWeightKg(15);
        e12.setVitals(v12);
        h4.setPatient(p8);
        cm2.setHouse(h4);
        c1.setCommunity(cm2);
        
        System.out.println("Total no of persons: " + pd.totalPerson());
        
        PatientDirectory pd1 = new PatientDirectory();
        pd1.addPatient(p1);
        pd1.addPatient(p2);
        pd1.addPatient(p3);
        pd1.addPatient(p4);
        pd1.addPatient(p5);
        pd1.addPatient(p6);
        pd1.addPatient(p7);
        pd1.addPatient(p8);
        
        
        System.out.println("Total Patients in directory: "+pd1.totalPatient());
        System.out.println("Number of patients with abnormal blood pressure in house 1: " + h1.abnormalCasesInHouse());
        System.out.println("Number of patients with abnormal blood pressure in house 2: " + h2.abnormalCasesInHouse());
        System.out.println("Number of patients with abnormal blood pressure in house 3: " + h3.abnormalCasesInHouse());
        System.out.println("Number of patients with abnormal blood pressure in house 4: " + h4.abnormalCasesInHouse());
        System.out.println("Number of patients with abnormal blood pressure in community 1: " + cm1.abnormalCasesInCommunity());
        System.out.println("Number of patients with abnormal blood pressure in community 2: " + cm2.abnormalCasesInCommunity());
        System.out.println("Number of patients with abnormal blood pressure in city: " + c1.abnormalCasesInCity());

    
    }
    
}
