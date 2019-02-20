package com.example.nested.lab;


public class Address {

    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private String zip;
    private String street;

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }


    @Override
    public String toString() {
        return "Address{" + "firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", city=" + city + ", zip=" + zip + ", street=" + street + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    

}
