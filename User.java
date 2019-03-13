package com.bowling.edward.bowling;

public class User {

    private String firstname, surname, phone, email, password;

    public User(){

    }

    public User(String firstname, String surname, String password, String phone, String email){
        this.firstname = firstname;
        this.surname = surname;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }



}
