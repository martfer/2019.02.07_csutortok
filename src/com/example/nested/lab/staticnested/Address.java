package com.example.nested.lab.staticnested;


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


    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getStreet() {
        return street;
    }



    public static class AddressBuilder {

        private final Address address;

        public AddressBuilder() {
            this.address = new Address();
        }

        public Address build() {
            return address;
        }

        public AddressBuilder firstName(String firstName) {
            address.firstName = firstName;
            return this;
        }

        public AddressBuilder lastName(String lastName) {
            address.lastName = lastName;
            return this;
        }

        public AddressBuilder country(String country) {
            address.country = country;
            return this;
        }

        public AddressBuilder city(String city) {
            address.city = city;
            return this;
        }

        public AddressBuilder zip(String zip) {
            address.zip =zip;
            return this;
        }

        public AddressBuilder street(String street) {
            address.street = street;
            return this;
        }

    }
}
