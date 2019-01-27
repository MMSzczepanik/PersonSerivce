package SDA;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private LocalDate data;
    private String email;
    private String password;

    public Person(String name, String lastName, LocalDate data, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.data = data;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", data=" + data +
                '}';
    }

    public int getAge(){
        LocalDate call = LocalDate.now();
        int year = call.getYear();
        int age = year - this.data.getYear();
        if(call.getMonthValue()<this.data.getMonthValue()){
            age -= 1;
        }else if(call.getMonthValue() == this.data.getMonthValue() && call.getDayOfMonth()<this.data.getDayOfMonth()){
            age-=1;
        }

        return age;
    }
}
