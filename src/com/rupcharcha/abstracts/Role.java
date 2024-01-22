package com.rupcharcha.abstracts;

public class Role {

    private String userName;
    private String password;
    private String email;
    private String address;


    public Role(String userName, String password, String email, String address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //login
    public void login(){
        ///TODO implement the login function here

    }

    //registration

    public void registration(){
        ///TODO implements the registration function here
    }
    @Override
    public String toString() {
        return "UserImpl{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
