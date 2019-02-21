package com.example.nested.lab.inner;


public class Address {

    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private String zip;
    private String street;

    public static AddressBuilder builder() {
        Address addressInstance = new Address();
        return addressInstance.new AddressBuilder();
//        return new Address().new  AddressBuilder();
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



    public class AddressBuilder {

        public Address build() {
            return Address.this;
        }

        public AddressBuilder firstName(String fn) {
            firstName = fn;
            return this;
        }

        public AddressBuilder lastName(String lastName) {
            Address.this.lastName = lastName;
            return this;
        }

        public AddressBuilder country(String country) {
            Address.this.country = country;
            return this;
        }

        public AddressBuilder city(String city) {
            Address.this.city = city;
            return this;
        }

        public AddressBuilder zip(String zip) {
            Address.this.zip =zip;
            return this;
        }

        public AddressBuilder street(String street) {
            Address.this.street = street;
            return this;
        }

    }
}
