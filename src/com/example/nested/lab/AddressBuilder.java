package com.example.nested.lab;


public class AddressBuilder {

    private final Address address;

    public AddressBuilder() {
        this.address = new Address();
    }

    public Address build() {
        return address;
    }

    public AddressBuilder firstName(String firstName) {
        address.setFirstName(firstName); 
        return this;
    }

    public AddressBuilder lastName(String lastName) {
        address.setLastName(lastName);
        return this;
    }

    public AddressBuilder country(String country) {
        address.setCountry(country);
        return this;
    }

    public AddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder zip(String zip) {
        address.setZip(zip);
        return this;
    }
    
    public AddressBuilder street(String street) {
        address.setStreet(street);
        return this;
    }

}
