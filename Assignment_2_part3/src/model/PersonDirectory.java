/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class PersonDirectory {
    private ArrayList<Person> p = new ArrayList<>();
    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        p.add(person);
    }
    
    public int totalPerson(){
        return p.size();
    }
}
