package com.company;
/*
Создать класс с именем Address. В теле класса создать поля int index,String countru, String city,String street, int apartament
для каждого поля создать методы доступа set и get (изменение значения поля и получение значения поля соответствено)
Создать экземпляр класса Address. В пля записать информацию, вывести ее на экран.
 */
public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String apartament;

    //public Address(int index,String countru, String city,String street, int apartament){

    int getIndex(){
        return index;
    }
    void setIndex(int newIndex){
        index=newIndex ;
    }

    String getCountry(){
        return country;
    }
    void setCountry(String newCountru){
        country=newCountru;
    }
    String getCity(){
        return city;
    }
    void setCity(String newCity){
        city=newCity;
    }
    String getStreet(){
        return street;
    }
    void setStreet(String newStreet){
        street=newStreet;
    }
    String getApartament(){
        return apartament;
    }
    void setApartament(String newApartament){
        apartament=newApartament ;
    }






}