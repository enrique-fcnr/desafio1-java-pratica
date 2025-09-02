package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    //CONSTRUTORES//
    public Client(){

    }
    public Client(String email, String name, Date bithDate) {
        this.email = email;
        this.name = name;
        this.birthDate = bithDate;
    }

    //GETTERS AND SETTERS//
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBithDate() {
        return birthDate;
    }
    public void setBirthDate(Date bithDate) {
        this.birthDate = bithDate;
    }

    //SAÍDA//
    public String toString(){
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
