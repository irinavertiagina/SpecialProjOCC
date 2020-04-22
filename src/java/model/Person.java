
package model;

import java.io.Serializable;

 
public class Person implements Serializable{
    String lastName, firstName , password;
    int id;

    public Person(){}

    public Person(int id, String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }
    
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
