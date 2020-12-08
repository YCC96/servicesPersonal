package com.service.personal.servicesPersonal.model.customer.request;

public class CustomerRequest {

    private String id;
    private String name;
    private String firstSurname;
    private String lastSurname;
    private String age;
    private String gender;
    private String mail;
    private String telephone;
    private String updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getLastSurname() {
        return lastSurname;
    }

    public void setLastSurname(String lastSurname) {
        this.lastSurname = lastSurname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", lastSurname='" + lastSurname + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
    
}
