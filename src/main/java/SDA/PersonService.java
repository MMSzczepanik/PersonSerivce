package SDA;

import java.util.*;

public class PersonService {

    private static int count = 0;
    private Map<Integer, Person> dictionary = new HashMap<>();

    public void add(Person person) {

        for (Person personTmp : dictionary.values()) {
            if (personTmp.getEmail().equals(person.getEmail())) {
                return;
            }
        }
        if(person.getPassword().length()>=8){
            dictionary.put(count++, person);
        }
    }

    public void delete(String name){
        List<Integer> intList = new ArrayList<>();

        for(Integer key : dictionary.keySet()){
            Person person = dictionary.get(key);
            if(person.getName().equals(name) || person.getLastName().equals(name)){
                intList.add(key);
            }
        }

        for(Integer i : intList){
            dictionary.remove(i);
        }
    }

    public void showDictionary(){
        for (Integer integer: dictionary.keySet()){
            System.out.println(dictionary.get(integer));
        }
    }

    public void edit(Integer i , Person person){
        dictionary.put(i,person);
    }


    public List<Person> getOlder(int age){
        List<Person> personList = new ArrayList<Person>();
        for(Person person : dictionary.values()){
            if(person.getAge()>age){
                personList.add(person);
            }
        }
        return personList;
    }

    public List<Person> getYounger(int age){
        List<Person> personList = new ArrayList<Person>();
        for(Person person : dictionary.values()){
            if(person.getAge()<age){
                personList.add(person);
            }
        }
        return personList;
    }

    public boolean log(String email, String password){
        for(Person person : dictionary.values()){
            if(person.getEmail().equals(email) && person.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}
