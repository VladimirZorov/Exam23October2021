package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public String name;
    public int capacity;
    public List<Person> person;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        if (this.person.size()< this.capacity) {
            this.person.add(person);
        }
    }

    public boolean remove(String name){
        for (Person person : this.person) {
            if (person.getName().equals(name)){
                this.person.remove(name);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (Person person : this.person){
            if (person.getName().equals(name) && person.getHometown().equals(hometown)){
                return person;
            }
        }
        return null;
    }

    public int getCount(){
        return this.person.size();
    }

    public String getStatistics(){
        StringBuilder sB = new StringBuilder();
        sB.append("The people in the hotel "+name + " are:").append(System.lineSeparator());
        for (Person person : this.person) {
            sB.append(String.format("%s", person))
                    .append(System.lineSeparator());
        }
        return sB.toString().trim();
    }
}
