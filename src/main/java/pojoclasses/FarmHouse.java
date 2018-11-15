package pojoclasses;

import java.util.ArrayList;

public class FarmHouse {

    private ArrayList<Person> person = new ArrayList<Person>();

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "person=" + person +
                '}';
    }
}
