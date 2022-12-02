/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person newPerson){        
        personList.add(newPerson);        
    }
    
    public void deletePerson(Person per){
        personList.remove(per);
    }
    
    public Person searchPerson(Person findPerson){
        for(int counterP=0 ; counterP < personList.size() ; counterP++){
            if(personList.get(counterP).equals(findPerson)){
        }
    }
        return findPerson;
    }
    
}
