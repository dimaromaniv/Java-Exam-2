package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Thing> {

    public ArrayList<Thing> list;



    public Shelter() {
        this.list = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(Thing object) {
        this.list.add(object);

    }

    public Boolean contains(Thing object) {
        if(list.contains(object)) {
            return true;
        }else {return false;}
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return this.list.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return  list.indexOf(ageable);
    }
}